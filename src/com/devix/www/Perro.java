package com.devix.www;

/**
 * Created by carlosjoseanguiano on 18/06/17.
 */

public class Perro extends Animal {

    @Override
    public void habla() {
        System.out.println("¡Guau!");
    }
}

class Gato extends Animal {

    @Override
    public void habla() {
        System.out.println("¡Miau!");
    }
}

abstract class Animal {
    public abstract void habla();
}