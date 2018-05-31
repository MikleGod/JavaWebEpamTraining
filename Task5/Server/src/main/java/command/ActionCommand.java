package command;

import java.io.Serializable;

public interface ActionCommand {
    <T extends Serializable, K> T doAction(K parameter);
}
