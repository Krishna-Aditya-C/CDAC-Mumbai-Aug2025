class MaxProductSubarray {
    public static void main(String[] args) {
        int arr[] = {2, 3, -2, 4};
        int maxProduct = arr[0], minProduct = arr[0], result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(arr[i], Math.max(arr[i] * maxProduct, arr[i] * minProduct));
            minProduct = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * minProduct));
            result = Math.max(result, maxProduct);
        }

        System.out.println("Max product subarray = " + result);
    }
}
