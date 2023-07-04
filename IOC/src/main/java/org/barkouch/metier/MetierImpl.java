package org.barkouch.metier;

import org.barkouch.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    //@Autowired  //? chercher dans les object de type IDao qui deja cree, puis faire l'injection au variable dao
    //@Qualifier("dao2") //?specifier lequelle instance que vous voulez injecte
    private IDao dao; //? couplage faible.

    //? le permier objet qui va trouve sur le beans, il va injecte
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

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

