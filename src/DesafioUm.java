import java.util.Scanner;

public class DesafioUm {
    /*
    * Carla começou a praticar trilha e deseja saber quantos degraus precisará subir para chegar ao
    * topo de uma escadaria. Ela sobe um degrau por vez e quer um programa que mostre sua subida até o
    * topo. Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.
    *
    * input:
    * digite o numero de degraus: 5
    *
    * output:
    * você subiu  o 5 degrau
    * você subiu o 4 degrau
    * você subiu o  3 degrau
    * você subiu o 2 degrau
    * você subiu o 1 degrau
    * você chegou!
    * */
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite quantos degraus voce quer subir");
        int degraus = scanner.nextInt();
        while (degraus > 0) {
            System.out.println("você subiu no " + degraus + " degrau");
            degraus--;
        }
        System.out.println("Você chegou!");
    }
}
