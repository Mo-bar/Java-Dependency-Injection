package org.barkouch.presentation;

import org.barkouch.dao.DaoImpl;
import org.barkouch.dao.IDao;
import org.barkouch.extension.DaoImpl2;
import org.barkouch.metier.MetierImpl;

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