class SmallestAndLargest {
    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 50, 23, 90};
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}