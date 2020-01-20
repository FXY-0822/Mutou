package Demon01;

import java.util.Objects;

public class Custom implements Runnable{

    @Override
    public void run() {
        while (Boss.number>0)
            EatBaozi();
    }
    public synchronized void EatBaozi(){
        System.out.println("老板，我要一个包子");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
