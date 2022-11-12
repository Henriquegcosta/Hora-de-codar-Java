package Hora_de_codar_1;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.List.*;

public class Exercicio61 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[4];

        for(int i = 0; i < 4; i++){
            System.out.println("Digite um numero: ");
            number[i] = scanner.nextInt();
        }

        int maior = Arrays.stream(number).max().getAsInt();
        System.out.println("O maior numero é: " + maior);

    }
}
