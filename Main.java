package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setIme("Emilija");
        student1.setPrezime("Pavlevska");
        student1.setGodini(20);
        student1.setOcenka(new Ocenka(6, "predmet1", "01.01.2020"));
        Ocenka ocenka = new Ocenka(7, "predmet2", "01.01.2020");
        student1.setOcenka(ocenka);
        System.out.println(student1.getProsek());

        Student student2 = new Student();
        student2.setIme("Student2");
        student2.setPrezime("Student2");
        student2.setGodini(20);
        student2.setOcenka(new Ocenka(6, "predmet1", "01.01.2020"));
        student2.setOcenka(new Ocenka(9,"predmet2", "01.01.2020"));
        student2.setOcenka(ocenka);
        System.out.println(student1.toString());
    }
}