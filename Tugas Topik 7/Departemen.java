package com.company;
import java.util.*;


public class Departemen {
    private String nama;
    private Karyawan[] kar = new Karyawan[5];

    public Departemen(String nama) {
        this.nama = nama;
    }
    public  void addKaryawan (Karyawan k){








    }
    public  void displayAll(){
        for (Karyawan De:kar){
            De.displayInfo();
            System.out.println();
        }

    }
    public void  displayKontrak(){
        for (Karyawan De:kar){
            De.displayInfo();
        }


    }
    public void displayTetap(){
        for (Karyawan De:kar){
            De.displayInfo();
            System.out.println();
        }



    }
}
