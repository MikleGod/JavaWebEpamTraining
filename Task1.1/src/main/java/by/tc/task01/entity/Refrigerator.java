package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	// you may add your own code here
    private double width;
    private double height;
    private double overallCapacity;
    private double freezerCapacity;
    private double weight;
    private double powerConsumption;

    public Refrigerator() {
    }

    public Refrigerator(double width, double height, double overallCapacity, double freezerCapacity, double weight, double powerConsumption) {
        this.width = width;
        this.height = height;
        this.overallCapacity = overallCapacity;
        this.freezerCapacity = freezerCapacity;
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

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
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
        return "Refrigerator{" +
                "width=" + width +
                ", height=" + height +
                ", overallCapacity=" + overallCapacity +
                ", freezerCapacity=" + freezerCapacity +
                ", weight=" + weight +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
