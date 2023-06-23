public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Loja[] getLojas() {
        return lojas;
    }
    
    
    public boolean insereLoja(Loja novaLoja) {
    for (int i = 0; i < lojas.length; i++) {
        if (lojas[i] == null) {
            lojas[i] = novaLoja;
            return true;
        }
    }
    return false; 
    }
    public boolean removeLoja(String nomeLoja) {
    for (int i = 0; i < lojas.length; i++) {
        if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
            lojas[i] = null;
            return true;
        }
    }
    return false;
    }
    public int quantidadeLojasPorTipo(String tipoLoja) {
    int count = 0;
    
    for (Loja loja : lojas) {
        if (loja != null && loja instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")) {
            count++;
        } else if (loja != null && loja instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuário")) {
            count++;
        } else if (loja != null && loja instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")) {
            count++;
        } else if (loja != null && loja instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")) {
            count++;
        } else if (loja != null && loja instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")) {
            count++;
        }
    }
    if (count > 0) {
        return count;
    } else {
        return -1;
    }
    }
    public Informatica lojaSeguroMaisCaro() {
    Informatica lojaMaisCara = null;
    double valorSeguroMaisCaro = 0.0;
    
    for (Loja loja : lojas) {
        if (loja instanceof Informatica) {
            Informatica Informatica = (Informatica) loja;
            if (lojaMaisCara == null || Informatica.getSeguroEletronicos() > valorSeguroMaisCaro) {
                lojaMaisCara = Informatica;
                valorSeguroMaisCaro = Informatica.getSeguroEletronicos();
            }
        }
    }
    
    return lojaMaisCara;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do Shopping: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco).append("\n");
        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n");
            }
        }
        return sb.toString();
    }
}
