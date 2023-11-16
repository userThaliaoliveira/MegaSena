package br.com.vainaweb.backend.introducao;

import java.util.Scanner; // Importa a classe Scanner para receber entrada do usuário

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria uma instância de Scanner para entrada do usuário
        double saldo = 1000.0; // Define o saldo inicial da conta como R$ 1000.0

        while (true) { // Inicia um loop infinito para manter o programa em execução
            System.out.println("Bem-vindo ao Caixa Eletrônico!");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Sacar Dinheiro");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) { // Inicia um bloco switch com base na opção escolhida
                case 1:
                    System.out.println("Saldo atual: R$" + saldo); // Exibe o saldo atual
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: R$");
                    double valorSaque = scanner.nextDouble(); // Lê o valor do saque
                    if (valorSaque > 0 && valorSaque <= saldo) { // Verifica se o valor do saque é válido
                        saldo -= valorSaque; // Atualiza o saldo após o saque
                        System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: R$");
                    double valorDeposito = scanner.nextDouble(); // Lê o valor do depósito
                    if (valorDeposito > 0) { // Verifica se o valor do depósito é válido
                        saldo += valorDeposito; // Atualiza o saldo após o depósito
                        System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Caixa Eletrônico. Até logo!");
                    System.exit(0); // Encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
