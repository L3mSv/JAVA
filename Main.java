package LISTA_04.Exec9;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args)
    {
        ArrayList<ItemBiblioteca> itens = new ArrayList<>();

        itens.add(new Livro("Dom Quixote", "Miguel de Cervantes"));
        itens.add(new DVD("Matrix", 150));

        // Array irregular para categorias: [0] = Livros, [1] = DVDs
        ItemBiblioteca[][] categorias = new ItemBiblioteca[2][];
        categorias[0] = new Livro[1];
        categorias[1] = new DVD[1];

        // Populando o array irregular com os itens do ArrayList
        categorias[0][0] = itens.get(0); // Add o livro (índice 0 do ArrayList)
        categorias[1][0] = itens.get(1); // Add o DVD (índice 1 do ArrayList)

        // Polimorfismo: exibir detalhes de todos os itens
        for (ItemBiblioteca item : itens) {
            System.out.println(item.exibirDetalhes());
        }
    }
}