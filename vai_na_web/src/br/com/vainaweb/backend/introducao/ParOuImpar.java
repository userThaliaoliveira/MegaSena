//1 - Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar
package br.com.vainaweb.backend.introducao;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Cria um objeto Scanner para obter entrada do usuário a partir do teclado.
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que digite um número inteiro.
        System.out.print("Digite um número inteiro: ");
        
        // Lê o número inteiro fornecido pelo usuário.
        int numero = scanner.nextInt();
        
        // Verifica se o número é par ou ímpar usando o operador de módulo (%).
        if (numero % 2 == 0) {
            // Se o resto da divisão por 2 for igual a 0, o número é par.
            System.out.println(numero + " é um número par.");
        } else {
            // Caso contrário, o número é ímpar.
            System.out.println(numero + " é um número ímpar.");
        }
        
        // Fecha o objeto Scanner para liberar recursos.
        scanner.close();
    }
}
