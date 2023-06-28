package org.barkouch.presentation;

import org.barkouch.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.barkouch"); //? scanner les packages
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
