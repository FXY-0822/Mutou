public interface myinterface {
    void methon();
    default void methon2(){
        System.out.println("ss");
    }
    static void methon3(){
        System.out.println("aa");
    }
}
public class test
{
    public static void main(String[] args) {
        interfaceabs a=new interfaceabs();
        a.methon();
        a.methon2();
        myinterface.methon3();
    }
}
