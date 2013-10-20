package orz.nbt.cucmber;

public class Car {
    private Integer fuelLevel;
    public Car() {
        fuelLevel = 0;
    }
    public Car(int initialFuelLevel) {
        fuelLevel = initialFuelLevel;
    }

    public void addFuel(int addedFuel) {
        fuelLevel = fuelLevel + addedFuel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
