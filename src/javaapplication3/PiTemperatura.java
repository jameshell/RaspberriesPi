/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author james
 */
public class PiTemperatura {
    
    float temperatura;
    float posicionX;
    float posicionY;
    float humedad;
    

    public PiTemperatura(float temperatura, float posicionX, float posicionY, float humedad) {
        this.temperatura = temperatura;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.humedad = humedad;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(float posicionX) {
        this.posicionX = posicionX;
    }

    public float getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(float posicionY) {
        this.posicionY = posicionY;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    @Override
    public String toString() {
        return "PiTemperatura{" + "temperatura=" + temperatura + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", humedad=" + humedad + '}';
    }
    
    
    
    
    
    
}
