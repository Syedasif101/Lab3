public class Prime {
    public static void main(String args[]) {
        int a = 100, b = 200, c = 2;

        while (a <= b) {
            c = 2;         
            while (a >= c) {
                if (a == c) {
                    System.out.println(a);
                } else if (a % c == 0) {
                    c = 200;
                }
                c++;
            }
            a++;
        }
    }
}