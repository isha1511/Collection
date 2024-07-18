import java.util.*;
class ArrayListDemo extends ArrayList{

        public static void main(String[] args){

                ArrayList al=new ArrayList();
                //add(Element)

                al.add(10);
                al.add(20.5f);
                al.add("Isha");
                al.add(20.5f);
                al.add(10);

                System.out.println(al);

                //int size()
                System.out.println(al.size());

                // boolean contains(object)
                System.out.println(al.contains("Isha"));
                System.out.println(al.contains(30));

                //int indexOf(object)
                System.out.println(al.indexOf(20.5f));

                //int lastIndexOf(object)
                System.out.println(al.lastIndexOf(20.5f));

                //E get(int)
                System.out.println(al.get(3));

                //E set(int,E)
                System.out.println(al.set(3,"BridgeLabz"));//replace 3 rd index and return removed one

                //void add(int,E)
                al.add(3,"Apexon");
                System.out.println(al);

                //E remove(int)
                al.remove(3);
                System.out.println(al);

                //boolean remove(object)
                System.out.println(al.remove(20.5));
                System.out.println(al);

                //boolean addAll(collection)
                ArrayList al2=new ArrayList();
                al2.add("Mahima");
                al2.add(40);
                al2.add("Pooja");

                al.addAll(al2);
                System.out.println(al);

                //boolean addAll(int,collection)
                System.out.println(al.addAll(3,al2));
                System.out.println(al);

                //protected void removeRange(int,int)

                ArrayListDemo ald=new ArrayListDemo();
                ald.add("Mahima");
                ald.add(40);
                ald.add("Pooja");
                System.out.println(ald);
                ald.removeRange(1,2);
                System.out.println(ald);

                //java.lang.Object[] toArray()

                Object arr[]=al.toArray();

                System.out.println(arr);

                for(Object data:arr){

                        System.out.print(data+" ");
                }
                System.out.println();

                //trimToSize

                al.trimToSize();
                System.out.println(al);

                //clear
                al.clear();
                System.out.println(al);

        }
}