package com.company;

public class Market {
    private  String noTransaksi, noResi, namaEkspedisi, namaPengirim, alamatPengirim, namaPenerima, alamatPenerima;
    private  double ongkosKirim;


    public Market (String noTransaksi,String noResi,String namaEkspedisi, Double ongkosKirim, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
    }
    public String getNoTransaksi(){
        return  noTransaksi;
    }
    public String getNoResi(){
        return  noResi;
    }
    public String getNamaEkspedisi(){
        return  namaEkspedisi;
    }
    public double getOngkosKirim(){
        return  ongkosKirim;
    }
    public String getNamaPengirim(){
        return  namaPengirim;
    }
    public String getAlamatPengirim(){
        return  alamatPengirim;
    }
    public String getNamaPenerima(){
        return  namaPenerima;
    }
    public String getAlamatPenerima(){
        return  alamatPenerima;
    }



}
