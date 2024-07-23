import java.util.*;
public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //contains
        System.out.println(set.contains(20));

        //isEmpty
        System.out.println(set.isEmpty());

        //iterator
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //size
        System.out.println(set.size());

        //remove
        System.out.println(set.remove(20));

    }

}
