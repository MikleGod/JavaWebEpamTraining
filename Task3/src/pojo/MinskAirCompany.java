package pojo;

import entity.plain.Plane;
import pojo.comparator.PlaneDistanceComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinskAirCompany implements AirCompany {

    private List<Plane> planes = new ArrayList<>();
    private Comparator<Plane> distanceComparator = new PlaneDistanceComparator();


    @Override
    public List<Plane> sortByFlyDistance() {
        planes.sort(distanceComparator);
        return planes;
    }

    @Override
    public List<Plane> findPlainsByFuelConsumption(double from, double to) {
        List<Plane> answer = new ArrayList<>();
        for (Plane plane : planes) {
            double fuelConsumption = plane.getFuelConsumption();
            if (fuelConsumption <= to && fuelConsumption >= from)
                answer.add(plane);
        }
        return answer;
    }

    @Override
    public int countCommonPassengerCapacity() {
        int commonPassengerCapacity = 0;
        for (Plane plane : planes) {
            commonPassengerCapacity += plane.getPassengerCapacity();
        }
        return commonPassengerCapacity;
    }

    @Override
    public double countCommonCarryingCapacity() {
        double commonCarryingCapacity = 0;
        for (Plane plane : planes) {
            commonCarryingCapacity += plane.getCarryingCapacity();
        }
        return commonCarryingCapacity;
    }

    @Override
    public void add(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void remove(Plane plane) {
        planes.remove(plane);
    }

    @Override
    public void remove(int position) {
        planes.remove(position);
    }
}
