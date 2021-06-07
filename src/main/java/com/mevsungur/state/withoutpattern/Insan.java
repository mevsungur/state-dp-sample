package com.mevsungur.state.withoutpattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Insan {

    private InsanDurum durum;

    public void birSeyYap() {

        switch (durum) {
            case AC -> System.out.println("Yemek ye...");
            case SUSUZ -> System.out.println("Su iç");
            case TOK -> System.out.println("Yürüyüş yap");
            default -> throw new RuntimeException("Beklenmeyen durum!");
        }
    }
}
