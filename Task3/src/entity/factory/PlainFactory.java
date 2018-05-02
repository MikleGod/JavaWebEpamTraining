package entity.factory;

import entity.plain.Airbus310;
import entity.plain.BombardierCRJ100;
import entity.plain.IL62;

public class PlainFactory {

    private static final double AIRBUS_FLY_DISTANCE = 30000;
    private static final double AIRBUS_QRH = 500;
    private static final double AIRBUS_CC = 3500;
    private static final double AIRBUS_FC = 700;
    private static final int AIRBUS_PC = 280;

    private static final double BOMBARDIER_FLY_DISTANCE = 3000;
    private static final double BOMBARDIER_CC = 350;
    private static final double BOMBARDIER_FC = 200;
    private static final double BOMBARDIER_MAX_CS = 700;
    private static final int BOMBARDIER_PC = 28;

    private static final double IL62_FLY_DISTANCE = 20000;
    private static final double IL62_CC = 3000;
    private static final double IL62_FC = 900;
    private static final double IL62_TAKE_OFF_LENGTH = 765;
    private static final int IL62_PC = 200;

    private PlainFactory(){}

    public static Airbus310 getAirbus310(){

        Airbus310 airbus = new Airbus310();

        airbus.setFlyDistance(AIRBUS_FLY_DISTANCE);
        airbus.setQuickReferenceHandbook(AIRBUS_QRH);
        airbus.setCarryingCapacity(AIRBUS_CC);
        airbus.setFuelConsumption(AIRBUS_FC);
        airbus.setPassengerCapacity(AIRBUS_PC);

        return airbus;
    }

    public static BombardierCRJ100 getBombardierCRJ100(){

        BombardierCRJ100 bombardierCRJ100 = new BombardierCRJ100();

        bombardierCRJ100.setFlyDistance(BOMBARDIER_FLY_DISTANCE);
        bombardierCRJ100.setMaxCruisingSpeed(BOMBARDIER_MAX_CS);
        bombardierCRJ100.setCarryingCapacity(BOMBARDIER_CC);
        bombardierCRJ100.setFuelConsumption(BOMBARDIER_FC);
        bombardierCRJ100.setPassengerCapacity(BOMBARDIER_PC);

        return bombardierCRJ100;
    }

    public static IL62 getIL62(){

        IL62 il62 = new IL62();

        il62.setFlyDistance(IL62_FLY_DISTANCE);
        il62.setTakeOffLength(IL62_TAKE_OFF_LENGTH);
        il62.setCarryingCapacity(IL62_CC);
        il62.setFuelConsumption(IL62_FC);
        il62.setPassengerCapacity(IL62_PC);

        return il62;
    }
}
