public class AgeGenderCategory {

    public static void main(String[] args) {
        AgeGenderCategory ag = new AgeGenderCategory();
        String result = ag.genderAgeCategory(23, "Female");
        System.out.println(result);

    }

    public String genderAgeCategory(int age, String gender) {
        String ageCategory = "";
        if (age > 0 && age < 18) {
            if (gender.equals("Male")) {
                ageCategory = "Boy";
            } else if (gender.equals("Female")) {
                ageCategory = "Girl";
            }
        } else if (age >= 18 && age < 60) {
            if (gender.equals("Male")) {
                ageCategory = "Man";
            } else if (gender.equals("Female")) {
                ageCategory = "Woman";
            }
        } else if (age >= 60) {
            if (gender.equals("Male")) {
                ageCategory = "Senior Citizen Male";
            } else if (gender.equals("Female")) {
                ageCategory = "Senior Citizen Female";
            }
        } else {
            System.out.println("Please provide the correct age and gender.");
        }
        return ageCategory;
    }
}
