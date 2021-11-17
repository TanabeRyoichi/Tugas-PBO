package com.company;

public class Kontrak extends Karyawan  {
    private  int waktu;


    public Kontrak (String nama,int waktu,double gaDas){
         super(nama,gaDas);
         this.waktu = waktu;
    }
    @Override
    public void displayInfo(){
        System.out.println(this.nama);
        System.out.println(this.waktu);
        System.out.println(this.gaDas);
    }

}
