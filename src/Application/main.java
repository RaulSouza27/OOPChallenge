package Application;

import entities.Cargos.Cargos;
import entities.Cargos.Dba;
import entities.Cargos.Dev;
import entities.Cargos.Tester;

import java.util.ArrayList;
import java.util.List;

public class main
{
    public static void main(String[] args)
    {
        Dev dev1 = new Dev("Thiago","DEV",7000);
        Dev dev2 = new Dev("Jonas","DEV",6000);
        Dev dev3 = new Dev("Roses","DEV",5000);

        Dba dba1 = new Dba("Evangelista","Dba",3000);

        Tester tester1 = new Tester("Robsu", "Testador",3500);

        Cargos cargos = new Cargos();

        cargos.addcargos(dev1);
        cargos.addcargos(dev2);
        cargos.addcargos(dev3);
        cargos.addcargos(dba1);
        cargos.addcargos(tester1);

        for (int i = 0; i < cargos.getEmployees().size(); i++)
        {
            System.out.println(cargos.getEmployees().get(i).printInfos());
            System.out.println();
        }
    }
}
