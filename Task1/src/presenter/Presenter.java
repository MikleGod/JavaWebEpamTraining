package presenter;

import logic.dbworkers.DbManager;
import logic.dbworkers.dao.ProductDao;
import presenter.lifecycle.ActionPanel;
import presenter.lifecycle.Authentication;

public class Presenter {

    private static final DbManager manager = ProductDao.getDao();
    public static DbManager getDbManager(){
        return manager;
    }

    public void start(){
        new ActionPanel(new Authentication().start()).start();
    }
}
