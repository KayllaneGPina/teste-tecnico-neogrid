package model;

public class Produto {
    private String nome;
    private String preco;
    private String imageUrl;
    private String descricao;

    public Produto() {
    }

    public Produto(String nome, String preco, String imageUrl, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.imageUrl = imageUrl;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Preco: " + preco + '\n' +
                "Imagem: " + imageUrl + '\n' +
                "Descrição: " + descricao;
    }
}
