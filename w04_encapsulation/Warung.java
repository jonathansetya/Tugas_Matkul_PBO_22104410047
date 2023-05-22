/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w04_encapsulation;

import java.util.Scanner;

/**
 *
 * @author Jonathan Setya Widayat
 * @NIM 22104410047
 * @Prodi Teknik Informatika - Universitas Islam Balitar
 */
public class Warung {
    
    public String makanan, minuman;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String cola) {
        this.minuman = cola;
    }
    
    
    public static void main(String[] args) {
        
        Warung warung = new Warung();
        System.out.println("Masukkan makanan: ");
        Scanner varMakan = new Scanner(System.in);
        warung.setMakanan(varMakan.nextLine());
        System.out.println("Menu Makanan :"+warung.getMakanan());

        
    }
}
