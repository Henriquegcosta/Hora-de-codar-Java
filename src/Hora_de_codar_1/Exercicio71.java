package Hora_de_codar_1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio71 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int maior1 = 0;
        int maior2 = 0;



        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            number = scanner.nextInt();

            if(number > 0){
                if(number > maior1){
                    if(i >= 1){
                        maior2 = maior1;
                    }
                    maior1 = number;
                }else if(number > maior2){
                    maior2 = number;
                }
            }

        }
        int result = maior1 + maior2;
        System.out.println("A soma dos maiores é: " + result);

    }
}
