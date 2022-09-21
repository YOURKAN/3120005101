import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import com.hankcs.hanlp.HanLP;
public class GetSimHash {
    public static String getHash(String str){  //该子函数用于获得读入文本的Hash值
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("MD5"); // Hash算法使用MD5算法容易计算，切出错率低；
            return new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8"))).toString(2);//文档统一转换为UTF-8格式，便于处理
        }
        catch(Exception e){
            System.out.println("转换出现错误");
            return str;
        }
    }

    public static String WeightedHash(String str){ //该子函数用于获得加权后的Hash值
        String SimHash = "";
        List<String> DvwordList = HanLP.extractKeyword(str, str.length());//此处调用外部LanLP的jar包中的库函数对读入的文本进行分词处理并保存为string类；
        int weight = DvwordList.size()/10;
        int i = 0;//定义变量weight和i存放权重计算的平衡值与变量
        int[]Hashss=new int[128];//定义Hash值的位数为64位；
        for(String Dvword : DvwordList){
            String DvwordHash = getHash(Dvword);   //我们拿到了hash值
            if (DvwordHash.length() < 128) {//当获得的hash值的位数不足64位时，为其补0以便统一后面的运算；
                int LessValue =128-DvwordHash.length();
                for (int j=0;j<LessValue;j++) {
                    DvwordHash +="0";
                }
            }

            for (int j = 0; j < Hashss.length; j++) {//该For循环为加权操作；
                if (DvwordHash.charAt(j) == '1')
                {Hashss[j] += (10-(i/weight));}
                else
                {Hashss[j] -= (10-(i/weight));}
            }
            i++;
        }
        for (int j = 0; j < Hashss.length; j++) {//该for循环为实现降维操作，形成只由01组成的SimHash值；
            if (Hashss[j] <= 0)
            {
                SimHash += "0";
            } else {
                SimHash += "1";
            }
        }
        return SimHash;
    }
}