package presenter.lifecycle.action.impl;

import presenter.lifecycle.ActionPanel;
import resource.PropertiesManager;

public class ExitAction implements presenter.lifecycle.action.ActionInterface {
    @Override
    public void execute(ActionPanel panel) {

    }

    @Override
    public String getName() {
        return PropertiesManager.getManager().getMessagesProperty("action.exit");
    }
}
