package by.tc.task01.entity;

public class Speakers extends Appliance{
	// you may add your own code here
    private double cordLength;
    private String frequencyRange;
    private int numberOfSpeakers;
    private double powerConsumption;

    public Speakers() {
    }

    public Speakers(double cordLength, String frequencyRange, int numberOfSpeakers, double powerConsumption) {
        this.cordLength = cordLength;
        this.frequencyRange = frequencyRange;
        this.numberOfSpeakers = numberOfSpeakers;
        this.powerConsumption = powerConsumption;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "cordLength=" + cordLength +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
