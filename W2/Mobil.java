/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W2;

/**
 *
 * @author Jonathan Setya Widayat
 */
public class Mobil {
    String pabrik, type, warna;

    public Mobil() {
        System.out.println("Ini dari Const Mobil");
    }

    
    
    public static void main(String[] args) {
        //instance = instasiasi
        // adalah pembentukan objek dari class
        //namaClass namaObject = new nama Constructor();
        Mobil mobil = new Mobil(); 
        mobil.bergerakMaju();
        mobil.bergerakmundur();
        mobil.parkir();
        mobil.pabrik = "Honda";
        mobil.type = "CRV";
        mobil.warna = "Putih";
        System.out.println(mobil.pabrik+" tipenya "+mobil.type+" warnanya "+mobil.warna);
        
        Mobil mobil2 = new Mobil(); 
        mobil2.bergerakMaju();
        mobil2.bergerakmundur();
        mobil2.parkir();
        mobil2.pabrik = "Toyota";
        mobil2.type = "Inova";
        mobil2.warna = "Kuning";
        System.out.println(mobil2.pabrik+" tipenya "+mobil2.type+" warnanya "+mobil2.warna);
    }
    
    public void bergerakMaju(){
        System.out.println("Mobil Bergerak Maju");
    }

    public void bergerakmundur() {
        System.out.println("Mobil Bergerak Mundur");
    }

    public void parkir() {
        System.out.println("Mobil Sedang Parkir");
    }

}