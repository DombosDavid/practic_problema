package com.aufgabe2.controller;

import com.aufgabe2.model.Produkt;

import java.util.List;

public interface Produktcontrollercnterface {
    Produkt addProdukt(String name, String SKU, int preis, int initialeAnzahl);

    void deleteProdukt(String SKU);

    void updateProdukt(String name, String SKU, int preis, int initialeAnzahl);

    List<Produkt> getAll();

    Produkt findBySKU(String SKU);
}
