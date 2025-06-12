package LISTA_04.Exec9;

public class DVD extends ItemBiblioteca{
    int duracaoMinutos;

    public DVD(String titulo, int duracaoMinutos)
    {
        super(titulo);
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setDuracaoMinutos(int novaDuracaoMinutos)
    {
        this.duracaoMinutos = novaDuracaoMinutos;
    }

    public int getDuracaoMinutos()
    {
        return this.duracaoMinutos;
    }

    @Override
    public String exibirDetalhes()
    {
        return   super.exibirDetalhes() +
                "\nDuração (minutos): " + this.duracaoMinutos;

    }
}
