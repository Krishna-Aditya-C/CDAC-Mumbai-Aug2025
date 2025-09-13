import java.util.Arrays;

class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 50, 23, 90};
        Arrays.sort(arr);
        System.out.println("Second smallest: " + arr[1]);
    }
}
