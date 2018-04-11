package presenter.lifecycle;

import presenter.lifecycle.action.ActionInterface;
import presenter.lifecycle.action.impl.AddProductAction;
import presenter.lifecycle.action.impl.ExitAction;
import presenter.lifecycle.action.impl.FindProductAction;
import resource.PropertiesManager;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class ActionPanel {
    private List<ActionInterface> actions = new ArrayList<>();
    private Validator validator = new Validator();

    public ActionPanel(boolean isAdmin) {
        actions.add(new FindProductAction());
        actions.add(new ExitAction());
        if (isAdmin) actions.add(new AddProductAction());
    }

    public void start(){
        String actionNames = "";
        for (ActionInterface action : actions) {
            actionNames += " " + action.getName();
        }
        ActionInterface action;
        String userAns = "";
        View.print(PropertiesManager.getManager().getMessagesProperty("message.action") + actionNames);
        while ((action = validator.validateAction(userAns)) == null){
            userAns = View.readString();
        }
        action.execute(this);
    }

    private class Validator{
        ActionInterface validateAction(String userAns){
            for (ActionInterface act : actions) {
                if (act.getName().equals(userAns)) {
                    return act;
                }
            }
            return null;
        }
    }
}
