public class Produto {
    private String nome;
    private double preco;

    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Preço: R$" + preco;
    }
}
