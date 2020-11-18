/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan58.tambahkurang;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program penjumlahan dan pengurangan
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        System.out.println("Hasil selisih " + super.getX() + " - " + super.getY() + " = " + (super.getX()-super.getY()));
    }
}
