package by.tc.task01.entity.factory;

import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class TabletPcFactory {

    TabletPC create(Map<String, String> parsedLine) {
        return new TabletPC(
                Double.parseDouble(parsedLine.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())),
                (String) parsedLine.get(SearchCriteria.TabletPC.COLOR.toString()),
                Double.parseDouble(parsedLine.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()))
        );
    }
}
