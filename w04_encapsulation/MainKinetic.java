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

public class MainKinetic {
    private double massa;
    private double kecepatan;

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainKinetic objekKinetic = new MainKinetic();

        System.out.print("Masukkan massa sepeda (kg): ");
        double massa = scanner.nextDouble();
        objekKinetic.setMassa(massa);

        System.out.print("Masukkan kecepatan sepeda (m/s): ");
        double kecepatan = scanner.nextDouble();
        objekKinetic.setKecepatan(kecepatan);

        double energiKinetikHasil = objekKinetic.hitungEnergiKinetik();

        System.out.println("Energi kinetik sepeda adalah: " + energiKinetikHasil + " Joule");
    }
}
