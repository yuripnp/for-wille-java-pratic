import java.util.Scanner;

public class DesafioSeis {
    /*
    * Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários
    * tenham um número limitado de tentativas para inserir a senha corretamente. Se o usuário errar a
    * senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.
    *
    * Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até
    * 3 tentativas de erro antes de bloquear o acesso. Se o usuário digitar corretamente antes disso,
    * o sistema deve conceder o acesso imediatamente.
    *
    * input:
    * Digite sua senha: 1234
    * output:
    * Senha correta! acesso concedido
    *
    * ou
    * input:
    * Digite sua senha: 12345678
    * output:
    * Senha incorreta! você tem 2 tentativas.
    * Digite sua senha: 12345
    * Senha  incorreta! você tem 1 tentativa.
    * Digite sua senha: 123
    * Conta bloqueada temporariamente!
    * */
    public static void main(String[] args) {
        String senha = "1234";
        Scanner scanner = new Scanner(System.in);
        int tentativa = 3;

        while (tentativa > 0) {
            System.out.println("Digite a sua senha:");
            String senhaDigitada = scanner.nextLine();
            if(senha.equals(senhaDigitada)) {
                System.out.println("Senha correta! Acesso concedido");
                break;
            } else {
                tentativa--;
                if(tentativa == 1) {
                    System.out.println("Você tem " + tentativa + " tentativa");
                } else if(tentativa == 2) {
                    System.out.println("Você tem " + tentativa + " tentativas");
                } else {
                    System.out.println("Conta suspensa temporariamente!");
                    break;
                }
            }
        }
    }
}
