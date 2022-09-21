import org.junit.Test;

public class Runable_test {
    @Test
    public void SimilarityTest() {
        String Answer = "D:/testtxt/answer.txt";

        String str0 = Readtxt.read("D:/testtxt/orig.txt");
        String str1 = Readtxt.read("D:/testtxt/orig_0.8_add.txt");
        String str2 = Readtxt.read("D:/testtxt/orig_0.8_del.txt");
        String str3 = Readtxt.read("D:/testtxt/orig_0.8_dis_1.txt");
        String str4 = Readtxt.read("D:/testtxt/orig_0.8_dis_10.txt");
        String str5 = Readtxt.read("D:/testtxt/orig_0.8_dis_15.txt");

        String SimHash1 = GetSimHash.WeightedHash(str0);
        String SimHash2 = GetSimHash.WeightedHash(str1);
        String SimHash3 = GetSimHash.WeightedHash(str2);
        String SimHash4 = GetSimHash.WeightedHash(str3);
        String SimHash5 = GetSimHash.WeightedHash(str4);
        String SimHash6 = GetSimHash.WeightedHash(str5);

        double similarity1 = Similarity.getSimilarity(SimHash1, SimHash2);
        double similarity2 = Similarity.getSimilarity(SimHash1, SimHash3);
        double similarity3 = Similarity.getSimilarity(SimHash1, SimHash4);
        double similarity4 = Similarity.getSimilarity(SimHash1, SimHash5);
        double similarity5 = Similarity.getSimilarity(SimHash1, SimHash6);

        Writetxt.write(similarity1, Answer);
        Writetxt.write(similarity2, Answer);
        Writetxt.write(similarity3, Answer);
        Writetxt.write(similarity4, Answer);
        Writetxt.write(similarity5, Answer);

        System.out.println(similarity1);
        System.out.println(similarity2);
        System.out.println(similarity3);
        System.out.println(similarity4);
        System.out.println(similarity5);
    }
}
