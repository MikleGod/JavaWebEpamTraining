package logic.dbworkers.dao;

import logic.entity.Attribute;
import logic.entity.Product;
import logic.dbworkers.DbManager;
import resource.PropertiesManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDao implements DbManager {

    private static ProductDao instance = new ProductDao();

    private FileReader initReader() {
        FileReader reader = null;
        try {
            reader = new FileReader(PropertiesManager.getManager().getDbProperty("db.path"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reader;
    }

    private FileWriter initWriter() {
        FileWriter writer = null;
        try {
            writer = new FileWriter(PropertiesManager.getManager().getDbProperty("db.path"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer;
    }

    public static ProductDao getDao() {
        return instance;
    }

    private ProductDao() {
    }

    @Override
    public List<Product> findProducts(Product productCriterion) {
        List<Product> foundProducts = new ArrayList<>();
        findProducts(foundProducts, productCriterion.getName(), productCriterion.getAttributes());
        return foundProducts;
    }

    @Override
    public List<Product> getAllProducts() {
        FileReader reader = initReader();
        Scanner scanner = new Scanner(reader);
        List<Product> products = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            List<Attribute> tempAttributes = new ArrayList<>();
            String[] tempLine_1 = line.split(":");
            String tempName = tempLine_1[0].trim();
            tempLine_1[1] = tempLine_1[1].replaceAll(";", "");
            String[] tempLine_2 = tempLine_1[1].split(",");
            for (String s : tempLine_2) {
                String[] tempLine_3 = s.split("=");
                tempAttributes.add(new Attribute(tempLine_3[0].trim(), Double.parseDouble(tempLine_3[1].trim())));
            }
            products.add(new Product(tempName, tempAttributes));
        }
        scanner.close();
        return products;
    }

    @Override
    public List<String> getAllProductNames() {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(initReader());
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tempLine_1 = line.split(":");
            String tempName = tempLine_1[0].trim();
            if (!names.contains(tempName))
                names.add(tempName);
        }
        scanner.close();
        return names;
    }

    @Override
    public List<Attribute> findAttributes(String productName) {
        Scanner scanner = new Scanner(initReader());
        List<Attribute> attributes = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tempLine_1 = line.split(":");
            if (tempLine_1[0].trim().equals(productName)) {
                tempLine_1[1] = tempLine_1[1].replaceAll(";", "");
                String[] tempLine_2 = tempLine_1[1].split(",");
                for (String s : tempLine_2) {
                    String[] tempLine_3 = s.split("=");
                    Attribute attribute = new Attribute(tempLine_3[0].trim(), Double.parseDouble(tempLine_3[1].trim()));
                    attributes.add(attribute);
                }
                break;
            }
        }
        scanner.close();
        return attributes;
    }

    @Override
    public void insertProduct(Product product) {
        //TODO
    }

    private void findProducts(List<Product> foundProducts, String name, List<Attribute> attributes) {
        FileReader reader = initReader();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            List<Attribute> tempAttributes = new ArrayList<>();
            String[] tempLine_1 = line.split(":");
            String tempName = tempLine_1[0].trim();
            tempLine_1[1] = tempLine_1[1].replaceAll(";", "");
            String[] tempLine_2 = tempLine_1[1].split(",");
            for (String s : tempLine_2) {
                String[] tempLine_3 = s.split("=");
                Attribute attribute = new Attribute(tempLine_3[0].trim(), Double.parseDouble(tempLine_3[1].trim()));
                tempAttributes.add(attribute);
            }
            if (tempName.equals(name)) {
                for (Attribute attribute : attributes) {
                    for (Attribute tempAttribute : tempAttributes) {
                        if (tempAttribute.getName().equals(attribute.getName()) && tempAttribute.getCost().equals(attribute.getCost())) {
                            foundProducts.add(new Product(name, tempAttributes));
                            break;
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
