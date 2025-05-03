import java.util.Scanner;

public class DesafioQuatro {
    /*
    * Pedro quer calcular o fatorial de um número. O fatorial de um número é o produto de todos os
    * números inteiros positivos de 1 até o próprio número. Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120.
    * Crie um programa que receba um número e calcule seu fatorial.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor fatorial");
        int fatorial = scanner.nextInt();
        int fatorialResult = fatorial;
        for(int i = fatorial - 1; i > 0; i --){
            fatorialResult = fatorialResult * i;
        }
        System.out.println(fatorialResult);
    }
}
