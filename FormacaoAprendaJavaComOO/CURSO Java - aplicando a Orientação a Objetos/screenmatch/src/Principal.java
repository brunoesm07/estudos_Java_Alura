import br.com.brmartin.screenmach.modelos.Filme;
import br.com.brmartin.screenmach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();

        filmeUm.setNome("O Poderoso Chefão");
        filmeUm.setAnoLancamento(1972);
        filmeUm.setDuracaoEmMinutos(180);

        filmeUm.exibeFichaTecnicaFilme();
        filmeUm.avalia(8);
        filmeUm.avalia(10);
        filmeUm.avalia(9);
        filmeUm.avalia(9.5);
        filmeUm.avalia(10);
        System.out.println("Total de avaliações: " + filmeUm.getTotalDeAvaliacoes());
        System.out.println(filmeUm.pegaMedia());
        System.out.println();

        Serie serieUm = new Serie();

        serieUm.setNome("Lost");
        serieUm.setAnoLancamento(2010);
        serieUm.exibeFichaTecnicaFilme();
        serieUm.setTemporadas(10);
        serieUm.setEpisodiosPorTemporada(10);
        serieUm.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar esta série: " + serieUm.getDuracaoEmMinutos() + " minutos");
    }
}
