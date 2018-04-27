import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

import javax.sql.rowset.Joinable;

import com.sun.java.util.jar.pack.Package.Class.Method;
import com.sun.javafx.runtime.SystemProperties;
import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

import sun.misc.Launcher;
import sun.security.jgss.spi.MechanismFactory;

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

// class MyTest{
//     static{
//         System.out.println("MyTest类的静态初始化块");
//     }
//     static final String compileConstant = System.currentTimeMillis() + "fengkaungJAVA";
// }
// public class ThreadClass{
//     public static void main(String[] args)throws ClassNotFoundException{
//         // System.out.println(MyTest.compileConstant);
//         ClassLoader cl = ClassLoader.getSystemClassLoader();
//         cl.loadClass("MyTest");
//         System.out.println("系统加载MyTest类");
//         Class.forName("MyTest");
//     }
// }

// public class ThreadClass{

//     public static void main(String[] args)
//     throws IOException{
//         // URL[] urls = Launcher.getBootstrapClassPath().getURLs();
//         // for(int i=0;i<urls.length;i++){
//         //     System.out.println(urls[i].toExternalForm());
//         // }
//         ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
//         System.out.println("系统类加载器："+systemLoader);
//         Enumeration<URL> eml = systemLoader.getResources("");
//         while(eml.hasMoreElements()){
//             System.out.println(eml.nextElement());
//         }
//         ClassLoader extensionLader = systemLoader.getParent();
//         System.out.println("扩展类加载器："+extensionLader);
//         System.out.println("扩展类加载器的加载路径："+System.getProperty("java.ext.dirs"));
//         System.out.println("扩展类加载器的parent："+extensionLader.getParent);

//     }


// }
// @SuppressWarnings(value="unchecked")
// @Deprecated
public class ThreadClass{
    private ThreadClass(){}
    private ThreadClass(String name){
        System.out.println("zhixing youcan gouzaoqi");
    }
    public void info(){
        System.out.println("zhixing wucan info fangfa");
    }
    public void info(String str){
        System.out.println("zhixing youcan fangfa,str="+str);
    }
    class Inner{}
    public static void main(String[] args)
        throws Exception{
        // Class<ThreadClass> calzz = ThreadClass.class;
        // Constructor[] ctors = calzz.getDeclaredConstructors();
        // System.out.println("ThreadClass de quanbugouzaoqi:");
        // for(Constructor c:ctors){
        //     System.out.println(c);
        // }
        // Constructor[] pctors = calzz.getConstructors();
        // System.out.println("ThreadClass de quanbu public gouzaoqi:");
        // for(Constructor pc:pctors){
        //     System.out.println(pc);
        // }
        // Method[] mtds = calzz.getMethods();
        // System.out.println("ThreadClass de quanbu public fangfa:");
        // for(Method m:mtds){
        //     System.out.println(m);
        // }

        Class <?> jFrameClazz = Class.forName("javax.swing.JFrame");
        Constructor ctor = jFrameClazz.getConstructor(String.class);
        Object obj = ctor.newInstance("ceshichuangkou");
        System.out.println(obj);


    }

}