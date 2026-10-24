public abstract class Frutas {

    private String nome;
    private double preco;
    private int quantidade;

    public Frutas(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

// G & S

    public String getNome() { 
        return nome;
     }

    public double getPreco() { 
        return preco;
     }

    public int getQuantidade() {
         return quantidade;
     }
    public void setQuantidade(int quantidade) {
         this.quantidade = quantidade; 
     }
}