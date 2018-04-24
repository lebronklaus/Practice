import java.io.File;

public class temp{
    public static void main(String[] args){
        // String str = "E:/tmp/test/";
		// String front = str.replace("/", "///");
        // String res = front.substring(0,front.length()-1);
        // System.out.println( str.replace("/", "//").replace(":/", "://"));
        // String path = "E:///excel//1521039942266.xlsx";
        File file = new File("E:///excel//1521042381087.xlsx");
        if(file.exists()){
           deleteFile(file);
        }
        // String front = path.substring(0,path.indexOf('.'));//获取路径
        // String dir = front.substring(0, front.length()-13);
        // System.out.println(dir);    

    }
    private static void deleteFile(File file){
        if(file.isDirectory()){
             File[] files = file.listFiles();
             for(int i=0; i<files.length; i++){
                  deleteFile(files[i]);
             }
        }
        file.delete();
   }
}