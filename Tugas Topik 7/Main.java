package com.company;

public class Main {

    public static void main(String[] args) {

	Kontrak k2 = new Kontrak("sui",10,100);

	Tetap k3 = new Tetap("sei",150,109);

        System.out.println("Semua Karyawan");
        k2.displayInfo();
        k3.displayInfo();
        System.out.println();
	    System.out.println("Karyawan Tetap");
        k3.displayInfo();
        System.out.println();
        System.out.println("Karyawan Kontrak");
        k2.displayInfo();




    }
}
