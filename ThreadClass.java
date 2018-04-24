import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import javax.sql.rowset.Joinable;

// public class ThreadClass extends Thread{
//     private int i;

//     public void run(){
//         System.out.println("Overwride run function");
//         for(;i<100;i++){
//             System.out.println(getName()+" "+i);
//         }
//     }

//     public static void main(String[] args){
//         for(int i=0;i<100;i++){
//             System.out.println(Thread.currentThread().getName()+" "+i);
//             if(i == 20){
//                 new ThreadClass().start();
//                 new ThreadClass().start();
//             }
//         }
//     }
// }

// public class ThreadClass implements Runnable{
//     private int i;
//     public void run(){
//         for(;i<100;i++){
//             System.out.println(Thread.currentThread().getName()+" "+i);
//         }
//     }
//     public static void main(String[] args){
//         for(int i=0;i<100;i++){
//             System.out.println(Thread.currentThread().getName()+" "+i);
//             if(i==20){
//                 ThreadClass th = new ThreadClass();
//                 new Thread(th,"new Thread1").start();
//                 new Thread(th,"new Thread2").start();
//             }
//         }
//     }
// }

// public class ThreadClass implements Callable<Integer>{
//     public Integer call(){
//         int i = 0;
//         for(;i<100;i++){
//             System.out.println(Thread.currentThread().getName()+"de cycle i value:"+i);
//         }
//         return i;
//     }
//     public static void main(String[] args){
//         ThreadClass rt = new ThreadClass();
//         FutureTask<Integer> task = new FutureTask<Integer>(rt);
//         for(int i=0;i<100;i++){
//             System.out.println(Thread.currentThread().getName()+"de cycle i value:"+i);
//             if(i==20){
//                 new Thread(task,"Task with return value").start();
//             }
//         }
//         try{
//             System.out.println("Value of children Task:"+task.get());
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }
// 

// public class ThreadClass extends Thread{
//     public JoinThread(String name){
//         super (name);
//     }
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println(getName()+" "+i);
//         }
//     }
//     public static void main(String[] args){
//         new JoinThread("new Thread").start();
//         for(int i=0;i<100;i++){
//             if(i==20){
//                 JoinThread jt = new JoinThread("Thread of join");
//                 jt.start();
//                 jt.join();
//             }
//             System.out.println(Thread.currentThread().getName()+" "+i);
//         }
//     }
// }

