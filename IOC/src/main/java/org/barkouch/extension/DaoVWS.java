package org.barkouch.extension;

import org.barkouch.dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoVWS implements IDao {
    @Override
    public double getData() {
        System.err.println("Version web service");
        return 99;
    }
}
