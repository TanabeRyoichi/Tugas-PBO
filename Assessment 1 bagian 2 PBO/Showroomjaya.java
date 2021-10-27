package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Showroomjaya {
    private static final ArrayList<Mobil> arrMobil = new ArrayList<>();
    private  static  Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        ///Mobil merk1 = new Mobil("Avanza","2018", 150000000.0,5);
        //merk1.displayInfo();
        System.out.println();
        int pilihan;

        do {
            System.out.println("1 tambah mobil");
            System.out.println("2 beli mobil ");
            System.out.println("3 View stok mobil");
            System.out.println("4 kembali");

            System.out.print("masukkan pilihan");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    tambahMobil();
                    break;
                case 2:
                    beliMobil();
                    break;
                case 3:
                    viewStok();
                    break;
                case 4:
                    System.out.println("kembali menu");
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while (pilihan != 4);
    }


    private static  void viewStok() {
        System.out.println("\nMenampilkan stok mobil");
        for (Mobil b : arrMobil) {
            System.out.println("Nama Merk :" + b.getMerk());
            System.out.println("Stok Mobil :" + b.getStok());
        }
        System.out.println();
    }

    private static void beliMobil() {
        System.out.println();
        System.out.println("Showroom Mobil Jaya - Penjualan");
        System.out.print("Merk : ");
        String merk = s.next();
        System.out.print("Tahun Keluaran : ");
        String tahunkeluaran = s.next();
        System.out.print("Jumlah : ");
        int jumlahBarang = s.nextInt();
        double total = 0;
        double diskon;
        Mobil b = beliMobilByMerk(merk,tahunkeluaran);
        if (b != null) {
            System.out.println();
            if (jumlahBarang == 1){
                System.out.println("Merk            :" + b.getMerk());
                System.out.printf("Harga Satuan    :" + "%.1f\n", b.getHarga());
                System.out.println("Tahun Keluaran  :" + b.getTahunKeluaran());
                System.out.println("Jumlah Beli     :" + jumlahBarang);
                total = b.getHarga()*jumlahBarang;
                System.out.printf("Total Harga     :" +"%.1f\n",total);
                System.out.println("Diskon          :0.0 persen");
                System.out.printf("Total Diskon    :" + "%.2f\n", jumlahBarang*b.getHarga()*0/100);
                diskon = total*0/100;
                total = total - diskon;
                System.out.printf("Total Bayar     :" + "%.1f\n", total);
            }
            else if (jumlahBarang == 2){
                System.out.println("Merk            :" + b.getMerk());
                System.out.printf("Harga Satuan    :" + "%.1f\n", b.getHarga());
                System.out.println("Tahun Keluaran  :" + b.getTahunKeluaran());
                System.out.println("Jumlah Beli     :" + jumlahBarang);
                total = b.getHarga()*jumlahBarang;
                System.out.printf("Total Harga     :" +"%.1f\n",total);
                System.out.println("Diskon          :10.0 persen");
                System.out.printf("Total Diskon    :" + "%.2f\n", jumlahBarang*b.getHarga()*10/100);
                diskon = total*10/100;
                total = total - diskon;
                System.out.printf("Total Bayar     :" + "%.2f\n", total);
            }
            else if (jumlahBarang > 2 && jumlahBarang < 15 ){
                System.out.println("Merk            :" + b.getMerk());
                System.out.printf("Harga Satuan    :" + "%.1f\n", b.getHarga());
                System.out.println("Tahun Keluaran  :" + b.getTahunKeluaran());
                System.out.println("Jumlah Beli     :" + jumlahBarang);
                total = b.getHarga()*jumlahBarang;
                System.out.printf("Total Harga     :" +"%.1f\n",total);
                System.out.println("Diskon          :20.0 persen");
                System.out.printf("Total Diskon    :" + "%.1f\n", jumlahBarang*b.getHarga()*20/100);
                diskon = total*20/100;
                total = total - diskon;
                System.out.printf("Total Bayar     :" + "%.1f\n", total);
            }
            else if (jumlahBarang == 15) {
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi");
            }

            System.out.println();
        }
    }

    private static  Mobil beliMobilByMerk(String merk,String tahunKeluaran) {
        Mobil bBuy = null;
        for (Mobil b : arrMobil) {
            if (merk.equals(b.getMerk())&tahunKeluaran.equals(b.getTahunKeluaran())) {
                bBuy = b;
            }
        }
        return bBuy;
    }



    private static void tambahMobil() {
        System.out.println("\nMobil baru");
        System.out.println();
        System.out.print("Merk : ");
        String merk = s.next();
        System.out.print("tahun keluaran :");
        String tahunKeluaran = s.next();
        System.out.print("harga :");
        double harga = s.nextDouble();
        System.out.print("stok :");
        int stok = s.nextInt();

            Mobil b = new Mobil(merk, tahunKeluaran, harga, stok);
            arrMobil.add(b);
            System.out.println("Data Mobil tersimpan");
        System.out.println();

    }
}
