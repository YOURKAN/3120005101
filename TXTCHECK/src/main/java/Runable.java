import java.util.Scanner;
public class Runable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入原文路径:");
        String Readtxt1= sc.next();
        System.out.println("输入抄袭文章路径:");
        String Readtxt2= sc.next();
        System.out.println("输入结果输出路径:");
        String Writetxt1= sc.next();

        String DvtxtOne = Readtxt.read(Readtxt1);
        String DvtxtTwo = Readtxt.read(Readtxt2);//读取TXT文档内容

        String SimHashOne = GetSimHash.WeightedHash(DvtxtOne);
        String SimHashTwo = GetSimHash.WeightedHash(DvtxtTwo);//计算SimHash值

        double similarity = Similarity.getSimilarity(SimHashOne, SimHashTwo);
        Writetxt.write(similarity, Writetxt1);//将结果输出至输出文档中
        System.out.println("论文查重算法已运行完毕，结果于输出文件中查看");
    }
}
