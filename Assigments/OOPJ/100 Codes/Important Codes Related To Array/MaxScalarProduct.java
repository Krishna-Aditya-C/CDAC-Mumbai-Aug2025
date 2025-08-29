import java.util.Arrays;

class MaxScalarProduct {
    public static void main(String[] args) {
        int a[] = {1, 3, 5};
        int b[] = {2, 4, 1};

        Arrays.sort(a);
        Arrays.sort(b);

        int result = 0;
        for (int i = 0; i < a.length; i++)
            result += a[i] * b[i];

        System.out.println("Maximum scalar product = " + result);
    }
}
