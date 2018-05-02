package pojo.comparator;

import entity.plain.Plane;

import java.util.Comparator;

public class PlaneDistanceComparator implements Comparator<Plane> {
    @Override
    public int compare(Plane plane_1, Plane plane_2) {
        int answer = 0;
        double firstPlaneDistance = plane_1.getFlyDistance();
        double secondPlaneDistance = plane_2.getFlyDistance();
        if (firstPlaneDistance < secondPlaneDistance)
            answer = 1;
        if (firstPlaneDistance > secondPlaneDistance)
            answer = -1;
        return answer;
    }
}
