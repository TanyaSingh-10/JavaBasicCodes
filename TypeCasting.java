import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // type conversion
        float num = input.nextInt();
        System.out.println(num);

        int number = 'A';
        System.out.println(number);

        // Type casting:-
        // int num = (int) (67.56f);
        // System.out.println(num);

        // input from user
        // int num = (int) (input.nextFloat());
        // System.out.println(num);

        // automatic type promotion in expression

        // int a = 257;
        // byte b = (byte) (a);
        // System.out.println(b); // 257 % 256 = 1

        // example

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // output = float + int - double = double(max value)
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

    }
}
