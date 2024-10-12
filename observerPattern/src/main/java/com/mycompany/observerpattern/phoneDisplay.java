/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerpattern;

/**
 *
 * @author Dell
 */
public class phoneDisplay implements Observer{
    private float temperatura;

    @Override
    public void update(float temperatura) {
        this.temperatura = temperatura;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Pantalla del teléfono: La temperatura es " + temperatura + " grados.");
    }
}
