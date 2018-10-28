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
public class Android extends Handphone {
    private String keyStore;

    public Android(String keyStore, String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.keyStore = keyStore;
        
        System.out.println("Manufaktur : "+man);
        System.out.println("OS : " +os);
        System.out.println("Model : " +model);
        System.out.println("Harga : " +harga);
        System.out.println("Android Key : " +keyStore);
        System.out.println("");
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
    
    
}
