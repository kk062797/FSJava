public class ConditionalStatementDemo {

    public static void main(String[] args) {
        ConditionalStatementDemo cd = new ConditionalStatementDemo();
        String result = cd.getAgeCategory(5);
        System.out.println(result);

    }

    public String getAgeCategory(int age) {

        String ageCategory = "";
        if (age > 0 && age < 18) {
            ageCategory = "CHILD";
        } else if (age >= 18 && age < 60) {
            ageCategory = "ADULT";
        } else if (age >= 60) {
            ageCategory = "SENIOR CITIZEN";
        } else {
            System.out.println("Please enter valid age.");
        }
        return ageCategory;
    }


}

