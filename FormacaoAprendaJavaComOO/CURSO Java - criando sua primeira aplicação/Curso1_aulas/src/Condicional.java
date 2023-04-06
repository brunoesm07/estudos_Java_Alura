public class Condicional {

    public static void main(String[] args) {
        int anoLancamento = 2020;
        boolean incluidoNoPlano = false;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamentos");
        } else {
            System.out.println("Filme retrô");
        }
    }
}