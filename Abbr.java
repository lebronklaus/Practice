class Acronym{
    public static String acronym(String word){
        String abb="";
        String []test=word.split(" ");
        for (String string : test) {
            abb+=string.charAt(0);
        }
        return abb.toUpperCase();
    }

    public static void main(String[] args){
        System.out.println(acronym("self des i map"));
    }


}