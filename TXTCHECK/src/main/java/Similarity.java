public class Similarity {
    public static double getSimilarity(String SimHash1, String SimHash2) {
        int distance = 0;
        for (int i = 0; i < SimHash1.length(); i++) {//逐位比较SimHash的值，不同时海明距离+1；
            if (SimHash1.charAt(i)!= SimHash2.charAt(i)) {
                distance++;
            }
        }
        return (100 - (distance * 100 / 128))*0.01;
    }
}
