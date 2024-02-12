package entities.Cargos;

public class Dev extends Cargos
{
    private String nome;
    private double salario;
    public Dev(String nome, String cargo, double value)
    {
        super(cargo,value);
        this.nome = nome;
        if (value > 3000)
        {
            this.salario = value - (value * 0.1);
        }
        if (value <= 3000)
        {
            this.salario = value - (value * 0.2);
        }

    }

    @Override
    public String printInfos()
    {
        return ("Meu nome é: " + nome + " ,sou desenvolvedor e ganho: R$" + salario);
    }
}
