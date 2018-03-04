import java.awt.Button;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.rmi.Remote;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.javafx.runtime.SystemProperties;

// import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;



public class JavaClass{
	public static void main(String[] args)
	throws Exception {
		// Map<String,String> env = System.getenv();
		// for (String name : env.keySet()) {
		// 	System.out.println(name+"-->"+env.get(name));
		// }
		// System.out.println("--------------");
		// System.out.println(System.getenv("JAVA_HOME"));
		// Properties props = System.getProperties();
		// props.store(new FileOutputStream("props.txt"), "System Properties");
		// System.out.println(System.getProperty("os.name"));

		// Runtime rt = Runtime.getRuntime();
		// System.out.println("Processer: "+rt.availableProcessors());
		// System.out.println("free memory: "+rt.freeMemory());
		// System.out.println("total memory: "+rt.totalMemory());
		// System.out.println("max memory: "+rt.maxMemory());

		// rt.exec("calc");

		// Date d1 = new Date();
		// Date d2 = new Date(System.currentTimeMillis()+1000);
		// System.out.println("d1: "+d1);
		// System.out.println("d2: "+d2);
		// System.out.println(d1.compareTo(d2));
		// System.out.println(d1.compareTo(d1));
		// System.out.println(d1.before(d2));

		// Calendar calendar = Calendar.getInstance();
		// System.out.println(calendar.get(1));
		// System.out.println(calendar.get(2));
		// System.out.println(calendar.get(3));
		
		// calendar.set(2017,12,25,12,13,14);
		// System.out.println(calendar.getTime());

		// String[] ids = TimeZone.getAvailableIDs();
		// System.out.println(Arrays.toString(ids));
		// TimeZone my = TimeZone.getDefault();
		// System.out.println(my.getID());
		// System.out.println(my.getDisplayName());

		// Pattern p = Pattern.compile("a*b");
		// Matcher m = p.matcher("aaaaab");
		// System.out.println(m.matches());

		// Matcher m = Pattern.compile("\\w+").matcher("Java is very good!");
		// while(m.find()){
		// 	//System.out.println(m.group());
		// 	System.out.println(m.group()+" start: "+m.start()+",end: "+m.end());
		// }

		// System.out.println("-----------");

		// int i=0;
		// while(m.find(i)){
		// 	System.out.println(i+"->"+m.group()+"\t");
		// 	i++;
		// }

		// String[] mails = {"aed@126.com","xhy@gmail.com","ded@nwafu.org","haha@edu.cn"};
		// String mailRegEx = "\\w{3,20}@\\w+\\.(com|cn|net|edu|edu.cn)";
		// Pattern mailPattern = Pattern.compile(mailRegEx);
		// Matcher matcher = null;
		// for (String mail : mails) {
		// 	if(matcher == null){
		// 		matcher = mailPattern.matcher(mail);
		// 	}else{
		// 		matcher.reset(mail);
		// 	}
		// 	String result = mail+(matcher.matches()?" is ":" isn't "+"a available e-mail address!");
		// 	System.out.println(result);
		// }

		// String str = "result,replace,respect";
		// System.out.println(str.replaceAll("re\\w*", "xx-"));

		// Date d = new Date();
		// System.out.println(d);
		// SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy���е�D��");
		// String dateStr =  sdf1.format(d);
		// System.out.println(dateStr);

		// String str = "07###����##21";
		// SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM##d");
		// System.out.println(sdf2.parse(str));
		

		// Collection books = new HashSet();
		// books.add("??"));
		// books.add("Java"));
		// books.add("??"));

		// for (Object object : books) {
		// 	String book = (String) object;
		// 	System.out.println(book);
					
		// }
		// System.out.println(books);

		// LinkedHashSet books = new LinkedHashSet();
		// books.add("fengkuang");
		// books.add("java");
		// System.out.println(books);
		// books.remove("java");
		// books.add("Java");
		// System.out.println(books);

		// TreeSet nums = new TreeSet();
		// nums.add(5);
		// nums.add(-9);
		// nums.add(10);
		// nums.add(2);
		// System.out.println(nums);
		// System.out.println(nums.first());
		// System.out.println(nums.last());
		// System.out.println(nums.lower(5));
		// System.out.println(nums.higher(2));
		// System.out.println(nums.headSet(4));
		// System.out.println(nums.tailSet(4));
		// System.out.println(nums.subSet(-3,4));

		// List books = new ArrayList();
		// books.add("fengkuang");
		// books.add("Java");
		// books.add("jiangyi");
		// System.out.println(books);

		// books.add(1,"Android");
		// for(int i=0;i<books.size();i++){
		// 	System.out.println(books.get(i));
		// }
		// books.remove(2);
		// System.out.println(books);
		// System.out.println(books.indexOf("Android"));
		// books.set(1,"XAML");
		// System.out.println(books);
		// System.out.println(books.subList(1,2));

		// String str="hello";
		// str+="%";
		// System.out.println(str);

		// List books = new ArrayList();
		// books.add(new String("qingliang JAVA"));
		// books.add(0,"fengkuang JAVA");
		// System.out.println(books);
		// System.out.println(books.remove(1));
		// List lang = new ArrayList<>();
		// lang.add(0,"C");
		// lang.add(1,"PHP");
		// lang.add(2,"Python");
		// books.addAll(lang);
		// System.out.println(books);

		// String [] books ={"JAVA","Android"};
		// List bookList = new ArrayList<>();
		// for(int i=0;i<books.length;i++){
		// 	bookList.add(books[i]);
		// }
		// ListIterator lit = bookList.listIterator();
		// while(lit.hasNext()){
		// 	System.out.println(lit.next());
		// 	lit.add("----------------");
		// }
		// System.out.println("==============reverse====");
		// while(lit.hasPrevious()){
		// 	System.out.println(lit.previous());
		// }

		// ArrayDeque stack = new ArrayDeque<>();
		// stack.push("fengkuang");
		// stack.push("JAVA");
		// stack.push("jiangyi");
		// System.out.println(stack);

		// System.out.println(stack.peek());

		// System.out.println(stack.pop());

		// System.out.println(stack);

		// String str = "lol";
		// String s = str.replace(" ", "_");
		// System.out.println(str);
		// System.out.println(s);

		// Frame f = new Frame("Test Window");
		// ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		// sp.add(new TextField(20));
		// sp.add(new Button("Click Me!"));
		// f.add(sp);
		// f.setBounds(30, 30, 250, 120);
		// f.setVisible(true);

		Class.forName("com.mysql.jdbc.Driver");
		try{
			connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_person", "root","123456" );
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from person");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}

		}finally{
			
		}




	}
	
}
