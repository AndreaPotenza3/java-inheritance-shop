package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{

    String codiceImei;
    int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceImei, int memoria){
        super(nome, marca, prezzo, iva);

        this.codiceImei = codiceImei;
        this.memoria = memoria;
    }

    public String getImei() {
        return this.codiceImei;
    }

    public void setImei(String codiceImei) {
        this.codiceImei = codiceImei;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return String.format("L' %s, di %s costa %s euro ed ha una memoria di %d GB." , this.nome, this.marca, this.getPrezzoIva(), this.memoria );
    }


}
