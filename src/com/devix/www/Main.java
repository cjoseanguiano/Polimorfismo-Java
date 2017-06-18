package com.devix.www;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Gato gato = new Gato();
        habla(gato);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void habla(Animal gato) {
        gato.habla();
    }
}
