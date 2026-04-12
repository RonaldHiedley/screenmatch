package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
