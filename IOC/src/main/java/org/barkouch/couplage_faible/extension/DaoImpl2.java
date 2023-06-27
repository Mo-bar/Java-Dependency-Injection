package org.barkouch.couplage_faible.extension;

import org.barkouch.couplage_faible.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.err.println("Version capteur");
        return 43;
    }
}
