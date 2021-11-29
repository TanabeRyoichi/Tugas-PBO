package com.company;

public class Customer extends Member {

    private double saldo = 0;

    public Customer(String nik, String nama, String noTelp, double saldo) {
        super(nik, nama, noTelp);
        this.saldo= saldo;
    }
    public  double getSaldo(){
        return saldo;
    }

    @Override
    public void displayInfo() {
        System.out.println("nik : " + this.nik);
        System.out.println("nama : " + this.nama);
        System.out.println("no Telpon : " + this.noTelp);
        System.out.println("Saldo : " + this.saldo);

    }
}


