/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.KayitIslem.lokasyon;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author EqeS
 */
public class GirisIslem extends DosyaIslemleri implements IOturum,IGiris{
    static String  lokasyon = "C:\\db\\kullanicisifre.txt";
    @Override
    //Giriş kısmı burada belirlenir. Eğer bilgiler doğruysa true döndürür. Yanlışsa false döndürür.
    public boolean login(String name,String sifre){
        try(Scanner scan = new Scanner(new FileReader(lokasyon));) {
            while(scan.hasNextLine()){
                String girisBilgileri = scan.nextLine();
                String[] girisArray = girisBilgileri.split(",");
                String giris = girisArray[0]+","+girisArray[1];
                if(giris.equals(name+","+sifre)){
                    return true;
                }
                
            }
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    //Eğer giriş bilgileri eşleşirse oturum methodu bilgileri döndürür. Eğer eşleşmez ise hiçbir şey döndürmez.
    public String oturum(String name, String sifre) {
        String bos = " ";
        try(Scanner scan = new Scanner(new FileReader("C:\\db\\kullanicisifre.txt"));) {
            while(scan.hasNextLine()){
                String oturumBilgileri = scan.nextLine();
                String[] oturumArray = oturumBilgileri.split(",");
                String bilgi = oturumArray[0]+","+oturumArray[1]+","+oturumArray[2]+","+oturumArray[3];
                String giris = oturumArray[0]+","+oturumArray[1];
                
                if(giris.equals(name+","+sifre)){
                    return bilgi;
                    
                }
                
            }
        } catch (Exception e) {
        }
        return bos;
    }

    @Override
    //Oturum dosyasina gidip kullanici adı verisini çeker.
    public String oturumKullaniciAdi() {
        String bos = " ";
        try(Scanner scan = new Scanner(new FileReader("C:\\db\\oturum.txt"));) {
            while(scan.hasNextLine()){
                String oturumBilgileri = scan.nextLine();
                String[] oturumArray = oturumBilgileri.split(",");
                String bilgi = oturumArray[0];
                return bilgi;
            }
        } catch (Exception e) {
        }
        return bos;
    }

    @Override
    //Oturum dosyasina gidip isim, soyisim verisini çeker.
    public String oturumIsimSoyisim() {
        String bos = " ";
        try(Scanner scan = new Scanner(new FileReader("C:\\db\\oturum.txt"));) {
            while(scan.hasNextLine()){
                String oturumBilgileri = scan.nextLine();
                String[] oturumArray = oturumBilgileri.split(",");
                String bilgi = oturumArray[2];
                return bilgi;
            }
        } catch (Exception e) {
        }
        return bos;
    }

    @Override
    //Oturum dosyasina gidip e-mail verisini çeker.
    public String oturumEmail() {
        String bos = " ";
        try(Scanner scan = new Scanner(new FileReader("C:\\db\\oturum.txt"));) {
            while(scan.hasNextLine()){
                String oturumBilgileri = scan.nextLine();
                String[] oturumArray = oturumBilgileri.split(",");
                String bilgi = oturumArray[3];
                return bilgi;
            }
        } catch (Exception e) {
        }
        return bos;
    }

    @Override
    //Oturum dosyasina gidip, eğer içinde bir veri varsa true yoksa false döndürür.
    //Bu daha sonra giriş yapmak istendiğinde Şifre girip kalınan yerden devam etmesini sağlar.
    public boolean oturumKontrol() {
        try(Scanner scan = new Scanner(new FileReader("C:\\db\\oturum.txt"));) {
                if(scan.hasNext()){
                   return true; 
                } 
            
        } catch (Exception e) {
        }return false;
    }

    @Override
    //Oturum açıldıktan sonra uygulama kapatılıp tekrar açıldığında girilen şifrenin doğruluğunu kontrol eder.
    public boolean oturumSifreKontrol(String sifre) {
        String bos = " ";
        try(Scanner scan = new Scanner(new FileReader("C:\\db\\oturum.txt"));) {
            while(scan.hasNextLine()){
                String oturumBilgileri = scan.nextLine();
                String[] oturumArray = oturumBilgileri.split(",");
                String giris = oturumArray[1];
                
                if(giris.equals(sifre)){
                    return true;
                    
                }
                
            }
        } catch (Exception e) {
        }
        return false;
    }

    
    

    @Override
    //Dosya yaratma methodu.
    public void dosyaYarat(String lokasyon) {
        File file = new File(lokasyon); 
        try {
            if(file.createNewFile()){
                
            }else{
               
            }
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    //Oturum dosyasına yazdırma methodu.
    public void writeFileOturum(String bilgi) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\db\\oturum.txt"));
            writer.write(bilgi);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();}

    }
    }
    
    
    
