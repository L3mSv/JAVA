public class Gerente extends Empregado{
    private String nome;
    private double salario;
    private int ano_contratacao;
    private Empregado[] subordinados;
    private static int numero_empregados = 0;
    private String nome_secretaria;

    public Gerente(String nome, double salario, int ano_contratacao, Secretaria secretaria, Empregado[] lista)
    {
        super(nome, salario, ano_contratacao);
        this.subordinados = new Empregado[lista.length];
        for(int i = 0; i < lista.length; i++)
        {
            this.subordinados[i] = lista[i];
        }
        
    }

    public void aumentarSalariosSubordinados(double salarioSecretaria, double salarioEmpregado)
    {
        for(int i = 0; i < subordinados.length; ++i){
            if(subordinados[i] instanceof Secretaria)
            {
                nome_secretaria = subordinados[i].obterNome();
                this.subordinados[i].ConfiguraSalario(salarioSecretaria);
            }
            this.subordinados[i].ConfiguraSalario(salarioEmpregado);
        }
    }

    public Empregado inserirEmpregado(Empregado empregado)
    {
        return this.subordinados[numero_empregados++] = empregado;
    }

    @Override
    public void imprimirDados()
    {
        super.imprimirDados();
        System.out.println(", Secretaria: " + this.nome_secretaria + ", Empregados: " + this.numero_empregados);
    }
}