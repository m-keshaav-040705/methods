package methods;

class Minimum {
    static int min(int[] a) {
        int m = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < m)
                m = a[i];
        }

        return m;
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 20, 2, 15};
        System.out.println("Smallest = " + min(a));
    }
}	