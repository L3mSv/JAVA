package PO_LISTAS.POLIMORFISMO.SistemaJogo;

public class Mago extends Personagem{

    public Mago(int vida, int ataque, int defesa) {
        super(vida, ataque, defesa);
    }
    
    @Override
    public void mover()
    {
        System.out.println("Mago movendo");
    }

    @Override
    public void atacar()
    {
        System.out.println("Mago Atacando");
    }

    @Override
    public void defender()
    {
        System.out.println("Mago Defendendo");
    }   
    
}
