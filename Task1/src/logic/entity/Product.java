package logic.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  name.equalsIgnoreCase(product.name)&&
                attributes.equals(product.attributes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, attributes);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
