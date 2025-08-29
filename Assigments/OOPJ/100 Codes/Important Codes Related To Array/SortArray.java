import java.util.Arrays;

class SortArray {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 5, 6};
        Arrays.sort(arr);
        System.out.print("Sorted: ");
        for (int x : arr) System.out.print(x + " ");
    }
}