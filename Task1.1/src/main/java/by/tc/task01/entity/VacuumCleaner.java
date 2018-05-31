package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	// you may add your own code here
    private double cleaningWidth;
    private double motorSpeedRegulation;
    private String wandType;
    private String bagType;
    private String filterType;
    private double powerConsumption;

    public VacuumCleaner() {
    }

    public VacuumCleaner(double cleaningWidth, double motorSpeedRegulation, String wandType, String bagType, String filterType, double powerConsumption) {
        this.cleaningWidth = cleaningWidth;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.wandType = wandType;
        this.bagType = bagType;
        this.filterType = filterType;
        this.powerConsumption = powerConsumption;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "cleaningWidth=" + cleaningWidth +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", wandType='" + wandType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", filterType='" + filterType + '\'' +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
