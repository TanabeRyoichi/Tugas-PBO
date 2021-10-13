package com.company;

public class Main {

    public static void main(String[] args) {
	Jurusan d3IF = new Jurusan("D3IF","Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
	Jurusan d3SI = new Jurusan("D3SI","Diploma 3 Sistem Informasi");


        Mahasiswa mhs1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa mhs2 = new Mahasiswa("6702", "Chacha");
        Mahasiswa mhs3 = new Mahasiswa("6703", "Agus");
        Mahasiswa mhs4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa mhs5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mhs6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mhs7 = new Mahasiswa("6304", "Rahmat");

        d3IF.addMhs(mhs1);
        d3IF.addMhs(mhs2);
        d3IF.addMhs(mhs3);

        d3SI.addMhs(mhs4);
        d3SI.addMhs(mhs5);
        d3SI.addMhs(mhs6);
        d3SI.addMhs(mhs7);

        System.out.println("Kode: " + d3IF.getKode());
        System.out.println("Nama: " + d3IF.getNama());
        System.out.println("Daftar mahasiswa");
        int i = 1;
        for (Mahasiswa m : d3IF.getMhs()){
            System.out.println(i++ + "." + " " + m.getNim() + " - " +m.getNama());
                }
        System.out.println();

        int j = 1;
        System.out.println("Kode: " + d3SI.getKode());
        System.out.println("Nama: " + d3SI.getNama());
        System.out.println("Daftar mahasiswa");
        for (Mahasiswa m : d3SI.getMhs()){
            System.out.println(j++ +"." + " " + m.getNim() + " - " +m.getNama());
        }









    }
}
