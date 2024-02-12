package entities.Cargos;

import java.util.ArrayList;
import java.util.List;

public class Cargos
{
    private List<Cargos> employees;
    private String cargo;
    private double value;

    public Cargos()
    {
        this.employees = new ArrayList<>();
    }
    public Cargos(String cargo, double value)
    {
        this.cargo = cargo;
        this.value = value;
        this.employees = new ArrayList<>();
    }

    public List<Cargos> getEmployees()
    {
        return employees;
    }

    public void addcargos(Cargos newEmployee)
    {
        employees.add(newEmployee);
    }

    public String printInfos()
    {
        return cargo + value;
    }
}
