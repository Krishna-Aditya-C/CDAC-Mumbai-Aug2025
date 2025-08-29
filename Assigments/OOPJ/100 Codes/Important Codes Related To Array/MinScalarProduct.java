import java.util.Arrays;

class MinScalarProduct {
    public static void main(String[] args) {
        int a[] = {1, 3, 5};
        int b[] = {2, 4, 1};

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0, j = b.length - 1; i < j; i++, j--) {
            int temp = b[i]; b[i] = b[j]; b[j] = temp;
        }

        int result = 0;
        for (int i = 0; i < a.length; i++)
            result += a[i] * b[i];

        System.out.println("Minimum scalar product = " + result);
    }
}
