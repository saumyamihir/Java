
// we can create Thread by two methods

// Thread Class
// Runnable Interface

// In Thread class -> java don't support multiple Inheritance.
// -> task + thread Creation both done single Thread.

// In Case Interface -> we Implements multiple Inheritance by Interface task and Thread 
// Creation done by Different Threads.


// import java.util.*;

// class MyThread extends Thread{
//     private int n;
//     MyThread(int n){
//         this.n=n;
//     }
//     //  this run method written inside Thread class.
//     public void run()
//     {
//         for(int i=1;i<=n;i++)
//         {
//             System.out.println(i + " "+ Thread.currentThread().getName());
//         }
//     }
// }
// public class MultiThread1{
//     public static void main(String[] args) {
//         Thread t1 = new MyThread(20);
//         Thread t2 = new MyThread(10);
//         // Creation of Thread
//         t1.start();
//         t2.start();
//     }
// }


import java.util.*;

class MyThread implements Runnable{
    private int n;
    MyThread(int n){
        this.n=n;
    }
    //  this run method written inside Thread class.
    public void run()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(i + " "+ Thread.currentThread().getName());
        }
    }
}
public class MultiThread1{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread(20));
        Thread t2 = new Thread(new MyThread(10));
        // Creation of Thread
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        // Join() -> excute both Thread one by one.
    }
}
