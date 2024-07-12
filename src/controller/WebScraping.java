package controller;

import model.Produto;
import service.WebSiteData;

import java.io.IOException;
import java.util.Scanner;

public class WebScraping {
    private final Scanner leitura = new Scanner(System.in);

    public void scrapProductData() throws IOException {
        System.out.println("Digite a URL da página em que deseja buscar os dados de um produto: ");
        String url = leitura.nextLine();
        Produto produto = WebSiteData.netShoesUrl(url);
        System.out.println(produto);
        leitura.close();
    }
}
