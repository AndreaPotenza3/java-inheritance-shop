package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, Boolean wireless){
        super(nome, marca, prezzo, iva);
    }

}
