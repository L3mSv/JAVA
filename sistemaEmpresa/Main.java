package SistemaEmpresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Bradesco", "123.435.324-32");
        Funcionario funcionario1 = new Funcionario("Raul", "312.254.477.-78", 30000);
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario("984.945.856-92", 100000);

        empresa.adicionaFuncionario(funcionario1);
        empresa.adicionaFuncionario(funcionario2);
        empresa.adicionaFuncionario(funcionario3);
        empresa.encontraFuncionario(3);
        empresa.ImprimeDadosFuncionario(funcionario1);
        empresa.encontraFuncionario(24);
    }
}
