package ir.moghadaszadeh.creational.singleton;

import java.util.Objects;

@SuppressWarnings("all")
public class DbConnection {

    private static DbConnection instance;

    private DbConnection() {
    }

    public static synchronized DbConnection getInstance() {
        if(Objects.isNull(instance)) {
            instance = new DbConnection();
        }
        return instance;
    }
}
