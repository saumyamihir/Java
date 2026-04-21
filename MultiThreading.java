
// MultiThreading -> devide the one process in small process.
// execute Parallely.

// MultiThrreading Life cycle
 
// import java.util.*;
// class Mythread extends Thread {
//     //  we have predefined method run() -> we have to override it.
//     public void run()
//     {
//         System.out.println(Thread.currentThread().getName());
//         // Thread 0 , Thread1 , Thread3 any process it could be .
//     }

// }
// class MultiThreading {
//     public static void main(String[] args) {
//         Thread t1 = new Mythread();
//         // Creation of Thread Or New State of life cycle
//         t1.start();
//         // run the process on a JVM machine. 
//         // ready -> run -> block/wait -> terminated
//         Thread t2 = new Mythread();
//         t2.start();
//         // block /wait
//         // t1.join(); -> it will 
//         // t1.join() -> it will finsih t1 first then finish t2.
//         // t1.sleep(3000) -> wait 
//         // therminated -> all performing all task thread will be finish.
//     }
    
// }



// import java.util.*;
// class FoodTaskThread extends Thread{
//     private String chefname;
//     private String dishname;
//     // chef A -> pasta
//     // chef B -> rice
//     // chef C-> Noodles
//     // chef D -> Momos
//     FoodTaskThread(String chefname, String dishname)
//     {
//         this.chefname = chefname;
//         this.dishname = dishname;
//     }
//     //  ovrride this method in our Thread class.

//     public void run()
//     {
//         System.out.println(chefname + " Prepare " + dishname + "  "+ Thread.currentThread().getName());
//     }
// }
// class MultiThreading {
//     public static void main(String[] args) {
//         Thread t1 = new FoodTaskThread("Sami "," pasta");
//         Thread t2 = new FoodTaskThread("Mihir "," rice");
//         Thread t3 = new FoodTaskThread("Saumya "," Noodles");
//         Thread t4 = new FoodTaskThread("Satyarth "," Momos");
//         t1.start();
//         t1.join();

//         t2.start();
//         t2.join();

//         t3.start();
//         t3.join();

//         t4.start();
//         t4.join();

//     }
// }

// -------------------------------QUESTION ******************************************************
// you have to print no 1 to 10 -> t1
// you have to print no 1 to 20 -> t2

// create two thread t1 and t2
// write a program of multiThredaing.

// import java.util.*;
// class NumberThread extends Thread{
//     private int a;
//     NumberThread(int a)
//     {
//         this.a = a;
//     }
//     public void run()
//     {
//         for(int i = 1; i <= a; i++)
//         {
//             System.out.println(i + " " + Thread.currentThread().getName());
//         }
//     }   
// }
// class MultiThreading {
//     public static void main(String[] args) {
//         Thread t1 = new NumberThread(10);
//         Thread t2 = new NumberThread(20);
//         t1.start();
//         t2.start();
//     }
// }


// import java.util.*;
// class NumberThread implements Runnable{
//     private int a;
//     NumberThread(int a)
//     {
//         this.a = a;
//     }
//     public void run()
//     {
//         for(int i = 1; i <= a; i++)
//         {
//             System.out.println(i + " " + Thread.currentThread().getName());
//         }
//     }   
// }
// class MultiThreading {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new NumberThread(10));
//         Thread t2 = new Thread(new NumberThread(20));
//         t1.start();
//         t2.start();
//     }
// }

// Thread -> task + thread both done same thread class.
// in case Thread we can not use multiple inheritance.
// Runnable -> task and thread both done by different class.
// Runnable is interface with help of Runnable we can implements multiple inheritance.


// import java.util.*;
// class NumberThread extends Thread{
//     private int start;
//     private int end;

//     NumberThread(int start , int end)
//     {
//         this.start = start;
//         this.end = end;
//     }
//     public void run()
//     {
//         for(int i = start; i <= end; i++)
//         {
//             System.out.println(i + " print by " + Thread.currentThread().getName());
//         }
//     }   
// }
// class MultiThreading {
//     public static void main(String[] args) throws InterruptedException {
//         Thread t1 = new NumberThread(1,50);
//         Thread t2 = new NumberThread(51,100);
//         t1.start();
//         t1.join();

//         t2.start();
//         t2.join();
//     }
// }


// import java.util.*;
// class NumberThread implements Runnable{
//     private int start;
//     private int end;

//     NumberThread(int start , int end)
//     {
//         this.start = start;
//         this.end = end;
//     }
//     public void run()
//     {
//         for(int i = start; i <= end; i++)
//         {
//             System.out.println(i + " print by " + Thread.currentThread().getName());
//         }
//     }   
// }
// class MultiThreading {
//     public static void main(String[] args) throws InterruptedException {
//         Thread t1 = new Thread(new NumberThread(1,50));
//         Thread t2 = new Thread(new NumberThread(51,100));
//         t1.start();
//         t1.join();

//         t2.start();
//         t2.join();
//     }
// }