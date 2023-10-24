class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int numDoors) {
        super(brand, model); // Call the base class constructor to initialize brand and model
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void honk() {
        System.out.println("Car is honking!");
    }
}
