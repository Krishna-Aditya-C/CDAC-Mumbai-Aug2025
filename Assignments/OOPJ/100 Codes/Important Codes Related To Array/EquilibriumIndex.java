class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = 0;

            for (int j = 0; j < i; j++) left += arr[j];
            for (int j = i+1; j < n; j++) right += arr[j];

            if (left == right) {
                System.out.println("Equilibrium index = " + i);
                return;
            }
        }
        System.out.println("No equilibrium index");
    }
}
