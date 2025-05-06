import java.util.Scanner;

public class DesafioNove {
    /*
    * Gustavo está desenvolvendo um jogo educativo de matemática e deseja um sistema que exiba os números
    * de 1 até um valor definido pelo usuário, ignorando aqueles que terminam em 5. Essa mecânica
    * tem o objetivo de tornar o jogo mais desafiador e imprevisível.
    *
    * Com base nesse cenário, crie um programa que conte de 1 até um número
    * digitado pelo usuário, mas ignore números terminados em 5.
    *
    * Dica: Para saber se um número termina em 5, sempre dividimos ele por 10 e
    * verificamos o resto da divisão. Se o resto for 5, significa que o número termina em 5.
    *
    * input:
    * digite o numero: 20
    * output:
    * 1 2 3 4 6 7 8 9 10 11 12 13 14 16 17 18 19 20
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do numero que você quer saber");
        int valor = scanner.nextInt();
        for(int i = 1; i <= valor; i++) {
            String valorString = String.valueOf(i);
            char valorAvaliado = valorString.charAt(valorString.length() -1);
            if(valorAvaliado != '5') {
                System.out.print(valorString + " ");
            }
        }
    }
}
