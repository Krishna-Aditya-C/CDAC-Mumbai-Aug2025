class CircularRotation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        System.out.print("Circular rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + n - k) % n] + " ");
        }
    }
}