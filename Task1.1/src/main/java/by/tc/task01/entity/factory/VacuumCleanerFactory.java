package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class VacuumCleanerFactory {

    VacuumCleaner create(Map<String, String> parsedLine) {
        return new VacuumCleaner(
                Double.parseDouble(parsedLine.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())),
                (String) parsedLine.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()),
                (String) parsedLine.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()),
                (String) parsedLine.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()),
                Double.parseDouble(parsedLine.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()))
        );
    }
}
