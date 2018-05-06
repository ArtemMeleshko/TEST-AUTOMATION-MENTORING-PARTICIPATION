package by.epam.task2.appliences;

public class Appliances implements Comparable<Appliances> {

    private String name;
    private double powerConsumption;
    private EnumAppliances enumAppliances;
    private boolean isTurnedOn;

    public EnumAppliances getEnumAppliences() {
        return enumAppliances;
    }

    public void setEnumAppliances(EnumAppliances enumAppliances) {
        this.enumAppliances = enumAppliances;
    }

    public Appliances(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.isTurnedOn = false;
    }

    public Appliances(String name, double powerConsumption, EnumAppliances enumAppliances, boolean isTurnedOn) {

        this.name = name;
        this.powerConsumption = powerConsumption;
        this.enumAppliances = enumAppliances;
        this.isTurnedOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setTurnedOff() {
        this.isTurnedOn = false;
        Electricical.getAppliencesTurnedOn().remove(this);

    }

    public void setTurnedOn() {
        this.isTurnedOn = true;
        Electricical.getAppliencesTurnedOn().add(this);
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public int compareTo(Appliances a) {
        return (int) (this.getPowerConsumption() - a.getPowerConsumption());
    }

    @Override
    public String toString() {
        return "ElectricalAppliances{" +
                "name = " + name +
                ", powerConsumption = " + powerConsumption +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }

}
