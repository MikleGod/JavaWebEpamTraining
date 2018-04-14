package presenter.lifecycle;

import resource.PropertiesManager;
import view.View;

public class Authentication {
    public boolean start(){

        boolean pass = false;
        View.print(PropertiesManager.getManager().getMessagesProperty("message.welcome"));
        if (View.readString().equalsIgnoreCase("n")){
            while (!pass){
                View.print(PropertiesManager.getManager().getMessagesProperty("message.admin"));
                String login = View.readString();
                View.print(PropertiesManager.getManager().getMessagesProperty("message.password"));
                String password = View.readString();
                pass = authenticate(login, password);
            }
            return true;
        }
        return false;
    }

    private boolean authenticate(String login, String password) {
        return login.equals(PropertiesManager.getManager().getAdministrationProperty("admin.login"))
                && password.equals(PropertiesManager.getManager().getAdministrationProperty("admin.password"));
    }
}
