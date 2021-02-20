package Model;

public class Produto {
    String nome;
    int quantidade;
    String preco;
    String codigo;
    
    public Produto(String nome,int quantidade,String preco,String codigo){
        this.nome=nome;
        this.quantidade=quantidade;
        this.preco=preco;
        this.codigo=codigo;
    }

    Produto() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
