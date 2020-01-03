import java.util.Date;

public class InnerClassTest1 extends Date {
    public void Gettime(Date dc){
        System.out.println(dc.getTime());
    }


    public static void main(String[] args) {
        InnerClassTest1 a=new InnerClassTest1();
        a.Gettime(new Date(){
            public long getTime(){
            return 11111;
            }
        });

        System.out.println(new Date().getTime());
    }
}
