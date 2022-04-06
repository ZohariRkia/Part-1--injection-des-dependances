package prese;

import dao.InterfaceDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class prese2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(new File("config.txt"));
        String doaClassName=scanner.nextLine();
        Class cDao=Class.forName(doaClassName);
        InterfaceDao dao=(InterfaceDao) cDao.newInstance();
        //System.out.println(dao.getData());
        String metierClassName=scanner.nextLine();
        Class cMetier =Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",InterfaceDao.class);
        //metier.setDao(dao)
        method.invoke(metier,dao);
        System.out.println("Resultat=>"+metier.calcule());

    }
}
