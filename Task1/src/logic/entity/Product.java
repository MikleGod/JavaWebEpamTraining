package logic.entity;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private List<Attribute> attributes = new ArrayList<>();

    public Product() {
    }

    public Product(String name, List<Attribute> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
