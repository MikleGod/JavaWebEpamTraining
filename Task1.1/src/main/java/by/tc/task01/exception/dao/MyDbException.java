package by.tc.task01.exception.dao;

import by.tc.task01.exception.MyProjectBaseException;

public class MyDbException extends MyProjectBaseException {
    public MyDbException() {
    }

    public MyDbException(String message) {
        super(message);
    }
}
