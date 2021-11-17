package com.company;

public class Tetap extends Karyawan  {
    private  double tuDas;


    public Tetap(String nama,double tuDas,double gaDas){
        super(nama,gaDas);
        this.tuDas = tuDas;
    }
    @Override
    public void displayInfo(){
        System.out.println(this.nama);
        System.out.println(this.tuDas);
        System.out.println(this.gaDas);

    }
}
