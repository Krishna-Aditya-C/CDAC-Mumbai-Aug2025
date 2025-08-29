class SubsetCheck {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {2, 3};

        boolean isSubset = true;
        for (int x : b) {
            boolean found = false;
            for (int y : a) {
                if (x == y) { found = true; break; }
            }
            if (!found) { isSubset = false; break; }
        }

        System.out.println(isSubset ? "b is subset of a" : "b is not subset of a");
    }
}
