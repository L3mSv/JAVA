package SistemaEmpresa;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private static int proxMatricula = 1;
    private final int matricula; 

    public Funcionario()
    {
        this.matricula = proxMatricula++;
    }

    public Funcionario(String cpf, double salario)
    {
        this.matricula = proxMatricula++;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, double salario)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.matricula = proxMatricula++;
    }

    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }

    public void setCpf(String novoCpf)
    {
        this.cpf = novoCpf;
    }

    public void setSalario(double novoSalario)
    {
        this.salario = novoSalario;
    }

    public int getMatricula()
    {
        return this.matricula;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getCpf()
    {
        return this.cpf;
    }

    public double getSalario()
    {
        return this.salario;
    }
}
