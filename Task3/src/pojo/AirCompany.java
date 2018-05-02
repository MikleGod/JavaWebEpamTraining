package pojo;

import entity.plain.Plane;
import java.util.List;

public interface AirCompany {
    List<Plane> sortByFlyDistance();
    List<Plane> findPlainsByFuelConsumption(double from, double to);
    int countCommonPassengerCapacity();
    double countCommonCarryingCapacity();
    void add(Plane plane);
    void remove(Plane plane);
    void remove(int position);
}
