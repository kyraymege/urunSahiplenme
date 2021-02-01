/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.GirisIslem.lokasyon;
import static GUI.KayitIslem.lokasyon;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Object;

/**
 *
 * @author EqeS
 */
public class urunEkleDegistir extends DosyaIslemleri implements IUrun{

    @Override
    public void dosyaYarat(String lokasyon) {
        File file = new File(lokasyon);
        try {
            if (file.createNewFile()) {

            } else {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] urunEkle() {
        String[] ege = null;
        GirisIslem girisIslem = new GirisIslem();
        try (Scanner scan = new Scanner(new FileReader("C:\\db\\urunler\\" + girisIslem.oturumKullaniciAdi() + ".txt"));) {
            while (scan.hasNextLine()) {

                String kullanıcıBilgileri = scan.nextLine();
                String[] girisArray = kullanıcıBilgileri.split(",");
                return girisArray;
            }

        } catch (FileNotFoundException ex) {

        }
        return ege;
    }

    @Override
    public String mesajArama() {
        GirisIslem girisIslem = new GirisIslem();
        String bos = " ";
        try (Scanner scan = new Scanner(new FileReader("C:\\db\\mesajlar\\" + girisIslem.oturumKullaniciAdi() + "mesajı.txt"));) {
            String mesaj = scan.nextLine();
            return mesaj;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(urunEkleDegistir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bos;
    }

    @Override
    public String urunAramano() {
        GirisIslem girisIslem = new GirisIslem();
        try (Scanner scan = new Scanner(new FileReader("C:\\db\\urunAramaNo.txt"));) {

            while (scan.hasNextLine()) {
                String kullanıcıBilgileri = scan.nextLine();
                String giris = kullanıcıBilgileri;
                int deger;
                deger = Integer.valueOf(giris);
                deger = deger + 1;
                String sonuc = String.valueOf(deger);
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\db\\urunAramaNo.txt"));
                writer.write(sonuc);
                writer.close();
                return sonuc;
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        return "";
    }

    @Override
    public void writeFile(String urunIsim, String urunSeriNo, String urunDurumu, String urunAramaNo) {
        GirisIslem girisIslem = new GirisIslem();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\db\\urunler\\" + girisIslem.oturumKullaniciAdi() + ".txt", true));
            writer.write(urunIsim + "," + urunSeriNo + "," + urunDurumu + "," + urunAramaNo + "\n");
            writer.close();
        } catch (IOException ex) {
        }
    }

    public void writeFile2(String urunIsim, String urunSeriNo, String urunDurumu, String urunAramaNo) {
        GirisIslem girisIslem = new GirisIslem();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\db\\urunler\\" + girisIslem.oturumKullaniciAdi() + ".txt", true));
            writer.write(urunIsim + "," + urunSeriNo + "," + urunDurumu + "," + urunAramaNo + "\n");
            writer.close();
        } catch (IOException ex) {
        }
    }

    public void urunDosyaYarat(String lokasyon) {
        File file = new File(lokasyon);
        try {
            if (file.createNewFile()) {

            } else {

            }

        } catch (IOException e) {
        }
    }

    
}
