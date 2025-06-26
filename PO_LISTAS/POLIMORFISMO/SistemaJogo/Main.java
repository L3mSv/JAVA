package PO_LISTAS.POLIMORFISMO.SistemaJogo;

public class Main {
    public static void main(String[] args) {
        Personagem mago = new Mago(100, 20, 30);
        Personagem guerreiro = new Guerreiro(500, 80, 80);
        Personagem arqueiro = new Arqueiro(400, 50, 20);

        mago.atacar();
        guerreiro.atacar();
        arqueiro.atacar();
    }
}
