import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DesafioOito {
    /*
    * Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos.
    * Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos e
    * negativos existem em uma sequência de números fornecida por ela.
    *
    * Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez,
    * e que pare quando o número "fim" for digitado. **
    *
    * input:
    * Digite um número (ou 'fim' para encerrar): 3
    * Digite um número (ou 'fim' para encerrar): -1
    * Digite um número (ou 'fim' para encerrar): 7
    * Digite um número (ou 'fim' para encerrar): fim
    *
    * output:
    * Números positivos: 2
    * Números negativos: 1
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        List<Integer> numerosRegistrados = new ArrayList<>();
        do {
            System.out.println("Digite um número (ou 'fim' para encerrar):");
            String numeroDigitado = scanner.nextLine();
            if(!numeroDigitado.equals("fim")) {
                Integer numero = parseInt(numeroDigitado);
                numerosRegistrados.add(numero);
            } else {
                operacao = 1;
            }
        }while(operacao == 0);
        imprimirResultado(numerosRegistrados);
    }

    public static void imprimirResultado(List<Integer> listaDeValores) {
        List<Integer> result = numerosPositivosResult(listaDeValores);
        System.out.println("Numeros Positivos: " + result.get(0));
        System.out.println("Numeros Negativos: " + result.get(1));
    }
    public static List<Integer> numerosPositivosResult(List<Integer> listaDeValores) {
        int numeroaPositivos = 0;
        int numerosNegativos = 0;
        List<Integer> result = new ArrayList<>();
        for(int numero : listaDeValores) {
            if(numero >= 0) {
                numeroaPositivos++;
            } else {
                numerosNegativos++;
            }
        }
        result.add(numeroaPositivos);
        result.add(numerosNegativos);
        return result;
    }

}
