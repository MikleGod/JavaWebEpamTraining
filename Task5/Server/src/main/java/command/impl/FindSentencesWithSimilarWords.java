package command.impl;

import command.ActionCommand;

import java.io.Serializable;

public class FindSentencesWithSimilarWords implements ActionCommand{

    public <T extends Serializable, K> T doAction(K parameter) {
        return (T) "dd";
    }
}
