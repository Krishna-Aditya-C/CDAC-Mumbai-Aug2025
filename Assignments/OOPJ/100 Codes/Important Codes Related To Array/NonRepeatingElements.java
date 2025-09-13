class NonRepeatingElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5, 1};
        System.out.print("Non-Repeating elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean repeating = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeating = true; break;
                }
            }
            if (!repeating) System.out.print(arr[i] + " ");
        }
    }
}
