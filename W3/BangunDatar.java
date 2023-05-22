/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W3;

/**
 *
 * @author Jonathan Setya Widayat
 * @NIM 22104410047
 * @Prodi Teknik Informatika - Universitas Islam Balitar
 */
public class BangunDatar {

    int luas;
    
    public BangunDatar() {
        
    }
    
    
    
    public static void main(String[] args) {
        BangunDatar persegi = new BangunDatar(3);
        persegi.cetak(3);
        
        BangunDatar persegiPanjang = new BangunDatar(4,3);
        persegiPanjang.cetak(3,4);
    }

    private BangunDatar(int sisi) {
        luas = sisi * sisi;
        System.out.println("Luas Persegi = "+luas);
    }

    private BangunDatar(int panjang, int lebar) {
        luas = panjang * lebar;
        System.out.println("Luas PersegiPanjang = "+luas);
    }

    private void cetak(int sisi) {
        System.out.println("Persegi sisinya = "+sisi);
    }

    private void cetak(int panjang, int lebar) {
        System.out.println("Persegi Panjang Panjangnya = "+panjang);
        System.out.println("Persegi Panjang Lebarnya = "+lebar);
    }

}
