import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        int sum = num1 + num2;

        System.out.println("Sum is " + sum);


        //this is type conversion
        float number1 = input.nextInt();
        float number2 = input.nextInt();

        float  summation = number1 + number2;
        System.out.println(summation);

      }
}

