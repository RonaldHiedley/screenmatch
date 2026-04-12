import br.com.alura.screenmatch.Calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.Calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Pulp Fiction");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setDuracaoEmMinutos(120);
        System.out.println("Duracao do filme: "+meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(4);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

//        meuFilme.somaDasAvalicoes = 10;
//        meuFilme.somaDasAvalicoes = 10;
//         System.out.println(meuFilme.totalDeAvaliacoes);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar lost: "+lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Star Wars III");
        outroFilme.setAnoDeLancamento(2005);
        outroFilme.setDuracaoEmMinutos(140);
        System.out.println("Duracao do filme: "+meuFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(outroFilme);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);




    }
}