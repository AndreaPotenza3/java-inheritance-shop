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

    public String getIsWireless() {
        if(isWireless = true){

            return "sono wireless";
        }
        return "non sono wirless";
    }

    public void setIsWireless(Boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return String.format("Le Cuffie %s, di %s costano %s euro, sono di colore %s e %s." , this.nome, this.marca, this.getPrezzoIva(), this.colore, this.getIsWireless());
    }
}
