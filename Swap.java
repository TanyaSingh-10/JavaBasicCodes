public class Swap {
    public static void main(String[] args) {
        int[] arr ={1, 3, 2, 45, 6};
        change(arr);
        System.out.println(arr);
        int a = 1;
        value(a);
        System.out.println(a);
        String name = "Tanya Singh";
        greet(name);
        System.out.println(name);
    }
    //     int a = 10;
    //     int b= 20;

    //     //Swap Numbers Code

    //     int temp = a; // it will change the main function value
    //     a = b;
    //     b = temp;
    //     System.out.println(a + " " + b);    
    
    

    //change value
                                         
    static void change (int[] nums) {
        nums[0] = 90;
    }

    static void value( int num ){ //it will not cahnge the main value
        num = 2;
    }

    static void greet(String name){ //it will not change the main value
          name = "Kunal";
          
    }
    }





