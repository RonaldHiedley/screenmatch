package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class MainWithLists {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Pulp Fiction", 1994);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Star Wars III", 2005);
        meuFilme.avalia(9);
        var filmeDoPaulo = new Filme("Cães de Aluguel", 1992);
        meuFilme.avalia(8);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getDuracaoEmMinutos() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
            List<String> buscarPorArtista = new ArrayList<>();
            buscarPorArtista.add("Adam Sandler");
            buscarPorArtista.add("Ronald");
            buscarPorArtista.add("Akita");
            System.out.println(buscarPorArtista);

            Collections.sort(buscarPorArtista);
            System.out.println("Depois da ordenação");
            System.out.println(buscarPorArtista);//Ordena em ordem alfabetica.
            System.out.println("Lista de Titulos Ordenados");
            Collections.sort(lista);
            System.out.println(lista);
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("Ordenando por ano");
            System.out.println(lista);




    }
}
