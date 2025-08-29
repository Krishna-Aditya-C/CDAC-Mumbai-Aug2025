import java.util.Arrays;

class HalfSort {
    public static void main(String[] args) {
        int arr[] = {1, 90, 34, 89, 7, 9, 12, 56};
        int n = arr.length;

        Arrays.sort(arr, 0, n/2);
        Arrays.sort(arr, n/2, n);

        for (int i = n/2, j = n-1; i < j; i++, j--) {
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        }

        System.out.print("Result: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
