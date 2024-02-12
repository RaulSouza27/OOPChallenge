package entities.Cargos;

public class Tester extends Cargos
{
    private String nome;
    private double salario;
    public Tester(String nome, String cargos, double value)
    {
        super(cargos, value);
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
        return "Meu nome é: " + nome + " ,eu sou tester e ganho R$ " + salario;
    }
}
