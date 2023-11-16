package br.com.vainaweb.backend.introducao;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double soma = 0.0;
        
        while (contador < 4) {
            System.out.print("Digite a nota " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
            contador++;
        }
        
        double media = soma / 4.0;
        
        System.out.printf("A média do aluno é: %.1f%n", media);
    }
}
