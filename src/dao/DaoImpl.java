package dao;

public class DaoImpl implements InterfaceDao{
    @Override

    public double getData(){
        /*
        Se connecter à la BD pour récupérer à température
         */
        System.out.println("version base de données");
        double tem=Math.random()*40;
        return tem;
    }

}
