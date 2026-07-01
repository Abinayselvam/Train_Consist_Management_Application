package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<String> consist;

    public Train() {
        consist = new ArrayList<>();
    }

    public List<String> getConsist() {
        return consist;
    }

    public void setConsist(List<String> consist) {
        this.consist = consist;
    }
}
