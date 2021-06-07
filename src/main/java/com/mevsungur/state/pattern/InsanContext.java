package com.mevsungur.state.pattern;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InsanContext {

    private InsanState state = new AclikState();

    public void birSeyYap() {
        state.birseyYap();
    }
}
