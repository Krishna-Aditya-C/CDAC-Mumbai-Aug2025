import java.util.Arrays;

class ReplaceByRank {
    public static void main(String[] args) {
        int arr[] = {100, 2, 70, 12, 90};
        int sorted[] = arr.clone();
        Arrays.sort(sorted);

        System.out.print("Ranked array: ");
        for (int x : arr) {
            for (int i = 0; i < sorted.length; i++) {
                if (x == sorted[i]) {
                    System.out.print((i+1) + " ");
                    break;
                }
            }
        }
    }
}
