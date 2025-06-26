public class Empregado{
    private String nome;
    private double salario;
    private int ano_contratacao;

    public Empregado(String nome, double salario, int ano_contratacao)
    {
        this.nome = nome;
        this.salario = salario;
        this.ano_contratacao = ano_contratacao;
    }

    public double obterSalario()
    {
        return this.salario;
    }

    public double ConfiguraSalario(double salarioNovo)
    {
        salario += salarioNovo;
        return salario;
    }

    public String obterNome()
    {
        return this.nome;
    }

    public int obterAnoContratacao()
    {
        return this.ano_contratacao;
    }

    public double aumentarSalario(double aumento)
    {
        return salario += aumento;
    }

    public void imprimirDados()
    {
        System.out.println("Nome: " + this.nome + 
                            ", Salário: " + this.salario +
                             ", Ano de contratação: " + this.ano_contratacao);
    }
}
