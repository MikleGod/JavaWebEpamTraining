package by.tc.task01.entity;

public class Laptop extends Appliance{
    // you may add your own code here
    private double displayInches;
    private String cpu;
    private double systemMemory;
    private double memoryRom;
    private String os;
    private double batteryCapacity;

    public Laptop() {
    }

    public Laptop(double displayInches, String cpu, double systemMemory, double memoryRom, String os, double batteryCapacity) {
        this.displayInches = displayInches;
        this.cpu = cpu;
        this.systemMemory = systemMemory;
        this.memoryRom = memoryRom;
        this.os = os;
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displayInches=" + displayInches +
                ", cpu='" + cpu + '\'' +
                ", systemMemory=" + systemMemory +
                ", memoryRom=" + memoryRom +
                ", os='" + os + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
