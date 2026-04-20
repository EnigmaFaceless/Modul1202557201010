/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array.pkg2.dimensi;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Modul1202557201010 {
    public static void main(String[] args) {
      int angka [][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
      int total = 0;
      int jumlah = 0;
      
      for (int a = 0; a<angka.length; a++){
          for ( int b = 0; b < angka[a].length; b++){
             System.out.print(angka[a][b]+" ");
              total += angka [a][b];
         jumlah++;
      }
        System.out.println("");
    }
      int ratarata= total/jumlah;
         System.out.println("total adalah : "+total);
          System.out.println("jumlah adalah: "+jumlah);
          System.out.println("ratarata adalah : "+ratarata);
          
          int cari = Integer.parseInt(
                  JOptionPane.showInputDialog("Masukkan angka yang ingin dicari : "));
          
          int angkaBaru = Integer.parseInt(
                  JOptionPane.showInputDialog("Masukkan angka baru yang ingin dicari : "));
         
          boolean ketemu = false;
          
         for (int a = 0; a<angka.length; a++){
          for ( int b = 0; b < angka[a].length; b++){
         if (angka [a][b] == cari) {
         ketemu = true;
      
         angka [a][b]= angkaBaru;
         
         JOptionPane.showMessageDialog(null,"Ketemu di indeks ["+a+"]["+b+"]");
         
          }
          }
          }
         if (! ketemu){
              JOptionPane.showMessageDialog(null,"Angka tidak ditemukan!");
         }
             System.out.println("Array setelah dirubah");
             for (int a = 0; a<angka.length; a++){
          for ( int b = 0; b < angka[a].length; b++){
              System.out.print(angka[a][b] +" ");
          }
                 System.out.println("");
    }
             int totalGanjil= 0;
             for (int a = 0; a<angka.length; a++){
          for ( int b = 0; b < angka[a].length; b++){
              if (b%2 != 0){
              totalGanjil +=angka [a][b];
          }
}
}
             System.out.println("Jumlah Index kolom ganjil Setelah Array Dirubah yaitu : " + totalGanjil);
    }
}