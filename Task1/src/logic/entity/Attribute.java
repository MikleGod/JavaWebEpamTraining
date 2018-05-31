package logic.entity;

public class Attribute {
    private String name;
    private Double cost;

    public Attribute() {
    }

    public Attribute(String name) {
        this.name = name;
    }

    public Attribute(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null)
            return false;
        Attribute attribute = (Attribute) o;
        return attribute.getCost() != null && attribute.getName() != null && attribute.getName().equals(name) && attribute.getCost().equals(cost) ;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
