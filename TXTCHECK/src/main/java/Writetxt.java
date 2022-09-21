import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Writetxt {
    public static void write(double txt2, String txt1) {
        String str = Double.toString(txt2);
        File file = new File(txt1);
        FileWriter Outputtxt = null;
        try {
            Outputtxt = new FileWriter(file, true);
            Outputtxt.write(str, 0, (str.length() > 3 ? 4 : str.length()));
            Outputtxt.write("\r\n");
            Outputtxt.close();
        } catch (IOException e) {
            System.out.println("文件输出路径出错，请检查输入");
            e.printStackTrace();
        }
    }
}

