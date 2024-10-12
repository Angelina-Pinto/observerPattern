/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observerpattern;

/**
 *
 * @author Dell
 */
public class main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Crear los observadores
        phoneDisplay phoneDisplay = new phoneDisplay();
        WindowDisplay windowDisplay = new WindowDisplay();

        // Registrar los observadores en el sujeto
        weatherStation.registrarObservador(phoneDisplay);
        weatherStation.registrarObservador(windowDisplay);

        // Cambiar el estado del sujeto (temperatura)
        weatherStation.setTemperatura(25.0f);
        weatherStation.setTemperatura(30.5f);

        // Eliminar un observador y cambiar el estado nuevamente
        weatherStation.eliminarObservador(phoneDisplay);
        weatherStation.setTemperatura(28.0f);
    }
}
