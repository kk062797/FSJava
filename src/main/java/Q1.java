public class Q1 {

    public static void main(String[] args) {
        reverseNumber(45353);
    }

    public static void reverseNumber(int num) {
        System.out.print("Reverse number of given number " + num + " is: ");
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
