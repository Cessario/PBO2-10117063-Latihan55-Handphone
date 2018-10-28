/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan55.handphone;

/**
 *
 * @author Deadpool
 */
public class Blackberry extends Handphone{
    private String pinBB;

    public Blackberry(String pinBB, String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
        
        System.out.println("Manufaktur : "+man);
        System.out.println("OS : " +os);
        System.out.println("Model : " +model);
        System.out.println("Harga : " +harga);
        System.out.println("Android Key : " +pinBB);
        System.out.println("");
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
    
}
