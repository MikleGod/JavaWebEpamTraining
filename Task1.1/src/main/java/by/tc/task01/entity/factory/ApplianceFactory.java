package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class ApplianceFactory{
    public static final String MAP_GROUP_NAME_KEY = "groupName";
    private LaptopFactory laptopFactory = new LaptopFactory();
    private OvenFactory ovenFactory = new OvenFactory();
    private RefrigeratorFactory refrigeratorFactory = new RefrigeratorFactory();
    private SpeakersFactory speakersFactory = new SpeakersFactory();
    private TabletPcFactory tabletPcFactory = new TabletPcFactory();
    private VacuumCleanerFactory vacuumCleanerFactory = new VacuumCleanerFactory();

    private static ApplianceFactory instance = new ApplianceFactory();

    public static ApplianceFactory getInstance() {
        return instance;
    }

    private ApplianceFactory() {
    }

    public Appliance create(Map<String, String> parsedLine){
        Appliance answer;
        switch (SearchCriteria.GroupNames.valueOf(parsedLine.get(MAP_GROUP_NAME_KEY).toUpperCase())){
            case OVEN: answer = ovenFactory.create(parsedLine); break;
            case LAPTOP: answer = laptopFactory.create(parsedLine); break;
            case SPEAKERS: answer = speakersFactory.create(parsedLine); break;
            case TABLETPC: answer = tabletPcFactory.create(parsedLine); break;
            case REFRIGERATOR: answer = refrigeratorFactory.create(parsedLine); break;
            case VACUUMCLEANER: answer = vacuumCleanerFactory.create(parsedLine); break;
            default: answer = null;
        }
        return answer;
    }
}
