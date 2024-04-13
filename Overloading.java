public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Tanya Singh");
        int ans = sum(3, 4, 9);
        System.out.println(ans);

    }

    static void fun( int a){
        System.out.println(a);
    }
 
    static void fun( String name) {
        System.out.println(name);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

}

