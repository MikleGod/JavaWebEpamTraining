package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class OvenFactory {

    Oven create(Map<String, String> parsedLine) {
        return new Oven(
                Double.parseDouble(parsedLine.get(SearchCriteria.Oven.WEIGHT.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Oven.HEIGHT.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Oven.DEPTH.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Oven.CAPACITY.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Oven.WEIGHT.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()))
        );
    }
}
