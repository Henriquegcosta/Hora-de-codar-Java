package Hora_de_codar_1;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
        }
        for(int j = 0; j < numbers.length; j++){
            sum+= numbers[j];
        }
        System.out.println("A soma dos numeros é: " + sum);
    }
}
