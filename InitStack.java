import java.util.Scanner;
public class InitStack{
    public void init(){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        boolean exit=true;
            while(exit){
            
                System.out.println("1. Push element");
                System.out.println("2. Pop element");
                System.out.println("3. Peek element");
                System.out.println("4. Search element");
                System.out.println("5. Print stack");
                System.out.println("6. Exit");

                System.out.println();
                System.out.println("Enter your Choice");

                int choice=sc.nextInt();

                switch(choice){
                    
                    case 1:
                            System.out.println("Enter element to be pushed");
                            int data=sc.nextInt();
                            ll.addAtHead(data);
                            break;

                    case 2:
                            ll.removeFirst();
                            break;
                        
                    case 3:
                            System.out.println(ll.head.data);
                            break;
                        
                    case 4:
                            System.out.println("Enter element to be search");
                            int data1=sc.nextInt();
                            if(ll.search(data1)>0){
                            System.out.println(ll.search(data1));
                            }
                            break;

                    case 5:
                            ll.print();
                            break;

                    case 6:
                            exit=false;
                            break;
                        
                    default:
                            System.out.println("Enter valid choice");
                            break;
                
            }
        }
    }

}
