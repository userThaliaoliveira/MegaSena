package br.com.vainaweb.backend.introducao;
import java.util.Scanner; // Importa a classe Scanner para receber entrada do usuário

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria uma instância de Scanner para entrada do usuário

        System.out.print("Digite um caractere: "); // Solicita ao usuário que digite um caractere
        char caractere = scanner.next().charAt(0); // Lê o primeiro caractere da entrada do usuário

        switch (Character.toLowerCase(caractere)) { // Converte o caractere para minúsculo e inicia um bloco switch
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É uma vogal."); // Se o caractere for uma vogal, exibe "É uma vogal"
                break;
            default: // Caso o caractere não seja uma vogal
                if (Character.isLetter(caractere)) { // Verifica se o caractere é uma letra
                    System.out.println("É uma consoante."); // Se for uma letra, exibe "É uma consoante"
                } else {
                    System.out.println("Não é uma letra."); // Se não for uma letra, exibe "Não é uma letra"
                }
        }
    }
}
