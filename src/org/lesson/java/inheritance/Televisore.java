package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Televisore extends Prodotto{

    public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, Boolean smart){
        super(nome, marca, prezzo, iva);
    }

}
