package com.mevsungur.state.pattern;

public class Test {

    public static void main(String[] args) {
        InsanContext insanContext = new InsanContext();
        insanContext.setState(new AclikState());

        insanContext.birSeyYap();
        /*  Durum değişikliği yap */
        insanContext.setState(new ToklukState());

        insanContext.birSeyYap();
    }
}
