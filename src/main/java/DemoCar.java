public class DemoCar {
    public static void main(String[] args) {
        Car car = new Car();
        //car.engineName = "Abc";
        //System.out.println(car.engineName);
        car.setEngineName("BMW");
        System.out.println(car.getEngineName());
    }
}
