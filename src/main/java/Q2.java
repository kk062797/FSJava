public class Q2 {
    public static void main(String[] args) {
        findDivisor(36);
    }

    public static void findDivisor(int n) {
        System.out.print("The divisors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i +" ");
            }

        }

    }
}
