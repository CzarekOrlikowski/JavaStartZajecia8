package zadanie4;

public class RoomUtils {

    public static void settingTemperaturePro(Room room) {
        if (room.getCurrentTemperature() > room.getFinalTemperature()) {
            double step = 2.0 / room.getVolume();
            System.out.printf("Temperatura aktualna: %.1f\n", room.getCurrentTemperature());
            room.setCurrentTemperature(room.getCurrentTemperature() - step);
            System.out.printf("Temperatura obniżona: %.1f\n", room.getCurrentTemperature());
        } else System.out.println("Klimatyzator nie włączy się!");
    }

    public static void settingTemperatureBasic(Room room) {
        if (room.getCurrentTemperature() > room.getFinalTemperature()) {
            double step = 1.0 / room.getVolume();
            System.out.printf("Temperatura aktualna: %.1f\n", room.getCurrentTemperature());
            room.setCurrentTemperature(room.getCurrentTemperature() - step);
            System.out.printf("Temperatura obniżona: %.1f\n", room.getCurrentTemperature());
        } else System.out.println("Klimatyzator nie włączy się!");
    }

    public static void turningAirConditioningOn(Room room) {
        if (room.getTypeAirConditioning() == Room.BASIC_AIR_CONDITIONING) {
            settingTemperatureBasic(room);
        } else {
            settingTemperaturePro(room);
        }
    }
}
