/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package WLast_UAS;
//nama package Wlast uas karena ini adalah yang terakhir dan tugas uas atau Ujian Akhir Semester

/**
 *
 * @author Jonathan Setya Widayat
 * @NIM 22104410047
 * @Prodi Teknik Informatika - Universitas Islam Balitar
 */
import javax.swing.JOptionPane;
//menampilkan kotak dialog yang bisa memasukkan input dari pengguna

public class HitungOperasi {
//deklarasi kelas utama yang dinamakan hitung operasi
    public static void main(String[] args) {
//metode utama yang akan dieksekusi saat program dimulai nanti
        int a = 100;
//deklarasi dan inisialisasi atau eksekusi variabel a dengan nilai 100
        int b = 25;
//deklarasi dan inisialisasi atau eksekusi variabel a dengan nilai 25
        int hasil;
//deklarasi variabel yang akan digunakan untuk menyimpan hasil operasi
        while (true) {
//memulai loop tak terbatas, yang akan terus berjalan selama kondisi yang ada itu "true"
            String inputPilihan = JOptionPane.showInputDialog(null,
                    "Menu Pilihan\n" +
                            "1. Tambahkan a + b\n" +
                            "2. Kurangkan a - b\n" +
                            "3. Keluar\n" +
                            "Masukkan pilihan (1/2/3)");
//menampilkan dialog input menggunakan JOptionPane yang menampilkan menu pilihan kepada pengguna
//pengguna akan diminta untuk memasukkan pilihan operasi yang terdiri dari 1/2/3
            if (inputPilihan == null) {
                // Jika pengguna mengklik tombol "Cancel" maka program akan berakhir
                JOptionPane.showMessageDialog(null, "Program berakhir.");
                System.exit(0);
            }
//memeriksa apakah pengguna mengklik tombol "Cancel" di dialog input
//jika ya, program akan memberi pesan bahwa program berakhir dan keluar dari program menggunakan System.exit(0)
//namun jika tidak maka program akan terus berjalan dan proses loop akan terus berjalan
            int pilihan = Integer.parseInt(inputPilihan);
//mengonversi input pilihan pengguna (yang berupa string) menjadi bilangan bulat
            switch (pilihan) {
//menggunakan struktur switch untuk memeriksa nilai pilihan dan menjalankan operasi sesuai dengan pilihan yang telah dimasukkan
                case 1:
                    hasil = a + b;
                    JOptionPane.showMessageDialog(null, "Hasil dari a + b = " + hasil);
                    break;
//jika pilihan adalah 1, maka melakukan operasi penjumlahan a + b, setelah itu dieksekusi atau inisialisasi
//lalu akan ditampikan hasilnya
                case 2:
                    hasil = a - b;
                    JOptionPane.showMessageDialog(null, "Hasil dari a - b = " + hasil);
                    break;
//jika pilihan adalah 2, maka melakukan operasi pengurangan a - b, setelah itu dieksekusi atau inisialisasi
//lalu akan ditampikan hasilnya
                case 3:
                    JOptionPane.showMessageDialog(null, "Terima kasih! Program berakhir.");
                    System.exit(0);
                    break;
//jika pilihan adalah 3, maka operasi atau program akan berakhir serta akan menampikan "Terima Kasih! Program berakhir."
//dan program selesai dan otomatis akan keluar
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan pilih lagi.");
//namun hasil akan berbeda apabila pilihan bukan 1,2,3 maka akan muncul "Pilihan tidak valid. Silahkan pilih lagi."
//serta pengguna akan diminta untuk memberikan pilihan yang benar
            }
        }
    }
}
