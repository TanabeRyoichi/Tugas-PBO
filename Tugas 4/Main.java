package com.company;

public class Main {

    public static void main(String[] args) {

        //objek 1
        Buku bk1 = new Buku("Harry Potter","J.K. Rowling", 300000);
        //objek 2
        Buku bk2 = new Buku("UML","Ivar Jacobson", 400000);

        //Menampilkan objek 1
        System.out.println(bk1.getJudul() + " " + bk1.getPengarang() + " " + bk1.getHarga());

        //Menampilkan objek 2
        System.out.println(bk2.getJudul() + " " + bk2.getPengarang() + " " + bk2.getHarga());
    }
}
