package model;

public class Produto {
    private String titulo;
    private String preco;
    private String imageUrl;
    private String descricao;

    public Produto() {
    }

    public Produto(String titulo, String preco, String imageUrl, String descricao) {
        this.titulo = titulo;
        this.preco = preco;
        this.imageUrl = imageUrl;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
        return "Titulo: " + titulo + '\n' +
                "Preco: " + preco + '\n' +
                "Imagem: " + imageUrl + '\n' +
                "Descrição: " + descricao;
    }
}
