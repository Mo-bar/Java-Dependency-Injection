package org.barkouch.presentation;

import org.barkouch.dao.IDao;
import org.barkouch.metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //? Injection des dependaces par instanciation dynamique

        Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName); //? charger la classe en memoire si exists
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao); //? metier.setDao(Dao)

        System.out.println(metier.calcul());
    }
}
