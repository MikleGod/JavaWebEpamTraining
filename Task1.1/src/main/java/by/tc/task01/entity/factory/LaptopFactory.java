package by.tc.task01.entity.factory;

import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;




class LaptopFactory{

    Laptop create(Map<String, String> parsedLine) {
        return new Laptop(
                Double.parseDouble(parsedLine.get(SearchCriteria.Laptop.DISPLAY_INCHES.toString())),
                (String) parsedLine.get(SearchCriteria.Laptop.CPU.toString()),
                Double.parseDouble(parsedLine.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Laptop.MEMORY_ROM.toString())),
                (String) parsedLine.get(SearchCriteria.Laptop.OS.toString()),
                Double.parseDouble( parsedLine.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()))
        );
    }
}
