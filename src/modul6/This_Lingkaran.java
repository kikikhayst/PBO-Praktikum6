/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author ASUS
 */
public class This_Lingkaran {

    static final double pi = 3.14;
    double radius = 18;
    String warna = "biru";

    double hitungLuas() {
        return pi * this.radius * this.radius;
    }

    public static void main(String args[]) {
        This_Lingkaran bulat = new This_Lingkaran();
        System.out.println("Luas lingkaran = " + bulat.hitungLuas());
        System.out.println("Warna lingkaran = " + bulat.warna);
    }
}
