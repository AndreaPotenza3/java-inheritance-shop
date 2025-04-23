package org.lesson.java.inheritance;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;

    public Prodotto(String nome, String marca, BigDecimal prezzo) {
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;

    }

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        if(nome != null){
            return this.nome;
        }
        return null;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public String getMarca() {
        if(marca != null){
            return this.marca;
        }
        return null;
    }

    public void setMarca(String marca) {
        
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        if(prezzo != null){
            return this.prezzo;
        }
        return null;
    }

    public void setPrezzo(BigDecimal prezzo) {
        
        this.prezzo = prezzo.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getIva() {
        if(iva != null){
            return this.iva;
        }
        return null;
    }

    public void setIva(BigDecimal iva) {
        
        this.iva = iva;
    }

    public BigDecimal getPrezzoIva() {
         if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva).divide(new BigDecimal(100)).setScale(2, RoundingMode.DOWN));
        } 
        return null;
    }

    @Override
    public String toString() {
        
            return String.format("Le Cuffie %s, di %s costano %s" , this.nome, this.marca, this.getPrezzoIva());
   
    }

}
