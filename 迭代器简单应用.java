import java.util.*;

public class InnerClassTest1  {
    public static void main(String[] args) {
       Collection<Integer> list=new ArrayList<>();
       list.add(5);
       list.add(4);
       list.add(3);
       list.add(2);
       Iterator<Integer> itor= list.iterator();
        for (int i=0;itor.hasNext();) {
            Integer a=itor.next();
            if (a==4){
                 itor.remove();
            }
        }
        for (Integer a :list ) {
            System.out.println(a);
        }

    }
}


