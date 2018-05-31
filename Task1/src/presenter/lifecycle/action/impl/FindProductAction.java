package presenter.lifecycle.action.impl;

import logic.entity.Attribute;
import logic.entity.Product;
import presenter.Presenter;
import presenter.lifecycle.ActionPanel;
import resource.PropertiesManager;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class FindProductAction implements presenter.lifecycle.action.ActionInterface {
    @Override
    public void execute(ActionPanel panel) {
        View.print(PropertiesManager.getManager().getMessagesProperty("message.product") + getProductNames());
        String productName = View.readString().trim();
        List<Product> products = Presenter.getDbManager().findProducts(new Product(productName, getAttributes(productName)));
        if (!products.isEmpty())
            View.print(products);
        else
            View.print(PropertiesManager.getManager().getMessagesProperty("message.empty_found_list"));
        panel.start();
    }

    private List<Attribute> getAttributes(String productName) {
        List<Attribute> attributes = new ArrayList<>();
        //String ans = "";
        View.print(
                PropertiesManager.getManager().getMessagesProperty("message.attributes_name")
                        + showPossibleAttributes(productName)
        );
        String attrName = View.readString();
        View.print(PropertiesManager.getManager().getMessagesProperty("message.attribute_value"));
        Double value = View.readDouble();
        //View.print(PropertiesManager.getManager().getMessagesProperty("message.next_attr"));
        attributes.add(new Attribute(attrName, value));
        //ans = View.readString();
        return attributes;
    }

    private String showPossibleAttributes(String productName) {
        List<Attribute> possibleAttrs = Presenter.getDbManager().findAttributes(productName);
        String possibleAtt = "";
        for (Attribute possibleAttr : possibleAttrs) {
            possibleAtt += " " + possibleAttr.getName();
        }
        return possibleAtt;
    }

    private String getProductNames() {
        List<String> names = Presenter.getDbManager().getAllProductNames();
        String productNames = "";
        for (String name : names) {
            productNames += " " + name;
        }
        return productNames;
    }

    @Override
    public String getName() {
        return PropertiesManager.getManager().getMessagesProperty("action.find");
    }
}
