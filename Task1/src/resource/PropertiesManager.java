package resource;

import java.util.ResourceBundle;

public class PropertiesManager {
    private static PropertiesManager manager = new PropertiesManager();
    private ResourceBundle administrationBundle = ResourceBundle.getBundle("resource/property/administration");
    private ResourceBundle dbBundle = ResourceBundle.getBundle("resource/property/db");
    private ResourceBundle messagesBundle = ResourceBundle.getBundle("resource/property/messages");

    private PropertiesManager(){}

    public static synchronized PropertiesManager getManager(){
        return manager;
    }

    public String getAdministrationProperty(String key){
        return administrationBundle.getString(key);
    }
    public String getDbProperty(String key){
        return dbBundle.getString(key);
    }
    public String getMessagesProperty(String key){
        return messagesBundle.getString(key);
    }
}
