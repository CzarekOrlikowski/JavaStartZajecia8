package zadanie4;

public class Room {
    private int number;
    private double volume;
    private double currentTemperature;
    private double finalTemperature;
    private String typeAirConditioning;

    public static final String BASIC_AIR_CONDITIONING = "basic";
    public static final String PRO_AIR_CONDITIONING = "pro";

    public Room(int number, double volume, double currentTemperature, double finalTemperature, String typeAirConditioning) {
        this.number = number;
        this.volume = volume;
        this.currentTemperature = currentTemperature;
        this.finalTemperature = finalTemperature;
        this.typeAirConditioning = typeAirConditioning;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getFinalTemperature() {
        return finalTemperature;
    }

    public void setFinalTemperature(double finalTemperature) {
        this.finalTemperature = finalTemperature;
    }

    public String getTypeAirConditioning() {
        return typeAirConditioning;
    }

    public void setTypeAirConditioning(String typeAirConditioning) {
        this.typeAirConditioning = typeAirConditioning;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", volume=" + volume +
                ", currentTemperature=" + currentTemperature +
                ", finalTemperature=" + finalTemperature +
                ", typeAirConditioning='" + typeAirConditioning + '\'' +
                '}';
    }
}
