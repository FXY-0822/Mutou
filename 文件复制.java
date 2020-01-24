import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream reader=new FileInputStream("D:\\迅雷下载\\a.txt");
        FileOutputStream puter=new FileOutputStream("D:\\a.txt");
        byte[] bytes=new byte[1024];
        int len=0;
         while ((len=reader.read(bytes))!=-1)
         {
            puter.write(bytes,0,len);
        }
        puter.close();
        reader.close();
    }
}
