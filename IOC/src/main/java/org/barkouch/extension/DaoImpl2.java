package org.barkouch.extension;

import org.barkouch.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.err.println("Version capteur");
        return 43;
    }
}
