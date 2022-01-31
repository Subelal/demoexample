package com.example.demo.factory.builderfact.packing;

import com.example.demo.factory.builderfact.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
