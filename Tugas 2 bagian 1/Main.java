package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static  ArrayList<Book> books = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("1 input");
            System.out.println("2 cari dan ubah");
            System.out.println("3 tampilkan data ");
            System.out.println("4 hapus");
            System.out.println("5 kembali");

            System.out.print("masukkan pilihan");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    cariData();
                    break;
                case 3:
                    tampilkanData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.out.println("kembali menu");
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while (pilihan != 5);
    }

    private static void cariData() {
        System.out.println("pencarian data");
        System.out.print("Masukkan isbn: ");
        String isbn = s.next();
        Book b = cariBookByIsbn(isbn);
        if (b != null) {
            System.out.println("data : " + b.getIsbn() + "-" + b.getJudul()+ "-" + b.getPengarang()+ "-" + b.getTater()+ "-" + b.getHarga() + "-" + b.getRating());
            System.out.print("ubah dta?  (y/n): ");
            String jawaban = s.next();
            if (jawaban.equalsIgnoreCase("y")) {
                ubahData(b);
            } else {
                System.out.println("Kembali ke Menu");
            }
        }
    }

    //
    private static void hapusData() {
        System.out.println("pencarian data");
        System.out.print("Masukkan isbn: ");
        String isbn = s.next();
        Book b = cariBookByIsbn(isbn);
        books.remove(b);
    }




    private static  void ubahData(Book b) {
        System.out.print("Masukkan data buku baru: ");
        String judulBaru = s.next();
        b.setJudul(judulBaru);
        String pengarangBaru = s.next();
        b.setPengarang(pengarangBaru);
        String taterBaru = s.next();
        b.setTater(taterBaru);
        double hargaBaru = s.nextDouble();
        b.setHarga(hargaBaru);
        float ratingBaru = s.nextFloat();
        b.setRating(ratingBaru);
        System.out.println("data diubah \n");
    }

    private static  Book cariBookByIsbn(String isbn) {
        Book bFound = null;
        for (Book b : books) {
            if (isbn.equals(b.getIsbn())) {
                bFound = b;
            }
        }
        return bFound;
    }

    private static  void tampilkanData() {
        System.out.println("\nMenampilkan data");
        for (Book b : books) {
            System.out.println("- " + b.getIsbn() + " " + b.getJudul() + " " + b.getPengarang() + " " + b.getTater() + " " + b.getHarga() + " " + b.getRating());
        }
        System.out.println("");
    }

    private static  void tampilkanData(Book b) {
        System.out.println("data buku");
        System.out.println("judul : " + b.getJudul());
        System.out.println("pengarang : " + b.getPengarang());
        System.out.println("Tater : " + b.getTater());
        System.out.println("harga : " + b.getHarga());
        System.out.println("rating : " + b.getRating());
        System.out.println("isbn : " + b.getIsbn() + "\n");
    }

    private static  void inputData() {
        System.out.println("\nidentitas baru");
        System.out.print("m isbn");
        String isbn = s.next();
        System.out.print("m judul : ");
        String judul = s.next();
        System.out.print("m pengarang : ");
        String pengarang = s.next();
        System.out.print("m tater : ");
        String tater = s.next();
        System.out.print("m harga : ");
        double harga = s.nextDouble();
        System.out.print("m rating : ");
        Float rating = s.nextFloat();

        if (cariBookByIsbn(isbn) != null) {
            System.out.println("isbn sudah tercatat");
        } else {
            Book b = new Book(isbn, judul, pengarang, tater, harga, rating);
            books.add(b);
            System.out.println("Data tersimpan");
        }
    }

}

