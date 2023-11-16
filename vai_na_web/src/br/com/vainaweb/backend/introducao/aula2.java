//AULA02 -> Tipos Primitivos

package br.com.vainaweb.backend.introducao;

public class aula2 {

    public static void main(String[] args) {
        // EXEMPLO DE NUMEROS INTEIROS
        byte exemplo1 = 127; // o menor dos numeros
        short exemplo2 = 32767; // a Sequencia
        int exemplo3 = 2147483647; // o mais comum
        long exemplo4 = 9223372036854770000L; // o que aceita mais

        // EXEMPLO DE NUMEROS REAIS
        float exemplo11 = 5.50f; // permite 7 dígitos após o ponto
        double exemplo12 = 10.40; // permite 15 dígitos após o ponto

        // EXEMPLO DE CARACTERES
        char letra = 'S'; // sua inicialização precisa obrigatoriamente ser com aspas simples.
        // Aceita dados da tabela ASCII, como exemplo -> o número 97 = 'a'

        // EXEMPLO DE VALOR BOOLEANO
        boolean sim = true; // somente true ou false

        // Listinha de impressões com os tipos primitivos
        System.out.println("Exemplo de byte: " + exemplo1);
        System.out.println("Exemplo de short: " + exemplo2);
        System.out.println("Exemplo de int: " + exemplo3);
        System.out.println("Exemplo de long: " + exemplo4);
        System.out.println("Exemplo de float: " + exemplo11);
        System.out.println("Exemplo de double: " + exemplo12);
        System.out.println("Exemplo de char: " + letra);
        System.out.println("Exemplo de boolean: " + sim);

    }
}

