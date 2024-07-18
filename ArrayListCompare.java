import java.util.*;

class ArrayListCompare extends ArrayList{

    public static void main(String[] args){

        List al=new ArrayList();

        al.add(10);
        al.add(10.5f);
        al.add(10.7);
        al.add(20);
        al.add(25.5f);
        al.add(5.5);
    
    double max=Double.MIN_VALUE;
    for(int i=0;i<al.size();i++){

        Object o = al.get(i);
        if (o instanceof Number) {
            Double value = ((Number) o).doubleValue();
            if (max < value) {
                max = value;
            }
    }
}
    System.out.println("Largest No:" +max);
}
}
       