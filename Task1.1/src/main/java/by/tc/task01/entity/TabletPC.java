package by.tc.task01.entity;

public class TabletPC extends Appliance{
	// you may add your own code here
    private double displayInches;
    private String color;
    private double flashMemoryCapacity;
    private double memoryRom;
    private double batteryCapacity;

    public TabletPC() {
    }

    public TabletPC(double displayInches, String color, double flashMemoryCapacity, double memoryRom, double batteryCapacity) {
        this.displayInches = displayInches;
        this.color = color;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.memoryRom = memoryRom;
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "displayInches=" + displayInches +
                ", color='" + color + '\'' +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", memoryRom=" + memoryRom +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
