package PO_LISTAS.POLIMORFISMO.SistemaJogo;

public class Arqueiro extends Personagem{

    public Arqueiro(int vida, int ataque, int defesa) {
        super(vida, ataque, defesa);
    }
    
    @Override
    public void mover()
    {
        System.out.println("Arqueiro movendo");
    }

    @Override
    public void atacar()
    {
        System.out.println("Arqueiro Atacando");
    }

    @Override
    public void defender()
    {
        System.out.println("Arqueiro Defendendo");
    }  
}
