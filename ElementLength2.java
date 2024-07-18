import java.util.*;

class ElementLength2{

    public static <T extends Comparable<T>> T findLargest(ArrayList<T> list){

        if(list==null || list.isEmpty()){

            throw new IllegalArgumentException("List is empty");
        }
            T largest=list.get(0);

            for(int i=0;i<list.size();i++){

                T current =list.get(i);
                if(current.compareTo(largest)>0){
                    largest=current;
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

        System.out.println("Largest Integer: "+findLargest(al));

        ArrayList<Double> al2=new ArrayList<>();

        al2.add(20.5);
        al2.add(30.5);
        al2.add(40.5);
        al2.add(50.5);

        System.out.println("Largest Double No: "+findLargest(al2));

        ArrayList<String> al3=new ArrayList<>();

        al3.add("Isha");
        al3.add("Shrdhha");
        al3.add("Payal");
        al3.add("Pooja");

        System.out.println("Largest String: "+findLargest(al3));

    }
}