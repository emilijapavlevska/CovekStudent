package com.company;

import java.util.Arrays;

public class Student extends Covek{
    private Ocenka[] niza_ocenki = {};

    @Override
    public String toString() {
        return "Student: {" +
                "godini='" + godini + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocenki='" + niza_ocenki.toString() + '\'' +
                '}';
    }

    public void setOcenka(Ocenka o) {
        int dolzina = this.niza_ocenki.length;
        this.niza_ocenki = Arrays.copyOf(this.niza_ocenki, dolzina + 1);
        dolzina = this.niza_ocenki.length;
        this.niza_ocenki[dolzina - 1] = o;

    }

    public Ocenka[] getOcenki(){
        return this.niza_ocenki;
    }

    public float getProsek() {
        float br=0, n=this.niza_ocenki.length;
        for(int i=0; i<n; i++)
            br += this.niza_ocenki[i].getOcenka();
        float prosek = br/n;
        return prosek;
        }

    }