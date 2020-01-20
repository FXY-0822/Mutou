package Demon01;

import java.sql.DatabaseMetaData;
import java.util.Scanner;

public class Boss implements Runnable {
    public static int number=5;
    public final Custom a;
    public Boss(Runnable a){
        this.a=(Custom) a;
    }
    @Override
    public void run() {
       while (number>0){
           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           synchronized (a){
               number--;
               System.out.println("做好了,吃吧  还剩"+number+"个");
                a.notify();
           }
       }

    }

}
