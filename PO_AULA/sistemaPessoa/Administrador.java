public class Administrador extends Empregado{
    private double ajudaDeCusto;

    Administrador(String nome, String endereco, String telefone, double salarioBase, double imposto, double ajudaDeCusto)
    {
        super(nome, endereco, telefone, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calculaSalario()
    {
        double salarioLiquido = getSalarioBase() - (getSalarioBase() * getImposto())/100.0;
        return salarioLiquido;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + ", Endereco: " + getEndereco() + ", Telefone: " + getTelefone() + ", Codigo Setor: " + getCodigo() + ", Salario Liquido: " + calculaSalario() + ", AjudaDeCusto: " + this.ajudaDeCusto;
    }
}
