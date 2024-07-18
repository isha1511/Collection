import java.util.*;

class StringCompareGen extends ArrayList{

    public static void main(String[] args){

        List<String> al=new ArrayList<>();

        al.add("Isha");
        al.add("Shrdhhaa");
        al.add("Ruchita");
        al.add("Payal");
        al.add("Tanvi");
    int minLength=0;
    String largestStr=null;
    for(int i=0;i<al.size();i++){

        String str = al.get(i);
        int len=str.length();
        if(len>minLength){
            minLength=len;
           largestStr=str;
        }
    }
    System.out.println("Largest string: " +largestStr);
}
}
       