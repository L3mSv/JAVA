package PO_LISTAS.POLIMORFISMO.SistemaJogo;

public class Guerreiro extends Personagem{

    public Guerreiro(int vida, int ataque, int defesa) {
        super(vida, ataque, defesa);
    }
    
    @Override
    public void mover()
    {
        System.out.println("Guerreiro movendo");
    }

    @Override
    public void atacar()
    {
        System.out.println("Guerreiro Atacando");
    }

    @Override
    public void defender()
    {
        System.out.println("Guerreiro Defendendo");
    }     
}
