package main;

import entity.factory.PlainFactory;
import pojo.AirCompany;
import pojo.MinskAirCompany;

public class Application {
    public static void main(String[] args) {
        AirCompany company = new MinskAirCompany();

        company.add(PlainFactory.getAirbus310());
        company.add(PlainFactory.getBombardierCRJ100());
        company.add(PlainFactory.getIL62());

        System.out.println(company.countCommonCarryingCapacity());

        System.out.println(company.countCommonPassengerCapacity());

        System.out.println(company.findPlainsByFuelConsumption(420, 800));

        System.out.println(company.sortByFlyDistance());
    }
}
