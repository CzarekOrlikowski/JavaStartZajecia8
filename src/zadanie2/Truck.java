package zadanie2;

public class Truck extends Car {
    double truckLoad;

    public Truck(String name, double tankCapacity, double averageFuelConsumption) {
        super(name, tankCapacity, averageFuelConsumption);
        this.truckLoad = 0;
    }

    public double getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(double truckLoad) {
        this.truckLoad = truckLoad;
    }

    @Override
    public Double rangeCalculator() {
        double range;
        double realFuelConsumption;

        if (!airConditioning) {
            realFuelConsumption = getAverageFuelConsumption();
        } else {
            realFuelConsumption = getAverageFuelConsumption() + 1.6;
        }

        if (getTruckLoad() > 0) {
            realFuelConsumption +=  0.5 * (getTruckLoad() / 100);
        } else {
            realFuelConsumption += 0;

        }
        return 100 * (getTankCapacity() / realFuelConsumption);
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", " + getTruckLoad();
    }
}
