/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author EqeS
 */
public interface IOturum {
    String oturum(String name,String sifre);
    String oturumKullaniciAdi();
    String oturumIsimSoyisim();
    String oturumEmail();
    boolean oturumKontrol();
    boolean oturumSifreKontrol(String sifre);
    void writeFileOturum(String bilgi);
    
}
