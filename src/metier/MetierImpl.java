package metier;

import dao.InterfaceDao;

public class MetierImpl implements  IMetier{
   //coublage faible
    private InterfaceDao dao;
/*
Injecter dans la variable Dao un object
d'une classe qui implement l'interface InterfaceDao
 */
    public void setDao(InterfaceDao dao) {
        this.dao = dao;
    }

    @Override
    public  double calcule(){
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return  res;

    }
}
