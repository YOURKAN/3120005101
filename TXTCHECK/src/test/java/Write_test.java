import org.junit.Test;
public class Write_test {
    @Test
    public void readTxtSuccedTest() {// 路径存在，正常输出
    int test1=1;
     Writetxt.write(test1,"D:/testtxt/answer.txt");
    }

    @Test
    public void readTxtFailedTest() {// 路径不存在，输出失败
        int test2=2;
            Writetxt.write(test2,"D:/testtt/answer.txt");
    }
}
