package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Main {
public static void main(String[] args) {
    
    Prodotto televisione = new Prodotto("s43", "samsung", new BigDecimal(500),new BigDecimal(23));

    televisione.setNome("carlo");
    System.out.println(televisione.getCodice());
    System.out.println(televisione.getNome());
    System.out.println(televisione.getMarca());
    System.out.println(televisione.getPrezzo());
    System.out.println(televisione.getIva());

    Televisore samsung = new Televisore("LG42A", "LG", new BigDecimal(800), new BigDecimal(23), 38, true);

    samsung.setDimensione(43);
    samsung.setIsSmart(false);
    System.out.println(samsung.getNome());
    System.out.println(samsung.getIsSmart());
    System.out.println(samsung.getDimensione());

    Smartphone iphone = new Smartphone("Iphone 8", "Apple", new BigDecimal(799), new BigDecimal(23), "192837461827364", 256);

    iphone.setMemoria(512);
    System.out.println(iphone.getMemoria());

}
}
