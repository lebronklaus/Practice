import java.lang.reflect.Field;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;

import com.sun.javafx.runtime.SystemProperties;
import com.sun.jndi.url.iiop.iiopURLContextFactory;

import java.lang.reflect.Array;


class Person{
    private String name;
    private int age;
    public String toString(){
        return "Person[name:"+name+",age:"+age+"]";
    }
}
public class Reflect{
    //public final int pi = 3.141592654;
    public static void main(String[] args)
        throws Exception {
        // Person p =new Person();
        // Class<Person> personClazz = Person.class;
        // Field nameField = personClazz.getDeclaredField("name");
        // nameField.setAccessible(true);
        // nameField.set(p,"Henry");
        // Field ageField = personClazz.getDeclaredField("age");
        // ageField.setAccessible(true);
        // ageField.setInt(p, 32);
        // System.out.println(p);

        // try{
        //     Object arr = Array.newInstance(String.class,10);
        //     Array.set(arr,5,"fengkuang");
        //     Array.set(arr,6,"java");
        //     Object book1 = Array.get(arr,5);
        //     Object book2 = Array.get(arr,6);
        //     System.out.println(book1);
        //     System.out.println(book2);
        // }catch(Throwable e){
        //     System.err.println(e);
            
        // }
        // Scanner in = new Scanner(System.in);
        // System.out.println("What's your name?");
        // String name = in.nextLine();

        // System.out.println("What's your age?");
        // int age = in.nextInt();

        // System.out.println("Hello: "+name+"you are :"+age+"years old!");

        // in.close();

        // Scanner in = new Scanner(Paths.get("file.txt"),"UTF-8");
        // while(in.hasNext()){
        //     System.out.println(in.nextLine());
        // }
        // in.close();
        int a[] = {1,5,9,3,7,8,6,4};
        // sort(a);
        for(int i:a){
           System.out.println(i);
        }
                   

    }
}