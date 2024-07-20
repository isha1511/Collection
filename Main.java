import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        int flag = 1;
        while(flag == 1){
        System.out.println("What you want to do.");
        System.out.println("1. For Linked List.");
        System.out.println("2. For Stack.");
        System.out.println("3. For Queue");
        System.out.println("4. Exit.");

        Scanner sc = new Scanner(System.in);
        int chioce = sc.nextInt();

        switch(chioce){
        case 1:
                InitLinkedList initLinkedList = new InitLinkedList();
                initLinkedList.init();   
                break;
        case 2:
                InitStack initStack=new InitStack();
                initStack.init();
                break;
        case 3:
                InitQueue initQueue=new InitQueue();
                initQueue.init();
                break;

        case 4:
                flag=0;
                break;
        default:
                System.out.println("Enter valid input");
        }
     }   
   }
}