import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DesafioDez {
    /*
    * Maria está preparando um evento de aniversário e quer organizar a lista de
    * convidados. Ela precisa de um sistema que:
    *
    * Exiba a lista de convidados já cadastrados caso o usuário digite "ver".
    * Adicione novos nomes à lista, caso o nome não esteja lá.
    * Caso o nome já esteja na lista, o programa deve informar que o nome já foi registrado.
    * O programa deve permitir que Maria continue a adicionar nomes até ela digitar "sair".
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaDeConvidados = new ArrayList<>();
        int operacao = 0;
        while (operacao == 0) {
            imprimirCabecalho();
            String escolha = scanner.nextLine().toLowerCase(Locale.ROOT);
            if(escolha.equals("ver")) {
                System.out.println(listaDeConvidados);
            } else if(escolha.equals("adicionar")) {
                System.out.println("Adicione um nome: ");
                String nome = scanner.nextLine();
                boolean nomeValidado = validateName(listaDeConvidados, nome);
                if(!nomeValidado) {
                    listaDeConvidados.add(nome);
                    System.out.println("Nome adicionado com sucesso!");
                } else {
                    System.out.println("Nome já adicionado!");
                }
            } else if(escolha.equals("sair")) {
                operacao = 1;
                System.out.println("Saindo da lista!");
            }
        }
    }

    public static void imprimirCabecalho() {
        System.out.println("Escolha qual operação você quer");
        System.out.println("ver - ver lista de convidados");
        System.out.println("adicionar - adicionar um novo convidado ");
        System.out.println("sair - sair da lista");
    }
    public static boolean validateName(List<String> listaDenomes, String nome) {
        boolean retorno = false;
        for(String nomeNaLista : listaDenomes) {
            if(nomeNaLista.equals(nome)) {
                retorno = true;
            }
        }
        return retorno;
    }
}
