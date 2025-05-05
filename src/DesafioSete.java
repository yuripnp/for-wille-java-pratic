import java.util.Locale;
import java.util.Scanner;

public class DesafioSete {
    /*
    * Um sistema de cadastro exige que os usuários informem um nome válido. No entanto, alguns usuários
    * tentam deixar o campo em branco ou inserir nomes muito curtos. O sistema precisa garantir que o nome
    * tenha pelo menos 3 caracteres antes de prosseguir com o cadastro.
    *
    * Com base nesse cenário, crie um programa que continue pedindo um nome até que o usuário insira um
    * valor válido com pelo menos 3 caracteres.
    *
    * input:
    * Insira seu nome:
    * Nome Invalido! Tente de novo.
    * Insira seu nome: A
    * Nome Invalido! Tente de novo.
    * Insira seu nome: Yuri
    * Nome válido!
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validar = false;
        do {
            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();
            validar = validateName(nome);
        }while (validar);

    }
    public static boolean validateName(String nome) {
        String name = nome.trim();
        if(name.isEmpty() || name.length() < 3) {
            System.out.println("Nome invalido, vazio ou com menos de três caracteres");
            return true;
        } else {
            System.out.println("Nome cadastrado!");
            return false;
        }
    }
}
