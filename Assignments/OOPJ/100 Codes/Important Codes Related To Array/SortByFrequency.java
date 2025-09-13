import java.util.Arrays;

class SortByFrequency {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        int n = arr.length;
        int freq[] = new int[n];
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            freq[i] = count;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (freq[i] < freq[j]) {
                    int temp = freq[i]; freq[i] = freq[j]; freq[j] = temp;
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
                }
            }
        }

        System.out.print("Sorted by frequency: ");
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                for (int j = 0; j < freq[i]; j++)
                    System.out.print(arr[i] + " ");
            }
        }
    }
}
