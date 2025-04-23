package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Televisore extends Prodotto{

    protected int dimensioni;
    protected Boolean isSmart; 

    public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, Boolean isSmart){
        super(nome, marca, prezzo, iva);

        this.dimensioni = dimensioni;
    }

    public int getDimensione() {

        return this.dimensioni;
    }

    public void setDimensione(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public Boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(Boolean isSmart) {
        this.isSmart = isSmart;
    }

}
