package principal;

import java.util.Stack;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        Stack<Character> pilha = new Stack<>();

        for (char c : texto.toCharArray()) {
            pilha.push(c);
        }

        String invertido = "";
        while (!pilha.isEmpty()) {
            invertido += pilha.pop();
        }

        if (texto.equals(invertido))
            System.out.println("É um palíndromo!");
        else
            System.out.println("Não é um palíndromo.");

        sc.close();
    }
}

