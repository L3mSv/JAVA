package SistemaEmpresa;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private static int maxFuncionarios = 10;
    private Funcionario[] funcionarios;

    public Empresa(String nomeEmpresa, String cnpj)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.funcionarios = new Funcionario[maxFuncionarios];
    }

    public boolean adicionaFuncionario(Funcionario funcionario)
    {
        for(int i = 0; i < funcionarios.length; ++i)
        {
            if(funcionarios[i] == null)
            {
                funcionarios[i] = funcionario;
                return true;
            }
        }
        System.out.println("Nao foi possivel adicionar: limite de funcionarios atingido!");
        return false;
    }

    public void ImprimeDadosFuncionario(Funcionario funcionario)
    {
        System.out.println("\nNome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Matricula: " + funcionario.getMatricula());
        System.out.printf("Salario: %.2f\n", funcionario.getSalario());
    }

    public void encontraFuncionario(int matriculaFuncionario)
    {
        boolean achou = false;
        for(int i = 0;  i < funcionarios.length; ++i)
        {
            if(funcionarios[i] != null && funcionarios[i].getMatricula() == matriculaFuncionario)
            {
                ImprimeDadosFuncionario(funcionarios[i]);
                achou = true;
            }
        }

        if(achou == false)
            System.out.println("\nFuncionario nao encontrado!");

    }

    public void setNomeEmpresa(String novoNomeEmpresa)
    {
        this.nomeEmpresa = novoNomeEmpresa;
    }

    public void setCnpj(String novoCnpj)
    {
        this.cnpj = novoCnpj;
    }

    public String getNomeEmpresa()
    {
        return this.nomeEmpresa;
    }

    public String getCnpj()
    {
        return this.cnpj;
    }

}
