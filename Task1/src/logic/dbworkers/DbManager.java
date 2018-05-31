package logic.dbworkers;

import logic.entity.Attribute;
import logic.entity.Product;

import java.util.List;

public interface DbManager {
    List<Product> findProducts(Product productCriterion);
    List<Product> getAllProducts();
    List<String> getAllProductNames();
    List<Attribute> findAttributes(String productName);
    void insertProduct(Product product);
}
