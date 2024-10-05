package ir.moghadaszadeh.creational.singleton;

import java.util.Objects;

@SuppressWarnings("all")
public class DbConnection {

    private static DbConnection instance;

    private DbConnection() {
        initConnection();
    }

    public static synchronized DbConnection getInstance() {
        if(Objects.isNull(instance)) {
            instance = new DbConnection();
        }
        return instance;
    }

    private void initConnection() {
        /*
        ...
         */
    }
}
