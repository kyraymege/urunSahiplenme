/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
import javax.swing.JOptionPane;

/**
 *
 * @author EqeS
 */
public class DosyaIslemleri extends KlasorYaratma{
    //Dosya yaratma methodu
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
    //Birine mesaj yazılırsa mesajın oluşturulduğu kısım.
    public void mesajYazdırma(){
        GirisIslem giris=new GirisIslem();
        try (Scanner scan = new Scanner(new FileReader("C:\\db\\mesajlar\\"+giris.oturumKullaniciAdi()+"mesajı.txt"));) {
          while(scan.hasNextLine()){
              String arr=scan.nextLine();
              String []arr2=arr.split(","); 
              JOptionPane.showMessageDialog(null,arr2[1]+" adlı kişiden gelen mesaj: "+"\n"+ arr2[2]);
          }
        } catch (FileNotFoundException ex) {
           
        }
    }
    //Dosyaya yazdırma methodu.
    public void writeFile(String kullaniciadi,String sifre,String isim,String mail){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(lokasyon,true));
            writer.write(kullaniciadi+","+sifre+","+isim+","+mail+"\n");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();}
    }
    //Dosyaya yazdırma methodu.(true olmadığı için dosyaya her yeni şey yazıldığında eskisi silinir.)
    public void writeFile2(String deger,String lokasyon){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(lokasyon));
            writer.write(deger+"\n");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();}
    }
    //Dosya silme methodu.
    public void dosyaSil(String lokasyon) {
    File f = new File(lokasyon);
        if (!f.exists()) { // eğer dosya yoksa
            System.out.println("Dosya bulunamadığından silinemedi");
        } else {
            f.delete(); // eğer dosyamız varsa.. // silme işlemi gerçekleştirir.
            System.out.println(f.getName() + " adlı dosya başarılı bir şekilde silinmiştir.");
        }}
    
    //Gerekli klasörleri yaratma methodu.
    @Override
    public void klasorYaratma(){
        File e = new File("C:\\db");
        File c=new File ("C:\\db\\mesajlar");
        File a=new File("C:\\db\\urunler");
        File g=new File("C:\\db\\aramaNo.txt");
        File d=new File("C:\\db\\kullanicisifre.txt");
        File x=new File("C:\\db\\oturum.txt");
        File v=new File("C:\\db\\urunAramaNo.txt");
        
try{
    if(e.mkdir()) { 
        System.out.println("Directory Created");
    } else {
        System.out.println("Directory is not created");
    }
} catch(Exception ex){
    ex.printStackTrace();
}  c.mkdir();
a.mkdir();
        try {
            g.createNewFile();
            d.createNewFile();
            x.createNewFile();
            v.createNewFile();
        } catch (IOException ex) {
        }

    }
    }
