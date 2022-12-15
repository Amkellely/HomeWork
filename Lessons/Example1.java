package Lessons;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
       /* MyTread1 t1 = new MyTread1();
        t1.setDaemon(true);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        int score = 1000;
        while (score >0){
            System.out.print('@');
            score--;
        }*/
        int v2 = (new Random()).nextInt(10);
        MyTread2 t2 = new MyTread2(v2);
        int v3 = (new Random()).nextInt(10);
        MyTread2 t3 = new MyTread2(v3);
        //t3.setDaemon(true);
        MyTread3 r4 = new MyTread3(v3);
        Thread t4 = new Thread(r4);

        t2.start();
        t3.start();
        t4.start();
        try{
            t2.join(10000);
        }
        catch (InterruptedException ex){}
        while (true){
            System.out.print('@');
        }

    }
}

class MyTread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.print('A');
        }
    }
}

class MyTread2 extends Thread {
    private int value;

    public MyTread2(int value) {
        this.value = value;
    }

    public MyTread2(Runnable target, int value) {
        super(target);
        this.value = value;
    }

    public MyTread2(ThreadGroup group, Runnable target, int value) {
        super(group, target);
        this.value = value;
    }

    public MyTread2(String name, int value) {
        super(name);
        this.value = value;
    }

    public MyTread2(ThreadGroup group, String name, int value) {
        super(group, name);
        this.value = value;
    }

    public MyTread2(Runnable target, String name, int value) {
        super(target, name);
        this.value = value;
    }

    public MyTread2(ThreadGroup group, Runnable target, String name, int value) {
        super(group, target, name);
        this.value = value;
    }

    public MyTread2(ThreadGroup group, Runnable target, String name, long stackSize, int value) {
        super(group, target, name, stackSize);
        this.value = value;
    }

    public MyTread2(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals, int value) {
        super(group, target, name, stackSize, inheritThreadLocals);
        this.value = value;
    }

    @Override
    public void run() {
        while (value >= 0) {
            System.out.println(" The thread" + Thread.currentThread().getName() +
                    "started with" + value);
            while (value >= 0) {
                System.out.println(" From" + Thread.currentThread().getName() +
                        " value =" + value);
                this.value -= 1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        }
        System.out.print(" The thread" + Thread.currentThread().getName()+
                " has finished");
    }
}
class MyTread3 extends Thread {
    private int value;

    public MyTread3(int value) {
        this.value = value;
    }

    public MyTread3(Runnable target, int value) {
        super(target);
        this.value = value;
    }

    public MyTread3(ThreadGroup group, Runnable target, int value) {
        super(group, target);
        this.value = value;
    }

    public MyTread3(String name, int value) {
        super(name);
        this.value = value;
    }

    public MyTread3(ThreadGroup group, String name, int value) {
        super(group, name);
        this.value = value;
    }

    public MyTread3(Runnable target, String name, int value) {
        super(target, name);
        this.value = value;
    }

    public MyTread3(ThreadGroup group, Runnable target, String name, int value) {
        super(group, target, name);
        this.value = value;
    }

    public MyTread3(ThreadGroup group, Runnable target, String name, long stackSize, int value) {
        super(group, target, name, stackSize);
        this.value = value;
    }

    public MyTread3(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals, int value) {
        super(group, target, name, stackSize, inheritThreadLocals);
        this.value = value;
    }

    @Override
    public void run() {
        while (value >= 0) {
            System.out.println(" The thread" + Thread.currentThread().getName() +
                    "started with" + value);
            while (value >= 0) {
                System.out.println(" From" + Thread.currentThread().getName() +
                        " value =" + value);
                this.value -= 1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        }
        System.out.print(" The thread" + Thread.currentThread().getName()+
                " has finished");
    }
}