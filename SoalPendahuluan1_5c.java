public class NPM07066soalPendahuluan1_5c {
    public static void main(String[] args) {
        int a = 10;
        do {
            int d = a % 2;
            if (d == 0) {
                System.out.println(a);
            }
            a--;
        } while (a > 0);
    }
}
