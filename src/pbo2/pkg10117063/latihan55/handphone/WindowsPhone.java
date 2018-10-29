/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan55.handphone;

/*
Nama : Cessario Sheva L.P.A
Kelas: IF-2
Nim  : 10117063
Deskripsi Program : Menampilkan Merk HP
 */
public class WindowsPhone extends Handphone {
    private String wpKeyStore;

    public WindowsPhone(String wpKeyStore, String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.wpKeyStore = wpKeyStore;
        
        System.out.println("Manufaktur : "+man);
        System.out.println("OS : " +os);
        System.out.println("Model : " +model);
        System.out.println("Harga : " +harga);
        System.out.println("Android Key : " +wpKeyStore);
        System.out.println("");
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
    
}
