package br.com.vainaweb.backend.introducao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário para escolher 7 números
        int[] numerosEscolhidos = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 100): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número inteiro.");
                scanner.next(); // Limpar o buffer do scanner
            }
            numerosEscolhidos[i] = scanner.nextInt();
        }

        // Sortear os 7 números vencedores
        int[] numerosSorteados = sortearNumeros();

        // Exibir os números sorteados
        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));

        // Verificar quantos números o usuário acertou
        int numerosAcertados = contarAcertos(numerosEscolhidos, numerosSorteados);

        // Determinar o prêmio com base nos acertos
        determinarPremio(numerosAcertados);

        scanner.close();
    }

    // Método para sortear 7 números aleatórios
    private static int[] sortearNumeros() {
        Random random = new Random();
        int[] numerosSorteados = new int[7];
        for (int i = 0; i < 7; i++) {
            numerosSorteados[i] = random.nextInt(101); // Números de 0 a 100
        }
        return numerosSorteados;
    }

    // Método para contar quantos números o usuário acertou
    private static int contarAcertos(int[] escolhidos, int[] sorteados) {
        int acertos = 0;
        for (int numero : escolhidos) {
            if (Arrays.binarySearch(sorteados, numero) >= 0) {
                acertos++;
            }
        }
        return acertos;
    }

    // Método para determinar o prêmio com base nos acertos
    private static void determinarPremio(int acertos) {
        switch (acertos) {
            case 5:
                System.out.println("Parabéns! Você acertou 5 números. Prêmio: R$ 10.000,00");
                break;
            case 6:
                System.out.println("Parabéns! Você acertou 6 números. Prêmio: R$ 50.000,00");
                break;
            case 7:
                System.out.println("Parabéns! Você acertou 7 números. Prêmio: R$ 200.000,00");
                break;
            default:
                System.out.println("Infelizmente você não acertou o suficiente para ganhar um prêmio.");
        }
    }
}
