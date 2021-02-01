/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.GirisIslem.lokasyon;
import GUI.Kayit;
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
public class KayitIslem extends DosyaIslemleri implements IKayit{
    static String  lokasyon = "C:\\db\\kullanicisifre.txt";
    static Kayit kayit = new Kayit();
    
    
    //Kayıt kontrol işlemi burada yapılır.
    //Kayıt işleminde kullanicisifre.txt dosyasının içerisindeki kullanıcı ve mail verilerini okur ve eğer varsa hata vermesini sağlar.
    @Override
    public boolean kayitKontrol(String kullaniciadi,String mail){
        try(Scanner scan = new Scanner(new FileReader(lokasyon));) {
            while(scan.hasNextLine()){
                String kayitBilgileri = scan.nextLine();
                String[] kayitArray = kayitBilgileri.split(",");
                String kullanici = kayitArray[0];
                String email = kayitArray[3];
                if(kullaniciadi.equals(kullanici) || mail.equals(email)){
                    return true;
                }
                
            }
        } catch (Exception e) {
        }
        return false;
    }
    
}
