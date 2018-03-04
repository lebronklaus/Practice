
public class Acronym{
    public static String acronym(String word){
        String abb="";
        String lword=word.trim();
        String iword=lword.replaceAll("\\s{1,}"," ");
        String []test=iword.split(" ");
        for (String string : test) {
           abb+=string.charAt(0);
        }
        return abb.toUpperCase();
    }


    public static void main(String[] args){
        System.out.println(acronym("  i   love  you  "));
    }

}