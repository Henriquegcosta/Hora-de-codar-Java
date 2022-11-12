package Hora_de_codar_1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int valor = scanner.nextInt();

        if(valor > 0){
            System.out.println(valor +" O valor é positivo");
        } else if(valor < 0){
            System.out.println(valor +" O valor é negativo");
        }else{
            System.out.println(valor +" O valor é neutro");
        }

        scanner.close();

    }

}
