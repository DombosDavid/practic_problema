package com.aufgabe2.model;

import java.util.Objects;

public class Produkt {
    private String name,SKU;
    private int preis,initialeAnzahl;

    public Produkt(String name, String SKU, int preis, int initialeAnzahl) {
        this.name = name;
        this.SKU = SKU;
        this.preis = preis;
        this.initialeAnzahl = initialeAnzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getInitialeAnzahl() {
        return initialeAnzahl;
    }

    public void setInitialeAnzahl(int initialeAnzahl) {
        this.initialeAnzahl = initialeAnzahl;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", SKU='" + SKU + '\'' +
                ", initialeAnzahl=" + initialeAnzahl +
                '}';
}