package com.company;

public class Driver extends Member{
    private double saldo = 0;
    private String jenisKendaraan;
    private String noPlat;



    public Driver(String nik, String nama, String noTelp, double saldo, String jenisKendaraan, String noPlat) {
        super(nik,nama,noTelp);
        this.saldo = saldo;
        this.jenisKendaraan = jenisKendaraan;
        this.noPlat = noPlat;
    }
    public  double getSaldo(){
        return saldo;
    }


    @Override
    public void displayInfo() {
        System.out.println("nik : " + this.nik);
        System.out.println("nama : " + this.nama);
        System.out.println("no telpon : " + this.noTelp);
        System.out.println("Saldo : " + this.saldo);
        System.out.println("Jenis Kendaraan : " + this.jenisKendaraan);
        System.out.println("no plat : " + this.noPlat);

    }

}


