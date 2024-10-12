/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class WeatherStation implements subject {
     private List<Observer> observadores;
    private float temperatura;

    public WeatherStation() {
        observadores = new ArrayList<>();
    }
    
    @Override
    public void registrarObservador(Observer observador) {
         observadores.add(observador); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarObservador(Observer observador) {
        observadores.remove(observador); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.update(temperatura);
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public void setTemperatura(float nuevaTemperatura) {
        this.temperatura = nuevaTemperatura;
        notificarObservadores();
    }
    
}
