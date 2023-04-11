import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        String nome = "Paulo Henrique";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Disponível: " + saldo);
        System.out.println("\n*****************************************");

        String menu = """
                
                ** Digite a sua opção: **
                
                1 - Saldo atual
                2 - Fazer transferência
                3 - Sacar valor
                4 - Depositar Valor
                5 - Sair
                """;

        while (opcao != 5) {

            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja sacar? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Qual valor deseja depositar?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: "+ saldo);
            } else if (opcao != 5) {
                System.out.println("Opção invalida!");
            }
        }

    }
}
