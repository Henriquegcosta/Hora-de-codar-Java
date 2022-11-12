package Hora_de_codar_1;

import java.util.Scanner;

public class Exercicio8 {

    /*
    Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro,
    deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero
    nem um valor negativo.
    O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = scanner.nextInt();

        if (n2 <= 0){
            System.out.print("O numero nao pode ser menor ou igual a 0. Digite outro numero: ");
            n2 = scanner.nextInt();
        }
        System.out.println("O resultado da divisao é: " + (n1 / n2));
    }
}
