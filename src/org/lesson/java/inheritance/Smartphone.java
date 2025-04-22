package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceImei, int memoria){
        super(nome, marca, prezzo, iva);
    }


}
