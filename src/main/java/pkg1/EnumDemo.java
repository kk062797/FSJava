package pkg1;

enum Color {
    RED,
    YELLOW,
    GREEN
}

public class EnumDemo {
    public static void main(String[] args) {

        String colorName = "blue";
        try {
            if (Color.valueOf(colorName.toUpperCase()) == Color.RED) {
                System.out.println("Stop your Vehicle as Traffic light shows "+ colorName.toUpperCase());
            } else if (Color.valueOf(colorName.toUpperCase()) == Color.YELLOW) {
                System.out.println("Be Ready as Traffic light shows "+ colorName.toUpperCase());
            } else if (Color.valueOf(colorName.toUpperCase()) == Color.GREEN) {
                System.out.println("You can go as Traffic light shows "+ colorName.toUpperCase());
            } else {
                System.out.println("Please provide the correct color");
            }
        } catch (RuntimeException e) {
            System.out.println("Colors didn't match");
            e.printStackTrace();
        }
        /*
        Color[] colors = Color.values();
        for (Color c : colors) {
            System.out.println(c.name());
        }
        System.out.println("---------------------------------");
        Color red = Color.valueOf("RED");
        System.out.println(red.name());
        System.out.println(red.ordinal());
        Color yellow = Color.valueOf("YELLOW");
        System.out.println(yellow.name());
        System.out.println(yellow.ordinal());
        Color green = Color.valueOf("GREEN");
        System.out.println(green.name());
        System.out.println(green.ordinal());
         */
    }
}
