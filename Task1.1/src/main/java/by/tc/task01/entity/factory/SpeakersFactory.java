package by.tc.task01.entity.factory;

import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class SpeakersFactory {

    Speakers create(Map<String, String> parsedLine) {
        return new Speakers(
                Double.parseDouble(parsedLine.get(SearchCriteria.Speakers.CORD_LENGTH.toString())),
                (String) parsedLine.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()),
                Integer.parseInt(parsedLine.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())),
                Double.parseDouble(parsedLine.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()))
        );
    }
}
