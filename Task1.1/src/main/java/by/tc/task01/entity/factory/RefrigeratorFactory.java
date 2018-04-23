package by.tc.task01.entity.factory;

import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class RefrigeratorFactory {

    Refrigerator create(Map<String, String> parsedLine) {
        return new Refrigerator(
                Double.parseDouble(parsedLine.get(SearchCriteria.Refrigerator.WIDTH.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Refrigerator.HEIGHT.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Refrigerator.WEIGHT.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()))
        );
    }
}
