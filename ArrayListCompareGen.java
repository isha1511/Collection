import java.util.*;

class ArrayListCompareGen extends ArrayList{

    public static void main(String[] args){

        List<Number> al=new ArrayList<>();

        al.add(10);
        al.add(10.5f);
        al.add(10.7);
        al.add(20);
        al.add(25.5f);
        al.add(5.5);
    
    double max=Double.MIN_VALUE;
    for(int i=0;i<al.size();i++){

        Number num = al.get(i);
            double value = num.doubleValue();
            if (max < value) {
                max = value;
            }
    }

    System.out.println("Largest No:" +max);
} 
}  