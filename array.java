import java.util.*;

public class array {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

        
        //declaration of array

        //array of primitives

        int[] arr = new int[5];
        // System.out.println(arr[0]);

        // String[] arry = new String[ 6];
        // System.out.println(arr[ 0 ]);

        //input using for loops 
      
        for( int i = 0; i < arr.length; i++ ){
            arr[i]= in.nextInt();
        }

        // for( int i = 0; i < arr.length; i++){
        //    System.out.print(arr[i] + "  ");
        // }

        //enhanced for loop

        // for ( int num: arr){
        //      System.out.print(num + "   ");
        // }

        //3rd way to print

        System.out.println(Arrays.toString(arr));

        //array of objects

        String[] str = new String[4];
        for (int i=0; i<str.length; i++) {
            str[i]= in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify

        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));

        
}
}