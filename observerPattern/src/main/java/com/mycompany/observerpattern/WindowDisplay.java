/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerpattern;

/**
 *
 * @author Dell
 */
public class WindowDisplay implements Observer{
    private float temperatura;

    @Override
    public void update(float temperatura) {
         System.out.println("Pantalla de la ventana: La temperatura es " + temperatura + " grados.");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
