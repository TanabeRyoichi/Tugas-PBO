package com.company;

public class Main {

    public static void main(String[] args) {
        //objek 1
        Barang brg1 = new Barang("BRG-001","Tas Gucci");
        brg1.setHarga(1200);
        //objek2
        Barang brg2 = new Barang("BRG-002","Printer Epson L355");
        brg2.setHarga(200);
        //objek 3
        Barang brg3 = new Barang("BRG-003","Koper", 150);
        //objek 4
        Barang brg4 = new Barang("BRG-004","helm", 20);

        //Menampilkan objek 1
        System.out.println(brg1.getIdProduk() + " " + brg1.getNama() + " " + brg1.getHarga());

        //Menampilkan objek 2
        System.out.println(brg2.getIdProduk() + " " + brg2.getNama() + " " + brg2.getHarga());

        //Menampilkan objek 3
        System.out.println(brg3.getIdProduk() + " " + brg3.getNama() + " " + brg3.getHarga());

        //Menampilkan objek 4
        System.out.println(brg4.getIdProduk() + " " + brg4.getNama() + " " + brg4.getHarga());

        //Total harga  harga dari BRG-001, BRG-003, dan BRG-004.
        System.out.println(brg1.getHarga() + brg3.getHarga() + brg4.getHarga());
    }
}
