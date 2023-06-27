package org.barkouch.couplage_faible.presentation;

import org.barkouch.couplage_faible.dao.DaoImpl;
import org.barkouch.couplage_faible.dao.IDao;
import org.barkouch.couplage_faible.extension.DaoImpl2;
import org.barkouch.couplage_faible.metier.MetierImpl;

public class Presentaion {
    public static void main(String[] args) {

        //? Injection des dependaces par instanciation statique (new ).
        IDao dao = new DaoImpl();
        System.out.println(dao.getData());

        dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}