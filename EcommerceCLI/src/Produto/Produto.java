
package Produto;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private int preco; // em centavos
    private int quantidade;

    public Produto() {}

    public Produto(String nome, String descricao, int preco, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public int getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setPreco(int preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public static int toCentavos(double valor) {
        return (int)(valor * 100);
    }

    public static double toReais(int centavos) {
        return centavos / 100.0;
    }
}
