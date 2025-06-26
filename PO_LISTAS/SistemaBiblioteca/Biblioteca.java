package PO_LISTAS.SistemaBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
 public static void main(String[] args) {

    ArrayList<ItemBiblioteca> itens = new ArrayList<>();
    itens.add(new Livro(1, "Dom Quixote", "Miguel de Cervantes"));
    itens.add(new DVD(2, "Matrix", 150));
    itens.add(new Livro(3, "Sherlock Holmes", "Colan Doyle"));

    // Array irregular para categorias: [0] = Livros, [1] = DVDs
    ItemBiblioteca[][] categorias = new ItemBiblioteca[2][];
    categorias[0] = new Livro[2];
    categorias[1] = new DVD[1];

    // Populando o array irregular com os itens do ArrayList
    categorias[0][0] = itens.get(0); // Add o livro (índice 0 do ArrayList)
    categorias[1][0] = itens.get(1);
    categorias[0][1] = itens.get(2); // Add o DVD (índice 1 do ArrayList)

    // Polimorfismo: exibir detalhes de todos os itens
        for (ItemBiblioteca item : itens) {
        item.exibirDetalhes();
        }
    }
}
