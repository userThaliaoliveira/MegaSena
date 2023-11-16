package br.com.vainaweb.backend.introducao;

import java.util.Scanner; // Importa a classe Scanner para receber entrada do usuário

public class Menu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Cria uma instância de Scanner para receber entrada do usuário
            while (true) { // Entra em um loop infinito para exibir o menu repetidamente
                System.out.println("Menu de Seleção:"); // Exibe o cabeçalho do menu
                System.out.println("1. Somar dois números"); // Exibe a opção 1
                System.out.println("2. Subtrair dois números"); // Exibe a opção 2
                System.out.println("3. Multiplicar dois números"); // Exibe a opção 3
                System.out.println("4. Dividir dois números"); // Exibe a opção 4
                System.out.println("5. Sair"); // Exibe a opção 5
                System.out.print("Escolha uma opção: "); // Solicita ao usuário que escolha uma opção
                
                int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário
                
                switch (opcao) { // Inicia um bloco switch com base na opção escolhida
                    case 1: // Se a opção for 1
                        System.out.print("Digite o primeiro número: "); // Solicita ao usuário o primeiro número
                        double numero1 = scanner.nextDouble(); // Lê o primeiro número
                        System.out.print("Digite o segundo número: "); // Solicita ao usuário o segundo número
                        double numero2 = scanner.nextDouble(); // Lê o segundo número
                        double soma = numero1 + numero2; // Calcula a soma dos números
                        System.out.println("A soma é: " + soma); // Exibe o resultado da soma
                        break;
                    case 2: // Se a opção for 2
                        System.out.print("Digite o primeiro número: "); // Solicita ao usuário o primeiro número
                        numero1 = scanner.nextDouble(); // Lê o primeiro número novamente
                        System.out.print("Digite o segundo número: "); // Solicita ao usuário o segundo número
                        numero2 = scanner.nextDouble(); // Lê o segundo número novamente
                        double subtracao = numero1 - numero2; // Calcula a subtração dos números
                        System.out.println("A subtração é: " + subtracao); // Exibe o resultado da subtração
                        break;
                    case 3: // Se a opção for 3
                        System.out.print("Digite o primeiro número: "); // Solicita ao usuário o primeiro número
                        numero1 = scanner.nextDouble(); // Lê o primeiro número novamente
                        System.out.print("Digite o segundo número: "); // Solicita ao usuário o segundo número
                        numero2 = scanner.nextDouble(); // Lê o segundo número novamente
                        double multiplicacao = numero1 * numero2; // Calcula a multiplicação dos números
                        System.out.println("A multiplicação é: " + multiplicacao); // Exibe o resultado da multiplicação
                        break;
                    case 4: // Se a opção for 4
                        System.out.print("Digite o primeiro número: "); // Solicita ao usuário o primeiro número
                        numero1 = scanner.nextDouble(); // Lê o primeiro número novamente
                        System.out.print("Digite o segundo número: "); // Solicita ao usuário o segundo número
                        numero2 = scanner.nextDouble(); // Lê o segundo número novamente
                        if (numero2 != 0) { // Verifica se o segundo número não é zero
                            double divisao = numero1 / numero2; // Calcula a divisão dos números
                            System.out.println("A divisão é: " + divisao); // Exibe o resultado da divisão
                        } else { // Caso o segundo número seja zero
                            System.out.println("Não é possível dividir por zero."); // Exibe uma mensagem de erro
                        }
                        break;
                    case 5: // Se a opção for 5
                        System.out.println("Saindo do programa. Obrigado!"); // Exibe uma mensagem de saída
                        System.exit(0); // Encerra o programa
                        break;
                    default: // Se a opção não corresponder a nenhuma das anteriores
                        System.out.println("Opção inválida. Tente novamente."); // Exibe uma mensagem de erro
                }
            }
        }
    }
}
