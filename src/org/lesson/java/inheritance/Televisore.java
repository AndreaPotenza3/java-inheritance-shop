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

    public String getIsSmart() {
        if(isSmart = true) {
            
            return "è smart";
        }
        return "non è  smart";
    }

    public void setIsSmart(Boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return String.format("La TV %s, di %s costa %s euro, con uno schermo %s pollici ed %s." , this.nome, this.marca, this.getPrezzoIva(), this.dimensioni, this.getIsSmart());
    }

}
