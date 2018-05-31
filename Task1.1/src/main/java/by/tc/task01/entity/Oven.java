package by.tc.task01.entity;

public class Oven extends Appliance{
	// you may add your own code here
    private double width;
    private double height;
    private double depth;
    private double capacity;
    private double weight;
    private double powerConsumption;

    public Oven() {
    }

    public Oven(double width, double height, double depth, double capacity, double weight, double powerConsumption) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.capacity = capacity;
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", capacity=" + capacity +
                ", weight=" + weight +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
