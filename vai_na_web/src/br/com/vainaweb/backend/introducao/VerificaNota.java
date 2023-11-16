//Crie um programa que recebe uma nota ( pela classe Scanner) e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria.
//A regra é a seguinte:
//Nota 7 ou mais: passou direto
//Entre 5 e 7: tem direito de fazer uma prova de recuperação
//Abaixo de 5: reprovado direto
package br.com.vainaweb.backend.introducao;

import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        // Cria um objeto Scanner para obter entrada do usuário a partir do teclado.
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a nota do aluno.
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble(); // Lê a nota fornecida pelo usuário.

        // Verifica a nota e imprime a mensagem apropriada de acordo com as regras.
        if (nota >= 7.0) {
            System.out.println("Passou direto!");
        } else if (nota >= 5.0) {
            System.out.println("Tem direito a fazer uma prova de recuperação.");
        } else {
            System.out.println("Reprovado direto.");
        }

        // Fecha o objeto Scanner para liberar recursos.
        scanner.close();
    }
}
