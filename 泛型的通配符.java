import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class InnerClassTest1  {
    public static void main(String[] args) {
        ArrayList<Integer>list01=new ArrayList<>();
        ArrayList<String>list02=new ArrayList<>();
        list01.add(1);
        list01.add(2);

        list02.add("1");
        list02.add("2");
        InnerClassTest1 listprint=new InnerClassTest1();
        listprint.printlist(list01);
    }
    public void printlist(ArrayList<?> list){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
