import java.util.Scanner;

public class InitQueue{

    public void init(){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        boolean exit=true;

            while(exit){
                System.out.println("1. Offer element");
                System.out.println("2. Poll element");
                System.out.println("3. Peek element");
                System.out.println("4. Print Queue");
                System.out.println("5. Exit");

                System.out.println();
                System.out.println("Enter your Choice");

                int choice=sc.nextInt();

                switch(choice){

                    case 1:
                            System.out.println("Enter element to be add in queue");
                            int data=sc.nextInt();
                            ll.add(data);
                            break;
                    
                    case 2:
                            System.out.println(ll.head.data);
                            ll.removeFirst();
                            break;
                    
                    case 3:
                            System.out.println(ll.head.data);
                            break;

                    case 4:
                            ll.print();
                            break;
                        
                    case 5:
                            exit=false;
                            break;
                    
                    default:
                            System.out.println("Emter valid choice");
                            break;
                }
            }
        }
    }


                    
            