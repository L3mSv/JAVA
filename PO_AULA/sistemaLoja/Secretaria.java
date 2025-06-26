public class Secretaria extends Empregado{
    private String nome;
    private double salario;
    private int ano_contratacao;
    private String[] ultimos_nomes;
    private static int contador_de_nomes = 0;

    public Secretaria(String nome, double salario, int ano_contratacao)
    {   
        super(nome, salario, ano_contratacao);
        this.ultimos_nomes = new String[4];
    }

    public void anotarContato(String nome){
        ultimos_nomes[contador_de_nomes++] = nome;
    }

    @Override
    public void imprimirDados()
    {
        super.imprimirDados();
    }
}
