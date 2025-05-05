import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioCinco {
    /*
    * Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para isso, ele decidiu
    * percorrer a lista comparando cada número com o maior encontrado até o momento. Crie um programa que
    * receba uma lista de números e encontre o maior número.
    *
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos valores quer adicionar");
        int operacao = 1;
        List<Integer> arrayInteiro = new ArrayList<Integer>();

        while (operacao != 0) {
            System.out.println("Digite o valor que você quer adicionar");
            int valorAdicionado = scanner.nextInt();
            arrayInteiro.add(valorAdicionado);
            System.out.println("Quer continuar adicionando valores? 1 - sim ou 0 - não");
            operacao = scanner.nextInt();
        }
        System.out.println("Seus valores: " + arrayInteiro);
    }
}
