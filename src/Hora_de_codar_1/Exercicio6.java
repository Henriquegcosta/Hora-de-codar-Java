package Hora_de_codar_1;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro valor: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite mais um valor: ");
        int n3 = scanner.nextInt();

        int maior = Math.max(n1, Math.max(n2, n3));
        System.out.println("O maior numero é: " + maior);
        scanner.close();

    }
}
