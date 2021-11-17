package com.company;

public class Karyawan {
    protected String nama;
    protected double gaDas;

    public  Karyawan (String nama, double gaDas){
        this.nama = nama;
        this.gaDas = gaDas;
    }
 public void displayInfo(){

        System.out.println(this.nama);
        System.out.println(this.gaDas);

 }
}
