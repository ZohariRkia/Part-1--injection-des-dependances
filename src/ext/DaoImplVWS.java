package ext;

import dao.InterfaceDao;

public class DaoImplVWS implements InterfaceDao {
    @Override
    public  double getData(){
        System.out.println("Version Web service");
        return 90;
    }
}
