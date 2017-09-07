/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Carlos
 */
public class RaspPi {
    float posx;
    float posy;
    float rssi_b1;
    float rssi_b2;
    float rssi_b3;
    float rssi_b4;
    float rssi_b5;
    float rssi_b6;

    public float getPosx() {
        return posx;
    }

    public void setPosx(float posx) {
        this.posx = posx;
    }

    public float getPosy() {
        return posy;
    }

    public void setPosy(float posy) {
        this.posy = posy;
    }

    public float getRssi_b1() {
        return rssi_b1;
    }

    public void setRssi_b1(float rssi_b1) {
        this.rssi_b1 = rssi_b1;
    }

    public float getRssi_b2() {
        return rssi_b2;
    }

    public void setRssi_b2(float rssi_b2) {
        this.rssi_b2 = rssi_b2;
    }

    public float getRssi_b3() {
        return rssi_b3;
    }

    public void setRssi_b3(float rssi_b3) {
        this.rssi_b3 = rssi_b3;
    }

    public float getRssi_b4() {
        return rssi_b4;
    }

    public void setRssi_b4(float rssi_b4) {
        this.rssi_b4 = rssi_b4;
    }

    public float getRssi_b5() {
        return rssi_b5;
    }

    public void setRssi_b5(float rssi_b5) {
        this.rssi_b5 = rssi_b5;
    }

    public float getRssi_b6() {
        return rssi_b6;
    }

    public void setRssi_b6(float rssi_b6) {
        this.rssi_b6 = rssi_b6;
    }

    public RaspPi(float posx, float posy, float rssi_b1, float rssi_b2, float rssi_b3, float rssi_b4, float rssi_b5, float rssi_b6) {
        this.posx = posx;
        this.posy = posy;
        this.rssi_b1 = rssi_b1;
        this.rssi_b2 = rssi_b2;
        this.rssi_b3 = rssi_b3;
        this.rssi_b4 = rssi_b4;
        this.rssi_b5 = rssi_b5;
        this.rssi_b6 = rssi_b6;
    }

    @Override
    public String toString() {
        return "RaspPi{" + "posx=" + posx + ", posy=" + posy + ", rssi_b1=" + rssi_b1 + ", rssi_b2=" + rssi_b2 + ", rssi_b3=" + rssi_b3 + ", rssi_b4=" + rssi_b4 + ", rssi_b5=" + rssi_b5 + ", rssi_b6=" + rssi_b6 + '}';
    }
    
}
