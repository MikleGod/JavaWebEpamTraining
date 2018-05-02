package entity.plain;

public abstract class Plane{

    protected double flyDistance;
    protected double fuelConsumption;
    protected int passengerCapacity;
    protected double carryingCapacity;

    protected Plane() {
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFlyDistance() {
        return flyDistance;
    }

    public void setFlyDistance(double flyDistance) {
        this.flyDistance = flyDistance;
    }
}
