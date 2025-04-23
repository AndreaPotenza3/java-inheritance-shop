package org.lesson.java.inheritance;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;

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

    public void getPrezzo(BigDecimal prezzo) {
        
        this.prezzo = prezzo;
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

}
