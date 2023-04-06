import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("***************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome: " + nomeCliente);

        String tipoConta = "Corrente";
        System.out.println("Tipo de Conta: " + tipoConta);

        double saldo = 30000.00;
        System.out.println("Saldo inicial: R$ " + saldo);

        System.out.println("***************************");

        String mensagem = """                                  
                \nOperações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                  """;
        System.out.println(mensagem);

        System.out.println("Informe a operação desejada ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Seu saldo é: " + saldo);
                break;
            case 2:
                System.out.println("Digite o valor a receber: R$");
                double receber = scanner.nextDouble();
                double saldoAposReceber = saldo + receber;
                System.out.println("Seu novo saldo é de: R$ " + saldoAposReceber);
                break;
            case 3:
                System.out.println("Digite o valor a transferir: R$");
                double transferir = scanner.nextDouble();
                if (transferir > saldo) {
                    System.out.println("Não há saldo suficiente.");
                } else
                   saldo -= transferir;
                System.out.println("Seu novo saldo é de: R$ " + saldo);
                break;
            case 4:
                System.out.println("Encerrando acesso");
                break;
        }
    }
}