package Hora_de_codar_1;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int i = 0;
        int aprovados = 0;
        String verificar;
        char letra;


        while(i < 1){
            System.out.print("Digite a nota: ");
            n1 = scanner.nextInt();
            System.out.print("Digite a nota: ");
            n2 = scanner.nextInt();
            double media = (n1 + n2) / 2;

            if(media >= 6.5){
                aprovados++;
                System.out.print("Deseja adicionar outro aluno? S/N: ");
                verificar = scanner.next();
                letra = verificar.charAt(0);
                if(letra == 'S'){

                }else if(letra == 'N'){
                    i++;
                }
            } else{
                System.out.print("Deseja adicionar outro aluno? S/N: ");
                verificar = scanner.next();
                letra = verificar.charAt(0);
                if(letra == 'S'){

                }else if(letra == 'N'){
                    i++;
                }
            }
        }
        System.out.println("O total de alunos aprovados é: " + aprovados);
        }


}
