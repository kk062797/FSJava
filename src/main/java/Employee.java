public class Employee {

    private String name;
    private Integer id;
    private Character gender;

    public Employee(String name, Integer id, Character gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Character getGender() {
        return gender;
    }

    public  void printEmployeeDetails(){
        System.out.println(this.name+" | "+ this.id+" | "+this.gender);
    }
}
