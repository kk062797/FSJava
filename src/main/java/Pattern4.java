public class Pattern4 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (10 - (2 * i + 1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
