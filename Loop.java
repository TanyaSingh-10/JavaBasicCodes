import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // for loop :-
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any value under 100 :-");
        int a = input.nextInt();
        for (int num = a; num <= 100; num++) {
            System.out.println(num);

        }
        // while loop :-

        // int num = a;
        // while( num <= 100) {
        // System.out.println(num);
        // num ++;
        // }

        // do while loop:-
        int num = a;
        do {
            System.out.println(num);
            num++;
        } while (num <= 100);

    }
}
