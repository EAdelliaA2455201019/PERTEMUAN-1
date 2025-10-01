/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author pc18
 */

// Program Menghitung Total Belanja di Toko
// Studi Kasus menggunakan Array, Perulangan, dan Percabangan
public class StudiKasusDasarPemrograman_MenghitungTotalBelanjaDiToko {

    public static void main(String[] args) {
        // Array menyimpan harga buku yang dibeli (dalam rupiah)
        int[] hargaBuku = {50000, 75000, 60000, 40000};  
        // Pembeli membeli 4 buku dengan harga berbeda
        
        // Variabel untuk menyimpan total harga semua buku
        // Diberi nilai awal 0 karena penjumlahan dimulai dari nol
        int total = 0;
        
        // Perulangan for untuk menjumlahkan semua harga buku
        for (int i = 0; i < hargaBuku.length; i++) {
            total += hargaBuku[i]; // Menambahkan harga tiap buku ke total
        }
        
        // Menampilkan total sebelum diskon
        System.out.println("Total harga sebelum diskon: Rp " + total);
        
        // Variabel untuk menyimpan diskon
        double diskon = 0;
        
        // Percabangan if-else untuk menentukan diskon
        if (total > 200000) { 
            // Jika total belanja lebih dari Rp200.000, diskon 15%
            diskon = 0.15;
            
        } 
        
        else if (total > 100000) { 
            // Jika total belanja lebih dari Rp100.000, diskon 10%
            diskon = 0.10;
        } 
        
        else {
            // Jika kurang dari Rp100.000, tidak ada diskon
            diskon = 0.0;
        }
       
        // Menghitung jumlah potongan harga
        double potongan = total * diskon;
        
        // Menghitung total yang harus dibayar setelah diskon
        double totalBayar = total - potongan;
        
        // Menampilkan hasil akhir
        System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
        System.out.println("Total potongan: Rp " + potongan);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }  
}
