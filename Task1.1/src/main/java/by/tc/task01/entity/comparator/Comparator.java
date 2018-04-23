package by.tc.task01.entity.comparator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface Comparator {
    <E> boolean compare(Criteria<E> criteria, Appliance appliance);
}
