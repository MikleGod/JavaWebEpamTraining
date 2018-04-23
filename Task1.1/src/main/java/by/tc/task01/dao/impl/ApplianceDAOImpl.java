package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.comparator.Comparator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.factory.ApplianceFactory;
import com.sun.istack.internal.Nullable;
import javafx.scene.control.Tab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String PATH = "path";
    private Scanner scanner;
    private Comparator comparator = new MyComparator();

    public ApplianceDAOImpl(@Nullable Comparator comparator) {
        if (comparator != null)
            this.comparator = comparator;
    }

    @Override
    public <E> List<Appliance> find(Criteria<E> criteria) {
        List<Appliance> appliances = null;
        try {
            appliances = findAppliances(criteria);
        } catch (FileNotFoundException e) {
            //КТО ДОЛЖЕН ЕГО ОБРАБАТЫВАТЬ???????????
            hadleException(e);
            return null;
        } finally {
            andFileWork();
        }
        return appliances;
    }

    private void andFileWork() {
        scanner.close();
    }

    private void hadleException(FileNotFoundException e) {
        //???
    }

    private <E> List<Appliance> findAppliances(Criteria<E> criteria) throws FileNotFoundException {
        List<Appliance> appliances;
        scanner = new Scanner(new FileReader(PATH));
        appliances = new ArrayList<Appliance>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line != null && !line.isEmpty()) {
                Appliance appliance = ApplianceFactory.getInstance().create(parseLine(line));
                if (comparator.compare(criteria, appliance)) {
                    appliances.add(appliance);
                }
            }
        }
        return appliances;
    }

    @Override
    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    private Map<String, String> parseLine(String line) {
        Map<String, String> map = new HashMap<String, String>();
        String[] nameAndAttrs = line.split(" : ");
        map.put(ApplianceFactory.MAP_GROUP_NAME_KEY, nameAndAttrs[0]);
        String[] attrs_plus_values = nameAndAttrs[1].split(", ");
        for (String attr_plus_value : attrs_plus_values) {
            String[] attr_and_value = attr_plus_value.split("=");
            try {
                map.put(attr_and_value[0], attr_and_value[1].replaceAll("\t", ""));
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
        super.finalize();
    }

    private static class MyComparator implements Comparator {
        //Мне эта машина самому не нравится, но ничего другого я не придумал((((
        @Override
        public <E> boolean compare(Criteria<E> criteria, Appliance appliance) {
            boolean answer = false;
            Map<E, Object> map = criteria.getCriteria();
            Object value;
            if (criteria.getGroupSearchName() == SearchCriteria.Oven.class && appliance instanceof Oven) {
                if ((value = map.get(SearchCriteria.Oven.CAPACITY)) != null && ((Double) value).equals(((Oven) appliance).getCapacity())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Oven.DEPTH)) != null && ((Double) value).equals(((Oven) appliance).getDepth())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Oven.HEIGHT)) != null && ((Double) value).equals(((Oven) appliance).getHeight())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Oven.POWER_CONSUMPTION)) != null && ((Double) value).equals(((Oven) appliance).getPowerConsumption())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Oven.WEIGHT)) != null && ((Double) value).equals(((Oven) appliance).getWeight())) {
                    answer = true;
                }
            } else if (criteria.getGroupSearchName() == SearchCriteria.Laptop.class && appliance instanceof Laptop) {
                if ((value = map.get(SearchCriteria.Laptop.BATTERY_CAPACITY)) != null && ((Double) value).equals(((Laptop) appliance).getBatteryCapacity())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Laptop.OS)) != null && ((String) value).equals(((Laptop) appliance).getOs())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Laptop.MEMORY_ROM)) != null && ((Double) value).equals(((Laptop) appliance).getMemoryRom())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Laptop.SYSTEM_MEMORY)) != null && ((Double) value).equals(((Laptop) appliance).getSystemMemory())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Laptop.CPU)) != null && ((String) value).equals(((Laptop) appliance).getCpu())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Laptop.DISPLAY_INCHES)) != null && ((Double) value).equals(((Laptop) appliance).getDisplayInches())) {
                    answer = true;
                }
            } else if (criteria.getGroupSearchName() == SearchCriteria.Refrigerator.class && appliance instanceof Refrigerator) {
                if ((value = map.get(SearchCriteria.Refrigerator.WIDTH)) != null && ((Double) value).equals(((Refrigerator) appliance).getWidth())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION)) != null && ((Double) value).equals(((Refrigerator) appliance).getPowerConsumption())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY)) != null && ((Double) value).equals(((Refrigerator) appliance).getFreezerCapacity())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Refrigerator.HEIGHT)) != null && ((Double) value).equals(((Refrigerator) appliance).getHeight())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY)) != null && ((Double) value).equals(((Refrigerator) appliance).getOverallCapacity())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Refrigerator.WEIGHT)) != null && ((Double) value).equals(((Refrigerator) appliance).getWeight())) {
                    answer = true;
                }
            } else if (criteria.getGroupSearchName() == SearchCriteria.Speakers.class && appliance instanceof Speakers) {
                if ((value = map.get(SearchCriteria.Speakers.POWER_CONSUMPTION)) != null && ((Double) value).equals(((Speakers) appliance).getPowerConsumption())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Speakers.CORD_LENGTH)) != null && ((Double) value).equals(((Speakers) appliance).getCordLength())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Speakers.FREQUENCY_RANGE)) != null && ((String) value).equals(((Speakers) appliance).getFrequencyRange())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS)) != null && ((Integer) value).equals(((Speakers) appliance).getNumberOfSpeakers())) {
                    answer = true;
                }
            } else if (criteria.getGroupSearchName() == SearchCriteria.TabletPC.class && appliance instanceof TabletPC) {
                TabletPC tabletPC = (TabletPC) appliance;
                if ((value = map.get(SearchCriteria.TabletPC.BATTERY_CAPACITY)) != null && value.equals((tabletPC.getBatteryCapacity()))) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.TabletPC.COLOR)) != null && value.equals((tabletPC.getColor()))) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.TabletPC.DISPLAY_INCHES)) != null && value.equals((tabletPC.getDisplayInches()))) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY)) != null && value.equals((tabletPC.getFlashMemoryCapacity()))) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.TabletPC.MEMORY_ROM)) != null && value.equals((tabletPC.getMemoryRom()))) {
                    answer = true;
                }
            } else if (criteria.getGroupSearchName() == SearchCriteria.VacuumCleaner.class && appliance instanceof VacuumCleaner) {
                if ((value = map.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH)) != null && ((Double) value).equals(((VacuumCleaner) appliance).getCleaningWidth())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION)) != null && ((Double) value).equals(((VacuumCleaner) appliance).getMotorSpeedRegulation())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.VacuumCleaner.BAG_TYPE)) != null && ((String) value).equals(((VacuumCleaner) appliance).getBagType())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.VacuumCleaner.FILTER_TYPE)) != null && ((String) value).equals(((VacuumCleaner) appliance).getFilterType())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.VacuumCleaner.WAND_TYPE)) != null && ((Double) value).equals(((VacuumCleaner) appliance).getFilterType())) {
                    answer = true;
                }
                if ((value = map.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION)) != null && ((Double) value).equals(((VacuumCleaner) appliance).getPowerConsumption())) {
                    answer = true;
                }
            }
            return answer;
        }
    }

}
