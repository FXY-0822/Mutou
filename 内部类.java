public class Body {

    public class heart{
        public void methon(){
            System.out.println("qwe");
        }
    }
    
    public Body.heart methons(){
        System.out.println("asd");
        return new heart();
    }

}
public class test {
    public static void main(String[] args) {
        Body.heart a=new Body().new heart();
        a.methon();
        Body b=new Body();
        Body.heart c=b.methons();
    }
}
