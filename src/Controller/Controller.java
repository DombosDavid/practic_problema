package Controller;

import com.aufgabe2.model.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProduktController implements ProduktControllerInterface{
    private final List<Produkt> produktList;

    public ProduktController() {
        this.produktList = new ArrayList<>();
    }

    @Override
    public Produkt addProdukt(String name, String SKU, int preis, int initialeAnzahl) {
        Produkt tempProdukt = new Produkt(name, SKU, preis, initialeAnzahl);
        produktList.add(tempProdukt);
        return tempProdukt;
    }

    @Override
    public void deleteProdukt(String SKU) {
        produktList.removeIf(produkt -> Objects.equals(produkt.getSKU(), SKU));
    }

    @Override
    public void updateProdukt(String name, String SKU, int preis, int initialeAnzahl) {
        for (Produkt produkt:
                produktList) {
            if(Objects.equals(produkt.getSKU(), SKU)){
                produkt.setName(name);
                produkt.setPreis(preis);
                produkt.setInitialeAnzahl(initialeAnzahl);
            }
        }
    }

    @Override
    public List<Produkt> getAll() {
        return produktList;
    }

    @Override
    public Produkt findBySKU(String SKU) {
        for (Produkt produkt:
                produktList) {
            if(Objects.equals(produkt.getSKU(), SKU))
                return produkt;
        }
        return null;
    }
}