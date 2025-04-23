package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    String colore;
    Boolean isWireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, Boolean isWireless){
        super(nome, marca, prezzo, iva);

        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public Boolean getIsWireless() {
        return this.isWireless;
    }

    public void setIsWireless(Boolean isWireless) {
        this.isWireless = isWireless;
    }

}
