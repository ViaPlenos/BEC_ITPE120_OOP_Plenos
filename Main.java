public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 4);

        System.out.println("Car brand: " + myCar.getBrand());
        System.out.println("Car model: " + myCar.getModel());
        System.out.println("Number of doors: " + myCar.getNumDoors());

        myCar.start();
        myCar.honk();
        myCar.stop();
    }
}
