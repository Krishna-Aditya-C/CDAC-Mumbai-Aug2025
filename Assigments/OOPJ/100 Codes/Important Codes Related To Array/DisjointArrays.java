class DisjointArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};

        boolean disjoint = true;
        for (int x : a) {
            for (int y : b) {
                if (x == y) {
                    disjoint = false;
                    break;
                }
            }
        }

        System.out.println(disjoint ? "Arrays are disjoint" : "Arrays are not disjoint");
    }
}
