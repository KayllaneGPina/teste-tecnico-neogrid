package service;

import model.Produto;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class WebSiteData {
    public static Produto netShoesUrl(String url) throws IOException {
        Produto produtos = new Produto();

        try {
            Document doc = Jsoup.connect(url).get();

            String nome = doc.select("h1.product-name").text();
            produtos.setNome(nome);

            String preco = doc.select("span.listInCents-value").first().text();
            produtos.setPreco(preco);

            String imageUrl = doc.select("link[rel=preload][as=image]").first().attr("href");
            produtos.setImageUrl(imageUrl);

            String descricao = doc.select("script[type=application/ld+json][name=structured-pdp]").first().html();
            parseJson(descricao, produtos);

        } catch (IOException e) {
            throw new IOException("Erro ao conectar na URL: " + e.getMessage());
        }

        return produtos;
    }

    private static void parseJson(String jsonData, Produto produto) {
        JSONObject jsonObject = new JSONObject(jsonData).getJSONArray("@graph").getJSONObject(0);
        String descricao = jsonObject.getString("description");
        produto.setDescricao(descricao);
    }
}
