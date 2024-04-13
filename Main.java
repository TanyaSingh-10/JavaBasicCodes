import java.util.Scanner;

public class Main {
//from here our main function starts
     public static void main(String[] agrs) {
       // this is our output part
        System.out.println("Hello world");//this adds a new line
        System.out.print("Tanya here..");//this does not adds a new line
        System.out.println(" And i'm from varanasi ");
      //  [from here our input part starts]
        Scanner input = new Scanner(System.in);
      // it will print integer value getting from user  
        System.out.println(input.nextInt());
      // it will print one word string 
      System.out.println(input.next());
      // it will print entire line 
      System.out.println(input.nextLine());
     }
} 



