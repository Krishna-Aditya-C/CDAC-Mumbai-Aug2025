class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
        
        System.out.print("Left rotation: ");
        for (int i = k; i < n; i++) System.out.print(arr[i] + " ");
        for (int i = 0; i < k; i++) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Right rotation: ");
        for (int i = n-k; i < n; i++) System.out.print(arr[i] + " ");
        for (int i = 0; i < n-k; i++) System.out.print(arr[i] + " ");
    }
}
