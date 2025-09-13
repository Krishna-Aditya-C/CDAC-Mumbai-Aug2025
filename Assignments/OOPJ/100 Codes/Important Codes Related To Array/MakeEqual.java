class MakeEqual {
    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5};
        boolean allEqual = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                allEqual = false;
                break;
            }
        }

        System.out.println(allEqual ? "Yes, all equal" : "No, not all equal");
    }
}
