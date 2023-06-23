public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;


    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
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
     public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método para verificar se o produto está vencido em relação a uma determinada data
    public boolean estaVencido(Data data) {
        return dataValidade != null && dataValidade.compareTo(data) < 0;
    }


    // Método toString
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Preço: R$" + preco;
    }
}
