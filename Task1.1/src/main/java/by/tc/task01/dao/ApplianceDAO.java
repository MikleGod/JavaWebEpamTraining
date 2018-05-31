package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.comparator.Comparator;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
	<E> List<Appliance> find(Criteria<E> criteria);
	void setComparator(Comparator comparator);
}
