package zadanie2;

public class Car extends Vehicle {
    boolean airConditioning;

    public Car(String name, double tankCapacity, double averageFuelConsumption) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditioning = false;
    }

    public boolean getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Double rangeCalculator() {
        double range;
        double realFuelConsumption;

        if (!airConditioning) {
            realFuelConsumption = getAverageFuelConsumption();
        } else {
            realFuelConsumption = getAverageFuelConsumption() + 0.8;
        }
        return 100 * (getTankCapacity() / realFuelConsumption);
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", " + getAirConditioning();
    }
}
