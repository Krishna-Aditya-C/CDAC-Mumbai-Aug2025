class BlockSwap {
    static void swap(int arr[], int fi, int si, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    static void leftRotate(int arr[], int d, int n) {
        if (d == 0 || d == n) {
            return;
        }
        rotateRec(arr, 0, d, n);
    }

    static void rotateRec(int arr[], int i, int d, int n) {
        if (d == 0 || d == n) {
            return;
        }
        if (d == n - d) {
            swap(arr, i, n - d + i, d);
            return;
        }
        if (d < n - d) {
            swap(arr, i, n - d + i, d);
            rotateRec(arr, i, d, n - d);
        } 
        else {
            swap(arr, i, i + d, n - d);
            rotateRec(arr, n - d + i, 2 * d - n, d);
        }
    }

    static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        leftRotate(arr, d, n);
        printArray(arr);
    }
}
