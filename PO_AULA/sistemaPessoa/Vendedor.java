public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;

    Vendedor(String nome, String endereco, String telefone, double salarioBase, double imposto, double comissao)
    {
        super(nome, endereco, telefone, salarioBase, imposto);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario()
    {
        double salarioLiquido = getSalarioBase() - (getSalarioBase() * getImposto())/100.0;
        return salarioLiquido;
    }

    public void realizaVenda(double valorVendido)
    {
        this.valorVendas += valorVendido;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + ", Endereco: " + getEndereco() + ", Telefone: " + getTelefone() + ", Codigo Setor: " + getCodigo() + ", Salario Liquido: " + calculaSalario() + ", Vendas: " + this.valorVendas + ", Comissao: " + this.comissao + "%, Salario Total: " + (getSalarioBase() + (valorVendas * comissao)/100.0);
    }
}
