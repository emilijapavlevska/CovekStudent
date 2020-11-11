package com.company;

public class Ocenka {
    private int ocenka_broj;
    private String predmet;
    private String datum;

    public Ocenka(int ocenka, String predmet, String datum) {
        this.predmet = predmet;
        this.datum = datum;
        this.ocenka_broj = ocenka;
    }

    @Override
    public String toString() {
        return "Ocenka: {" +
                "predmet='" + predmet + '\'' +
                ", datum='" + datum + '\'' +
                ", ocenka='" + ocenka_broj + '\'' +
                '}';
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getPredmet() {
        return this.predmet;
    }

    public String getDatum() {
        return this.datum;
    }

    public void setOcenka(int ocenka) {
        this.ocenka_broj = ocenka;
    }

    public int getOcenka() {
        return this.ocenka_broj;
    }
}