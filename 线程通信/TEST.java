package Demon01;

import java.util.Objects;

public class TEST {
    public static void main(String[] args) {
        Runnable a=new Custom();//唯一的锁对象
        new Thread(a).start();
        new Thread(new Boss(a)).start();
    }
}
