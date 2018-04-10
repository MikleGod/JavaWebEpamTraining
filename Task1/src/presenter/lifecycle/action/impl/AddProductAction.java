package presenter.lifecycle.action.impl;

import logic.entity.Attribute;
import logic.entity.Product;
import presenter.Presenter;
import presenter.lifecycle.ActionPanel;
import resource.PropertiesManager;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class AddProductAction implements presenter.lifecycle.action.ActionInterface {

    private AddProductAnalyser analyser = new AddProductAnalyser();

    @Override
    public void execute(ActionPanel panel) {
        Presenter.getDbManager().insertProduct(analyser.analise());
        panel.start();
    }

    @Override
    public String getName() {
        return PropertiesManager.getManager().getMessagesProperty("action.add");
    }

    private class AddProductAnalyser{
        Product analise(){
            View.print(PropertiesManager.getManager().getMessagesProperty("message.add_product"));
            String name = View.readString();
            View.print(PropertiesManager.getManager().getMessagesProperty("message.add_product_attributes"));
            String attributes = View.readString();
            return new Product(name, makeAttributes(attributes));
        }

        List<Attribute> makeAttributes(String attributes){
            List<Attribute> att = new ArrayList<>();
            String[] pairs = attributes.split(";");
            for (String pair : pairs) {
                String[] whiteWalkers = pair.split("=");
                att.add(new Attribute(whiteWalkers[0], Double.parseDouble(whiteWalkers[1])));
            }
            return att;
        }
    }
}
