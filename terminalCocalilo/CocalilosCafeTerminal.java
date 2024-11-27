import java.util.Scanner;

public class CocalilosCafeTerminal {

    static Scanner scanner = new Scanner(System.in);

    // Arrays para armazenar os preços e nomes dos produtos
    static final String[] doces = {"Moranguete", "Sonho", "Carolina", "Cupcake"};
    static final double[] docesPreco = {0.60, 1.50, 3.50, 5.00};

    static final String[] salgados = {"Risolis", "Coxinha", "Torta", "Pastel"};
    static final double[] salgadosPreco = {2.00, 4.00, 5.00, 6.00};

    static final String[] bebidas = {"Cappuccino", "Café EXP", "Água 510ml", "Coca-Cola"};
    static final double[] bebidasPreco = {2.50, 3.00, 4.00, 5.00};

    // Variáveis para armazenar o total de cada categoria
    static double docesValor = 0;
    static double salgadosValor = 0;
    static double bebidasValor = 0;

    static int inicializacao = 0;

    // Método para exibir os valores
    public static void valores() {
        System.out.println("___________________________________");
        System.out.println("¦ Valor de doces total:    R$ " + docesValor);
        System.out.println("¦ Valor de salgados total: R$ " + salgadosValor);
        System.out.println("¦ Valor de bebidas total:  R$ " + bebidasValor);
        System.out.println("¦ Valor total da compra:   R$ " +
                (docesValor + salgadosValor + bebidasValor));
        System.out.println("¦__________________________________");
    }

    // Método para exibir o menu principal
    public static void exibirMenu() {
        System.out.println("_______________________________");
        System.out.println("¦       Menu Cocalilo         ¦");
        System.out.println("¦                             ¦");
        System.out.println("¦     1. Cardápio Doces       ¦");
        System.out.println("¦     2. Cardápio Salgados    ¦");
        System.out.println("¦     3. Cardápio Bebidas     ¦");
        System.out.println("¦     4. Finalizar Compra     ¦");
        System.out.println("¦                             ¦");
        System.out.println("¦_____________________________¦");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                exibirCardapio("Doces", doces, docesPreco);
                docesValor += escolherItem(doces, docesPreco);
                break;
            case 2:
                exibirCardapio("Salgados", salgados, salgadosPreco);
                salgadosValor += escolherItem(salgados, salgadosPreco);
                break;
            case 3:
                exibirCardapio("Bebidas", bebidas, bebidasPreco);
                bebidasValor += escolherItem(bebidas, bebidasPreco);
                break;
            case 4:
                finalizarCompra();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    // Método para exibir cardápio de uma categoria
    public static void exibirCardapio(String titulo, String[] itens, double[] precos) {
        System.out.println   ("________________________________");
        System.out.println   ("¦      Cocalilo " + titulo + " ");
        for (int i = 0; i < itens.length; i++) {
            System.out.printf("¦     %d. %s   R$ %.2f      \n", i + 1, itens[i], precos[i]);
        }
        System.out.println   ("¦______________________________");
    }

    // Método para escolher um item de um cardápio
    public static double escolherItem(String[] itens, double[] precos) {
        System.out.println("Escolha uma opção do cardápio (1 - " + itens.length + "):");
        int opcao = scanner.nextInt();
        if (opcao >= 1 && opcao <= itens.length) {
            System.out.printf("Você escolheu: %s (R$ %.2f)\n", itens[opcao - 1], precos[opcao - 1]);
            return precos[opcao - 1];
        } else {
            System.out.println("Opção inválida!");
            return 0;
        }
    }

    // Método para finalizar a compra
    public static void finalizarCompra() {
        double total = docesValor + salgadosValor + bebidasValor;
        if (total == 0) {
            System.out.println("Você não comprou nada. Finalizando o sistema.");
            inicializacao = 1;
            return;
        }

        System.out.println("_________________________________________________");
        System.out.println("¦ O valor total da compra foi de: R$ " + total);
        System.out.println("¦ Escolha o método de pagamento:                ");
        System.out.println("¦ 1. Pix                                        ");
        System.out.println("¦ 2. Cartão de Débito                           ");
        System.out.println("¦ 3. Cartão de Crédito                          ");
        System.out.println("¦_______________________________________________");

        int metodoPagamento = scanner.nextInt();

        switch (metodoPagamento) {
            case 1:
                System.out.println("Você escolheu Pix. \nChave pix: 41996721978");
                break;
            case 2:
                System.out.println("Você escolheu Cartão de Débito. \nTransação efetuada.");
                break;
            case 3:
                System.out.println("Você escolheu Cartão de Crédito. \nTransação efetuada.");
                break;
            default:
                System.out.println("Método de pagamento inválido. \nTente novamente.");
                finalizarCompra();
                return;
        }

        System.out.println("¦ Obrigado pela compra, volte sempre!         ¦");
        System.out.println("¦_____________________________________________¦");
        inicializacao = 1;
    }

    // Método principal
    public static void main(String[] args) {
        System.out.println("__________________________________");
        System.out.println("¦ Bem-vindo à Cafeteria Cocalilo ¦");
        System.out.println("¦________________________________¦");

        while (inicializacao != 1) {
            exibirMenu();
        }
    }
}
