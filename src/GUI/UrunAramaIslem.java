/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author EqeS
 */
public class UrunAramaIslem extends DosyaIslemleri{
    private urunEkleDegistir urunArama;
    
    public UrunAramaIslem(urunEkleDegistir urunArama){
        this.urunArama=urunArama;
}
    
     public void urunAramaMethod() {
        
        try {
            dosyaSil("C:\\db\\aramaNo.txt");
            dosyaYarat("C:\\db\\aramaNo.txt");
            try (Scanner scan = new Scanner(new FileReader("C:\\db\\kullanicisifre.txt"));) {
                while (scan.hasNextLine()) {
                    String kullaniciBilgileri = scan.nextLine();
                    String[] girisArray = kullaniciBilgileri.split(",");
                    String giris = girisArray[0];
                    try (Scanner alo = new Scanner(new FileReader("C:\\db\\urunler\\" + giris + ".txt"));) {

                        while (alo.hasNextLine()) {
                            String aramabilgisi = alo.nextLine();
                            String[] aramaArray = aramabilgisi.split(",");
                            String yazdir = aramaArray[3];

                            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\db\\aramaNo.txt", true));
                            writer.write(giris + "," + yazdir + "\n");
                            writer.close();
                        }

                    }
                }

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
    
}
