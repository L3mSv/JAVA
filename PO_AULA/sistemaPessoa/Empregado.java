public class Empregado extends Pessoa{
    private static int codigoSetor = 1;
    private int meuCodigoSetor;
    private double salarioBase;
    private double imposto;

    Empregado(String nome, String endereco, String telefone, double salarioBase, double imposto)
    {
        super(nome, endereco, telefone);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.meuCodigoSetor = codigoSetor;
        codigoSetor++;
    }

    public int getCodigo()
    {
        return this.meuCodigoSetor;
    }

    public double getSalarioBase()
    {
        return this.salarioBase;
    }
    

    public double getImposto()
    {
        return this.imposto;
    }

    
    public void setSalarioBase(double novoSalarioBase)
    {
        this.salarioBase = novoSalarioBase;
    }
    

    public void setImposto(double novoImposto)
    {
        this.imposto = novoImposto;
    }
    

    public double calculaSalario()
    {
        this.salarioBase -= (this.salarioBase * this.imposto)/100.0;
        return salarioBase;
    }

    @Override
    public String toString()
    {
        return "Nome: " + getNome() + ", Endereco: " + getEndereco() + ", Telefone: " + getTelefone() + ", Codigo Setor: "+ this.meuCodigoSetor + ", Saldo Liquido= " + calculaSalario();
    }
}
