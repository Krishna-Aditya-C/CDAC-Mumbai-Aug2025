class JugglingRotation {
    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    static void leftRotate(int arr[], int d, int n) {
        int g = gcd(d, n);
        for (int i = 0; i < g; i++) {
            int temp = arr[i];
            int j = i;
            while (true) {
                int k = j + d;
                if (k >= n) k = k - n;
                if (k == i) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        leftRotate(arr, 2, arr.length);
        for (int x : arr) System.out.print(x + " ");
    }
}
