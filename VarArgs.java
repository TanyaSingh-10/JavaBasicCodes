public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
       // fun();//this can also work, give empty array list
       multiple(2, 3, "Kunal", "Rahul", "Ajay");
    }

    //mix method

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));

    }
}