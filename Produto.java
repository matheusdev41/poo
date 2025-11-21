public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor 
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método da classe
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-----------------------");
    }
    
    public void adicionarEstoque(int qtd, String nome){
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println("Adicionando " + qtd + " unidades ao estoque de " + nome);
        } else {
            System.out.println("Quantidade inválida");
        }
    }
    
    public void removerEstoque(int qtd) {
        if (qtd > 0 && quantidade > 0) {
            this.quantidade -= qtd;
            System.out.println("Removendo " + qtd + " unidades ao estoque de " + nome);
        } else {
            System.out.println("Quantidade inválida");
        }
    }
}
