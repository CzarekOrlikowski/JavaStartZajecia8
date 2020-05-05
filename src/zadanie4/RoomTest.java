package zadanie4;

public class RoomTest {

    public static void main(String[] args) {

        Room room1 = new Room(1, 10, 20.4, 20.0, Room.PRO_AIR_CONDITIONING);
        Room room2 = new Room(2, 10, 22.2, 22.0, Room.BASIC_AIR_CONDITIONING);

        RoomUtils.turningAirConditioningOn(room1);
        RoomUtils.turningAirConditioningOn(room1);
        RoomUtils.turningAirConditioningOn(room1);
        System.out.println();

        RoomUtils.turningAirConditioningOn(room2);
        RoomUtils.turningAirConditioningOn(room2);
        RoomUtils.turningAirConditioningOn(room2);

    }
}
