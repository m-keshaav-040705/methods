package methods;

class Palindrome {
    static boolean check(int n) {
        int original = n, rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        if (check(121))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}