import java.util.*;
class ElementLength{

    public static int findLargestInt(ArrayList<Integer> list){

        if(list==null || list.isEmpty()){

            throw new IllegalArgumentException("list is empty");
        }
            int largest=list.get(0);
            for(int n:list){

                if(n>largest){
                    largest=n;
                }
            }
        return largest;
        }


    public static double findLargestDouble(ArrayList<Double> list){

        if(list==null || list.isEmpty()){

            throw new IllegalArgumentException("list is empty");
        }

            double largest=list.get(0);
            for(double n:list){

                if(n>largest){
                    largest=n;
                }
            }
    
        return largest;
    }

    public static String findLargestString(ArrayList<String> list){

        if(list==null || list.isEmpty()){

            throw new IllegalArgumentException("list is empty");
        }

            String largest=list.get(0);
            for(String str:list){

                if(str.compareTo(largest)>0){
                    largest=str;
                }
            }
        return largest;
    }

    public static void main(String[] args){

        ArrayList<Integer> al=new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println("Largest Integer: "+findLargestInt(al));

        ArrayList<Double> al2=new ArrayList<>();

        al2.add(20.5);
        al2.add(30.5);
        al2.add(40.5);
        al2.add(50.5);

        System.out.println("Largest Double No: "+findLargestDouble(al2));

        ArrayList<String> al3=new ArrayList<>();

        al3.add("Isha");
        al3.add("Shrdhha");
        al3.add("Payal");
        al3.add("Pooja");

        System.out.println("Largest String: "+findLargestString(al3));

    }
}