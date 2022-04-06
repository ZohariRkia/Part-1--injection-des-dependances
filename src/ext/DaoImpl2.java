package ext;

import dao.InterfaceDao;

public class DaoImpl2 implements InterfaceDao {
    @Override
    public  double getData(){

        System.out.println("Version capteurs");
        double temp=6000;
        return temp;
    }
}
