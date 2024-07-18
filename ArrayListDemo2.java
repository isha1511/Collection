import java.util.*;
class ArrayListDemo2 extends ArrayList{

        public static void main(String[] args){

                ArrayList al=new ArrayList();
                //add(Element)

                al.add(14);
                al.add(20.5f);
                al.add("Isha");
                al.add(15);
                al.add("Om");
            
                //hashcode method of List
                System.out.println(al.hashCode());

                ArrayList al2=new ArrayList();
                al2.add(10);
                al2.add(20);
                al2.add(30);

                //retaiAll... remove all
                al.retainAll(al2);
                System.out.println(al);

                al.add(14);
                al.add(20.5f);
                al.add("Isha");
                al.add(15);
                al.add("Om");

                //ListIterator
                ListIterator itr=al.listIterator();

                while(itr.hasNext()){

                    System.out.println(itr.next());
                }   

                //List subList(s,e)
                System.out.println(al.subList(1,3));

                //Iterator

                Iterator ir=al.iterator();

                while(ir.hasNext()){

                    System.out.println(ir.next());
                }

                //removeAllInternal
                al.removeAllInternal(al2);
            
        }
    }
