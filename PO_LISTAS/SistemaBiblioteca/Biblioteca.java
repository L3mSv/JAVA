package LISTA_04.Exec9;

import java.util.ArrayList;

public class Biblioteca{
    public static void main(String[] args) {

        ArrayList<ItemBiblioteca> itens = new ArrayList<>();
        itens.add(new Livro("Dom Quixote", "Miguel de Cervantes"));
        itens.add(new DVD("Matrix", 150));
        itens.add(new Livro("Sherlock Holmes", "Colan Doyle"));

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

        boolean exibiuLivros = false;
        boolean exibiuDvds = false;

        for(int i = 0; i < categorias.length; ++i)
        {
            for(int j = 0; j < categorias[i].length; ++j)
            {
                if(categorias[i][j] instanceof Livro)
                {
                    if(!exibiuLivros)
                    {
                        System.out.println("LIVROS===================");
                        exibiuLivros = true;
                    }
                }else
                {
                    if(!exibiuDvds)
                    {
                        System.out.println("DVD'S====================");
                        exibiuDvds = true;
                    }
                }

                System.out.println(categorias[i][j]);
            }
            System.out.println("\n");
        }
    }
}