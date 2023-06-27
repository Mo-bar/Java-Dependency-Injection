package org.barkouch.couplage_faible.dao;

public class DaoImpl implements IDao{

    public DaoImpl() {
    }

    @Override
    public double getData() {
        //? Se connecter a la BD pour recuperer la temperature
        System.err.println("Version base de donnee");
        double temp =  Math.random()*40;
        return Math.round(temp);
    }
}
