/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan36.ootarget;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Nim   : 10117048
 * Kelas : PBO2
 * Deskripsi Program : Program yang berisi menghitung lama tabungan mencapai
 *                     saldo yang ditargetkan dengan OO.
 */
public class PBO210117048Latihan36OOTarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoTab = 3500000;
        double bungaBul = 0.08;
        double saldoBul = 6000000;

        TargetSaldo tar = new TargetSaldo();
        tar.hitungTargetSaldo(saldoTab, bungaBul, saldoBul);
    }
    
}
