package org.lesson.java.inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
public static void main(String[] args) {
    Prodotto[] prodotti = new Prodotto[2];
    Scanner sc = new Scanner(System.in);

    for(int i =0; i<prodotti.length; i++) {
        System.out.println("Nome del prodotto");
        String nomeProdotto = sc.nextLine();

        System.out.println("Marca del prodotto");
        String marcaProdotto = sc.nextLine();

        System.out.println("Prezzo");
        int prezzoProdotto = Integer.parseInt(sc.nextLine());

        System.out.println("A quale categoria di prodotti appartiene?");
        String categoriaProdotto = sc.nextLine();
        System.out.println(categoriaProdotto);

        switch (categoriaProdotto.toLowerCase()) {
            case "televisore":

            System.out.println("Dimensioni del televisore in pollici");
            int dimensioniTv = Integer.parseInt(sc.nextLine());

            System.out.println("E' una smart tv? (true o false)");
            Boolean isSmartTV = Boolean.parseBoolean(sc.nextLine());

            Televisore tv = new Televisore(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), dimensioniTv, isSmartTV);
            prodotti[i] = tv;
     
                break;
        
            case "smartphone":

            System.out.println("Inserisci il codice IMEI dello smartphone");
            String imei = sc.nextLine();

            System.out.println("Inserisci la quantita' di memoria in GB");
            int memoriaGB = Integer.parseInt(sc.nextLine());

            Smartphone cellulare = new Smartphone(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), imei, memoriaGB);
            prodotti[i] = cellulare;

            break;

            case "cuffie":

            System.out.println("Colore delle cuffie");
            String coloreCuffie = sc.nextLine();

            System.out.println("Wirless?");
            Boolean isWireless = Boolean.parseBoolean(sc.nextLine());

            Cuffie pods = new Cuffie(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), coloreCuffie, isWireless);
            prodotti[i] = pods;
            
            break;

        }

        System.out.println("---------");
            
    }
    sc.close();

    for(int i = 0; i < prodotti.length; i++) {
        System.out.println(prodotti[i]);
        System.out.println("----------");
    }

}
}
