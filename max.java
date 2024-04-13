public class max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        reverse(arr);
        System.out.println(max(arr));
    }

    static void reverse (int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while ( start < end ) {
            //swap

           swap(arr, start, end);
            start++;
            end--;
        }
    }
    

    static int max(int[] arr) {
        int maxVal = arr[0];
        for ( int i = 1; i< arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
