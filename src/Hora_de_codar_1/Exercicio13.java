package Hora_de_codar_1;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        int num1;
        int num2;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Insira um valor: ");
            num1 = scanner.nextInt();
            System.out.print("Insira outro valor: ");
            num2 = scanner.nextInt();
        }
        int num = 0;
        int nuM = num2 - num1;
        int media = 0;

        while(num1 <= num2){
            num = num + num1;
            System.out.println(num);
            num1++;
        }

        media = num/nuM;
        System.out.println("A media aritmetica é: " + media);
    }
}
