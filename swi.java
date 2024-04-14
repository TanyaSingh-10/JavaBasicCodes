import java.util.*;

public class swi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // Switch statements:-

        // switch(fruit) {
        // case "Mango":
        // System.out.println("king of fruits");
        // break;

        // case "Apple":
        // System.out.println("a sweet red fruit");
        // break;

        // case "Orange":
        // System.out.println("Round fruit");
        // break;

        // case "Grapes":
        // System.out.println("small fruit");
        // break;

        // default:
        // System.out.println("Please enter a valid fruit");
        // }

        // Other way to write switch statement:-
        // int days =in.nextInt();
        // switch (days) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("saturday");
        // }

        // Nested Switch Statement
        int empNo = in.nextInt();
        String department = in.next();

        switch (empNo) {
            case 1:
                System.out.println("Tanya Singh");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Manangement":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter valid empID");
        }
    }
}
