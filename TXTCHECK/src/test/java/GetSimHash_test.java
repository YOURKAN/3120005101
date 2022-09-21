import org.junit.Test;
public class GetSimHash_test {
    @Test
    public void getHashTest(){
        String[] strings = {"知识", "就", "像", "海洋", "意志", "坚强的", "人"};
        for (String string : strings) {
            String stringHash = GetSimHash.getHash(string);
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String  txt1= Readtxt.read("D:/testtxt/orig.txt");
        System.out.println(GetSimHash.WeightedHash(txt1));
    }
}
