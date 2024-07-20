import java.util.Scanner;
public class InitLinkedList{
    public void init(){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        boolean exit=true;
        while(exit){

            System.out.println("1. Add element ");
            System.out.println("2. Add element to the start/head ");
            System.out.println("3. Add element to the particular position ");
            System.out.println("4. Remove first elemet ");
            System.out.println("5. Remove last element ");
            System.out.println("6. Remove element from particular index ");
            System.out.println("7. Remove element by data ");
            System.out.println("8. Print LinkedList ");
            System.out.println("9. Exit");
            System.out.println();
            System.out.println("Enter your choice..");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter element");
                    int data=sc.nextInt();
                    ll.add(data);
                    break;
                case 2:
                    System.out.println("Enter element");
                    int data1=sc.nextInt();
                    ll.addAtHead(data1);
                    break;
                case 3:
                    System.out.println("Enter position: ");
                    int position=sc.nextInt();
                    System.out.println("Enter data to be insert");
                    int data2=sc.nextInt();
                    ll.addAtPosition(data2,position,ll);
                    break;
                case 4: 
                    ll.removeFirst();
                    break;        
                case 5:
                    ll.removeLast();
                    break;
                case 6:
                    System.out.println("Enter index to be removed");
                    int pos=sc.nextInt();
                    ll.removeByIndex(pos,ll);
                    break;
                case 7:
                    System.out.println("Enter data to be removed");
                    int data3=sc.nextInt();
                    ll.removeByData(data3);
                    break;
                case 8:
                    ll.print();
                    break;
                case 9:
                    exit=false;
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
         }
    }
}
