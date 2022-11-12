package Hora_de_codar_1;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Digite um numero: ");
        a = scanner.nextInt();
        System.out.println("Digite um numero: ");
        b = scanner.nextInt();
        System.out.println("Digite um numero: ");
        c = scanner.nextInt();

        double result = Math.min(a, Math.min(b,c));
        double valor = a + b + c - result;
        System.out.println("A soma dos dois maiores é: " + valor);

        scanner.close();



    }
}
