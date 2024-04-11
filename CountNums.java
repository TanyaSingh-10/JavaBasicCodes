public class CountNums {
    public static void main(String[] args) {

        // int n = 45536;

        // int count = 0 ;
        // while ( n > 0){
        // int rem = n % 10;
        // if(rem == 5){
        // count++;
        // }
        // n = n/10;
        // }
        // System.out.println(count);

        // reverse order problem
        int num = 23597;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
