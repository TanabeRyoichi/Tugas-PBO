package com.company;

public class Buku {
    private String judul;
    private String pengarang;
    private  double harga;

    public  Buku(String judul,String pengarang,double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public String getJudul(){
        return  judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public double getHarga(){
        return  harga;
    }
    public void setHarga(double harga){
        this.harga= harga;
    }
    public String getPengarang(){
        return  pengarang;
    }
    public void setPengarang(double harga){
        this.pengarang= pengarang;
    }

}

