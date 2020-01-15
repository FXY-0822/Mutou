import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class Main{
    public static void main(String[] args) {
       try{
           readfile("c://a.xt");
       }
       catch (IOException e){
           e.printStackTrace();
       }
        System.out.println("异常捕获成功");
    }


private static void readfile(String filename)throws IOException{
        if (!filename.equals("c://a.txt")){
            throw new IOException("路径错误！");
        }
    System.out.println("路径正确！");
}

}
