package entities.Cargos;

public class Dba extends Cargos
{
    private String nome;
    private double salario;
    public Dba(String nome, String cargo, double value)
    {
        super(cargo, value);
        this.nome = nome;
        if (value > 3000)
        {
            this.salario = value - (value * 0.15);
        }
        if (value <= 3000)
        {
            this.salario = value - (value * 0.20);
        }
    }
    @Override
    public String printInfos()
    {
        return "Meu nome é: " + nome + ",eu sou DBA, e meu salario é: R$:" + salario;
    }
}
