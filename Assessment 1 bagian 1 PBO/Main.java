package com.company;

public class Main {

    public static void main(String[] args) {
        //objek baru Market
	Market ekspedisi1 = new Market("1", "N0001", "JNE", 21000.0, "Eiger","Bandung Kopo", "Bejo", "DayeuhKolot");
	Market ekspedisi2 = new Market("2", "N0003", "J&T", 16000.0, "Eiger","Bandung Kopo", "Tini", "DayeuhKolot");
	Market ekspedisi3 = new Market("3", "N0004", "Pos Indonesia", 23000.0, "Eiger","Bandung Kopo", "Bambang", "DayeuhKolot");
	Market ekspedisi4 = new Market("4", "N0002", "siCepat", 24000.0, "Eiger","Bandung Kopo", "Joko", "DayeuhKolot");

	    //objek baru drophipper
    Dropshipper dropshipper1 = new Dropshipper("Dropship1","Surabaya");
    Dropshipper dropshipper2 = new Dropshipper("Dropship2","Pontianak");

        //objek baru asuransi
    Asuransi asuransi = new Asuransi(40000.0);

	//tampilan output ekspedisi 1
        System.out.println("Asuransi dan Dropship");
        System.out.println("No Transaksi :" + " " + ekspedisi1.getNoTransaksi());
        System.out.println("No Resi :" + " " + ekspedisi1.getNoResi());
        System.out.println("Nama Ekspedisi :" + " " + ekspedisi1.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :" + " " + ekspedisi1.getOngkosKirim());
        System.out.println("Nama Pengirim :" + " " + dropshipper1.getNamaPengirimDopshipper());
        System.out.println("Alamat Pengirim :" + " " + dropshipper1.getAlamatPengirimDropshipper());
        System.out.println("Nama Penerima :" + " " + ekspedisi1.getNamaPenerima());
        System.out.println("Alamat Penerima :" + " " + ekspedisi1.getAlamatPenerima());
        System.out.println("Nominal Asuransi :" + " " + asuransi.getNominalAsuransi());

        System.out.println();


        //tampilan output ekspedisi 2
        System.out.println("Asuransi ");
        System.out.println("No Transaksi :" + " " + ekspedisi2.getNoTransaksi());
        System.out.println("No Resi :" + " " + ekspedisi2.getNoResi());
        System.out.println("Nama Ekspedisi :" + " " + ekspedisi2.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :" + " " + ekspedisi2.getOngkosKirim());
        System.out.println("Nama Pengirim :" + " " + ekspedisi2.getNamaPengirim());
        System.out.println("Alamat Pengirim :" + " " + ekspedisi2.getAlamatPengirim());
        System.out.println("Nama Penerima :" + " " + ekspedisi2.getNamaPenerima());
        System.out.println("Alamat Penerima :" + " " + ekspedisi2.getAlamatPenerima());
        System.out.println("Nominal Asuransi :" + " " + asuransi.getNominalAsuransi());

        System.out.println();

        //tampilan output ekspedisi 3
        System.out.println("Normal");
        System.out.println("No Transaksi :" + " " + ekspedisi3.getNoTransaksi());
        System.out.println("No Resi :" + " " + ekspedisi3.getNoResi());
        System.out.println("Nama Ekspedisi :" + " " + ekspedisi3.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :" + " " + ekspedisi3.getOngkosKirim());
        System.out.println("Nama Pengirim :" + " " + ekspedisi3.getNamaPengirim());
        System.out.println("Alamat Pengirim :" + " " + ekspedisi3.getAlamatPengirim());
        System.out.println("Nama Penerima :" + " " + ekspedisi3.getNamaPenerima());
        System.out.println("Alamat Penerima :" + " " + ekspedisi3.getAlamatPenerima());

        System.out.println();

        //tampilan output ekspedisi 4
        System.out.println("Dropship");
        System.out.println("No Transaksi :" + " " + ekspedisi4.getNoTransaksi());
        System.out.println("No Resi :" + " " + ekspedisi4.getNoResi());
        System.out.println("Nama Ekspedisi :" + " " + ekspedisi4.getNamaEkspedisi());
        System.out.println("Ongkos Kirim :" + " " + ekspedisi4.getOngkosKirim());
        System.out.println("Nama Pengirim :" + " " + dropshipper2.getNamaPengirimDopshipper());
        System.out.println("Alamat Pengirim :" + " " + dropshipper2.getAlamatPengirimDropshipper());
        System.out.println("Nama Penerima :" + " " + ekspedisi4.getNamaPenerima());
        System.out.println("Alamat Penerima :" + " " + ekspedisi4.getAlamatPenerima());


    }
}
