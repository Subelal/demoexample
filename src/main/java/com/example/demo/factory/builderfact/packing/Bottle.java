package com.example.demo.factory.builderfact.packing;

import com.example.demo.factory.builderfact.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottel";
    }
}
