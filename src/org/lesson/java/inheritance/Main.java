package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Main {
public static void main(String[] args) {
    
    // Prodotto televisione = new Prodotto("s43", "samsung", new BigDecimal(500),new BigDecimal(23));

    // televisione.setNome("carlo");
    // System.out.println(televisione.getCodice());
    // System.out.println(televisione.getNome());
    // System.out.println(televisione.getMarca());
    // System.out.println(televisione.getPrezzo());
    // System.out.println(televisione.getIva());
    // System.out.println(televisione);
    
    Televisore lg = new Televisore("LG42A", "LG", new BigDecimal(800), new BigDecimal(23), 38, true);
    
    lg.setDimensione(43);
    lg.setIsSmart(false);
    System.out.println(lg.getNome());
    System.out.println(lg.getIsSmart());
    System.out.println(lg.getDimensione());
    System.out.println(lg);
    
    Smartphone iphone = new Smartphone("Iphone 8", "Apple", new BigDecimal(799), new BigDecimal(23), "192837461827364", 256);
    
    iphone.setMemoria(512);
    System.out.println(iphone.getNome());
    System.out.println(iphone.getMemoria());
    System.out.println(iphone);

    
    Cuffie airBuds = new Cuffie("Air Buds 2", "Samsung", new BigDecimal(129), new BigDecimal(23), "Nero", true);
    
    airBuds.setColore("Bianco");
    System.out.println(airBuds.getNome());
    System.out.println(airBuds.getColore());
    System.out.println(airBuds);
}
}
