import org.junit.Test;

public class Readtxt_test {

    @Test
    public void readTxtSuccedTest() {// 路径存在，正常读取
        String str = Readtxt.read("D:/testtxt/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
    @Test
    public void readTxtFailedTest() {// 路径不存在，读取失败
        String str = Readtxt.read("D:/testt/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
