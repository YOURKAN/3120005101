import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Readtxt {
    public static String read(String txt) {
        String str = "";
        String txtLine;// 将txt文件内容按行读入str中
        File file = new File(txt);//文件绝对路径
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 字符串拼接
            while ((txtLine = bufferedReader.readLine()) != null) {
                str += txtLine;
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("文件读取出错，请检查你的输入路径是否正确");
            e.printStackTrace();
        }
        return str;
    }
}