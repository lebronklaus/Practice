import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Net{
    public static void main(String args[])throws Exception{
        // InetAddress ip = InetAddress.getByName("cn.bing.com");
        // System.out.println("bing reachable:"+ip.isReachable(2000));
        // System.out.println(ip.getHostAddress());
        // InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
        // System.out.println("local reachable:"+local.isReachable(2000));
        // System.out.println(local.getCanonicalHostName());
        // String keyWord = URLDecoder.decode("%B7%E8%BF%F1java","GBK");
        // System.out.println(keyWord);
        // String urlStr = URLEncoder.encode("疯狂Java讲义","GBK");
        // System.out.println(ur);
        ServerSocket ss = new ServerSocket(30000);
        while(true){
            Socket s = ss.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("Hello,Greeting from Server!");
            ps.close();
            s.close();
            ss.close();
        }
        
    }
}