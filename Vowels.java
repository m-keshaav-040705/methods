package methods;

class Vowels {
    static int count(String s) {
        int c = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiou".indexOf(ch) != -1)
                c++;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println("Vowels = " + count("Hello World"));
    }
}