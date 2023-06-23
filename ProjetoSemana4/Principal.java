import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        int opcao = 0;
        while (opcao != 3) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    loja = criarLoja(scanner);
                    break;
                case 2:
                    produto = criarProduto(scanner);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        if (produto != null) {
            Data dataVencimento = new Data(20, 10, 2023);
            boolean estaVencido = produto.estaVencido(dataVencimento);
            System.out.println(estaVencido ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");
        }

        if (loja != null) {
            System.out.println(loja.toString());
        }
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("(1) Criar uma loja");
        System.out.println("(2) Criar um produto");
        System.out.println("(3) Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static Loja criarLoja(Scanner scanner) {
        System.out.print("Informe o nome da loja: ");
        String nomeLoja = scanner.nextLine();

        System.out.print("Informe a quantidade de funcionários da loja: ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Informe o salário base dos funcionários da loja: ");
        double salarioBaseFuncionario = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Informe o nome da rua do endereço da loja: ");
        String nomeRua = scanner.nextLine();

        System.out.print("Informe a cidade do endereço da loja: ");
        String cidade = scanner.nextLine();

        System.out.print("Informe o estado do endereço da loja: ");
        String estado = scanner.nextLine();

        System.out.print("Informe o país do endereço da loja: ");
        String pais = scanner.nextLine();

        System.out.print("Informe o CEP do endereço da loja: ");
        String cep = scanner.nextLine();

        System.out.print("Informe o número do endereço da loja: ");
        String numero = scanner.nextLine();

        System.out.print("Informe o complemento do endereço da loja: ");
        String complemento = scanner.nextLine();

        Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

        System.out.print("Informe o dia de fundação da loja: ");
        int diaFundacao = scanner.nextInt();

        System.out.print("Informe o mês de fundação da loja: ");
        int mesFundacao = scanner.nextInt();

        System.out.print("Informe o ano de fundação da loja: ");
        int anoFundacao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Informe a quantidade máxima de produtos no estoque da loja: ");
        int maxProdutos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

        return new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
    }

    private static Produto criarProduto(Scanner scanner) {
        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe o preço do produto: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Informe o dia de validade do produto: ");
        int diaValidade = scanner.nextInt();

        System.out.print("Informe o mês de validade do produto: ");
        int mesValidade = scanner.nextInt();

        System.out.print("Informe o ano de validade do produto: ");
        int anoValidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

        return new Produto(nomeProduto, precoProduto, dataValidade);
    }
}
