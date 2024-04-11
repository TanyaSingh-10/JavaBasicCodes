import java.util.*;

public class functons {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);
       String message= greet();
       System.out.println(message);   
       int answer = sum3(20, 30);
       System.out.println(answer);
       String personal = myGreet("Tanya Singh");
       System.out.println(personal);
    }

     // void return type
   static void sum (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
    }


     // return the value
       static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    // return the string

       static String greet() {
          String greeting = "how are you";
          return greeting;
       }
      
       // by using parameter in int

       static int sum3 (int a , int b) { 
          int sum = a + b;
          return sum;
       }

       // ny using parameter in string

       static String myGreet(String name){
           String messgae = "hello" + name;
           return messgae;
       }
}
