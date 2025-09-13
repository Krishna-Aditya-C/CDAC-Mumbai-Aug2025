import java.util.Arrays;

class SortByOtherArray {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int order[] = {2, 1, 8, 3};

        boolean used[] = new boolean[arr.length];
        System.out.print("Sorted: ");

        for (int x : order) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x && !used[i]) {
                    System.out.print(arr[i] + " ");
                    used[i] = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) System.out.print(arr[i] + " ");
        }
    }
}
