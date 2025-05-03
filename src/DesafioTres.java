import java.util.Scanner;

public class DesafioTres {
    /*
    * Maria quer calcular a soma de todos os números pares de 1 a 100. Ela decidiu usar um
    * loop para iterar pelos números e somar apenas aqueles divisíveis por 2. Crie um programa que realize essa tarefa.
    *
    * input:
    * digite um numero de  três digitos: 100
    * a soma dos numeros pares é : 2550
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor de três digitos");
        int valor = scanner.nextInt();
        int somaPar = 0;
        for(int i = 1; i <= valor; i++) {
            if(i%2 == 0)  {
                somaPar = somaPar + i;
            }
        }
        System.out.println(somaPar);
    }
}
