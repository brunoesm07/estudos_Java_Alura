public class Main {
    public static void main(String[] args) {
       System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        //declarando variável
        int anoLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoLancamento);
        boolean incluidoNoPlano = false;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("Avaliaçãos: " + media);

        String sinopse;
        sinopse = "Treinando um destacamento de graduados para uma missão especial, Maverick deve enfrentar os fantasmas de seu passado e seus medos mais profundos, culminando em uma missão que exige o sacrifício final daqueles que escolhem voar nela.";
        System.out.println(sinopse);

        //casting (conversão de tipos) explicito
        int estrelas = (int) (media /2);
        System.out.println(estrelas);

        //casting implícito
        int x = 10;
        double y = x;
    }
}