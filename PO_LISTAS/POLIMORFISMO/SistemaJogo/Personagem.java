package PO_LISTAS.POLIMORFISMO.SistemaJogo;

public class Personagem {
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(int vida, int ataque, int defesa)
    {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void mover()
    {
        System.out.println("Personagem movendo");
    }

    public void atacar()
    {
        System.out.println("Personagem Atacando");
    }

    public void defender()
    {
        System.out.println("Personagem Defendendo");
    }


    public void setVida(int novaVida)
    {
        this.vida = novaVida;
    }

    public void setAtaque(int novoAtaque)
    {
        this.ataque = novoAtaque;
    }

    public void setDefesa(int novaDefesa)
    {
        this.defesa = novaDefesa;
    }

    public int getVida()
    {
        return this.vida;
    }

    public int getAtaque()
    {
        return  this.ataque;
    }

    public int getDefesa()
    {
        return  this.defesa;
    }
}
