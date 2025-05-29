public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida)
    {
        super(nome, endereco, telefone);
        this.valorDivida = valorDivida;
        this.valorCredito = valorCredito;
    }

    public double obterSaldo()
    {
        this.valorCredito -= this.valorDivida;
        return this.valorCredito;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + ", Endereco: " + getEndereco() + ", Telefone: " + getTelefone() + ", Credito: " + this.valorCredito + ", Divida: " + this.valorDivida + ", Saldo: " + obterSaldo();
    }
}
