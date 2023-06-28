package org.barkouch.metier;

import org.barkouch.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; //? couplage faible.

    //? Injecter dans la variable dao un objet d'une classe qui implement l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp;
    }
}
