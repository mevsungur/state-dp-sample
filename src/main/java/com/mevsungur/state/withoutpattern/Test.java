package com.mevsungur.state.withoutpattern;

public class Test {

    public static void main(String[] args) {
        Insan kisi = new Insan();

        kisi.setDurum(InsanDurum.AC);

        kisi.birSeyYap();

        kisi.setDurum(InsanDurum.TOK);

        kisi.birSeyYap();

    }
}
