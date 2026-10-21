package methods;

class Maximum {
    static int max(int[] a) {
        int m = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > m)
                m = a[i];
        }
        return m;
    }

    public static void main(String[] args) {
        int[] a = {10, 50, 20, 40};
        System.out.println("Maximum = " + max(a));
    }
}
