public class Main {
    public static void main(String[] args) {
        //for(iniciação; condição; iteração) {bloco de codigo} execução determinada
        //while(condicao) {bloco de codigo} quando não sabemos quando vai parar
        //do {bloco de codigo}while(condicao) entre pelo menos uma vez no laço


        String[] nomes = {"Glauber", "Yuri", "Dimmas", "Victoria", "Ana"};
        double[] vendas = {2000.00, 10000.00, 49000.00, 30.00, 55000.30};

        for (int i = 0 ; i > nomes.length ; i++) {
            System.out.printf("%s - comissão %.2f\n", nomes[i], vendas[i]);
        }
        int loops = 0;
        boolean processo  = true;
        do {
            if (vendas[loops] % 2 == 0.0) {
                processo = false;
            } else {
                System.out.println(vendas[loops] + " não é o valor");
                loops++;
            }
        } while (processo);


    }
}
