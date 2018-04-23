package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliance = null;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);
        criteriaOven.add(Oven.CAPACITY, 33.0);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria<Oven>(Oven.class);
        //criteriaOven.add(Oven.HEIGHT, 40.0);
        criteriaOven.add(Oven.DEPTH, 60.0);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
        criteriaTabletPC.add(TabletPC.COLOR, "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14.0);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000.0);


        appliance = service.find(criteriaTabletPC);


        PrintApplianceInfo.print(appliance);

    }

}
