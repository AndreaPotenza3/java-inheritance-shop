package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Main {
public static void main(String[] args) {
    
    Prodotto televisione = new Prodotto("s43", "samsung", new BigDecimal(500),new BigDecimal(23));

    System.out.println(televisione.getCodice());
    televisione.setNome("carlo");
    System.out.println(televisione.getNome());
    System.out.println(televisione.getMarca());
    System.out.println(televisione.getPrezzo());
    System.out.println(televisione.getIva());

}
}
