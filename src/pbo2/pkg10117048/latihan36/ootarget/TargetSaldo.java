/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan36.ootarget;

/**
 *
 * @author acer
 */
public class TargetSaldo {
  public void hitungTargetSaldo(int saldoTab, double bungaBul, double saldoBul){
      int i;
      for(i = 1; saldoTab <=6000000; i++) {
           saldoBul = bungaBul * saldoTab;
            saldoTab = (int) (saldoTab + saldoBul);
            System.out.println("Saldo di bulan ke-" + i + " Rp. "
                    + saldoTab);
      }
             
  }
 
}
