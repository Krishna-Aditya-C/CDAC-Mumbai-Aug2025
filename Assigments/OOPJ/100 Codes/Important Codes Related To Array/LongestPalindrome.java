class LongestPalindrome {
    static boolean isPalindrome(int num) {
        int rev = 0, temp = num;
        while (temp > 0) {
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        return rev == num;
    }

    public static void main(String[] args) {
        int arr[] = {121, 131, 20, 5555, 88};
        int maxPalindrome = -1;
        for (int num : arr) {
            if (isPalindrome(num) && num > maxPalindrome)
                maxPalindrome = num;
        }
        if (maxPalindrome == -1)
            System.out.println("No palindrome found");
        else
            System.out.println("Longest palindrome: " + maxPalindrome);
    }
}
