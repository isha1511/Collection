import java.util.TreeSet;

class SetDemo2 {
    public static void main(String[] args) {


        TreeSet <Integer> treeset = new TreeSet<>();
        treeset.add(10);
        treeset.add(20);
        treeset.add(30);
        treeset.add(40);
        treeset.add(50);

        //first
        System.out.println(treeset.first());

        //last
        System.out.println(treeset.last());

        //contains
        System.out.println(treeset.contains(20));

        //isEmpty
        System.out.println(treeset.isEmpty());

        //remove
        System.out.println(treeset.remove(20));

        //subset
        System.out.println(treeset.subSet(1,4));

        //tailSet
        System.out.println(treeset.tailSet(2));

        //ceiling..least element greater than equal to given element
        System.out.println(treeset.ceiling(25));

        //floor..greatest element less than equal to given
        System.out.println(treeset.floor(25));

        //higher...least element strictly greater than given element
        System.out.println(treeset.higher(32));

        //lower...greatest element strictly less than given element
        System.out.println(treeset.lower(32));

        //pollFirst...removefirst
        System.out.println(treeset.pollFirst());

        //pollLast...removeLast
        System.out.println(treeset.pollLast());


    }
}