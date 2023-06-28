package org.barkouch.dao;

import org.springframework.stereotype.Component;

//@Component("dao") //? instancier la class DaoImpl comme nom 'dao'
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        //? Se connecter a la BD pour recuperer la temperature
        System.err.println("Version base de donnee");
        double temp =  Math.random()*40;
        return Math.round(temp);
    }
}
