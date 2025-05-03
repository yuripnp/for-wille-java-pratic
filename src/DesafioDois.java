import java.util.Arrays;

public class DesafioDois {
    /*
    * João recebeu uma lista de valores representando as receitas de sua loja de roupas. Ele quer calcular a
    * soma total dessas receitas para entender o desempenho financeiro semanal.
    *
    * input:
    * int[] valores = {10, 20, 30, 40, 50}
    *
    * output:
    * a soma dos valores é: 150
    * */
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        System.out.println(Arrays.stream(valores).sum());
        // ou
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
        }
        System.out.println(soma);
    }
}
