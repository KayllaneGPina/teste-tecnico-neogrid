package Principal;

import controller.WebScraping;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WebScraping netShoesWrebScrapping = new WebScraping();
        netShoesWrebScrapping.scrapProductData();
    }
}