import org.junit.Test;
public class Similarity_test {
    @Test
    public void SimilarityTest() {
        String str0 = Readtxt.read("D:/testtxt/orig.txt");
        String str1 = Readtxt.read("D:/testtxt/orig_0.8_add.txt");
        String SimHashOne = GetSimHash.WeightedHash(str0);
        String SimHashTwo = GetSimHash.WeightedHash(str1);
        System.out.println("相似度: " + Similarity.getSimilarity(SimHashOne, SimHashTwo));
    }
}
