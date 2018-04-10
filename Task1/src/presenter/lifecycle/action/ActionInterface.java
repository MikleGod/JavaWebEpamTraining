package presenter.lifecycle.action;

import presenter.lifecycle.ActionPanel;

public interface ActionInterface {
    void execute(ActionPanel panel);
    String getName();
}
