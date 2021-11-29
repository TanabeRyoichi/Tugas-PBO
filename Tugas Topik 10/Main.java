package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Customer> cus = new ArrayList<>();
    private static ArrayList<Driver> dri = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("1 input data customer");
            System.out.println("2 input data driver");
            System.out.println("3 tampilkan data customer ");
            System.out.println("4 tampilkan data driver");
            System.out.println("5 topup");
            System.out.println("6 bayar");

            System.out.print("masukkan pilihan");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    inputDataCustomer();
                    break;
                case 2:
                    inputDataDriver();
                    break;
                case 3:
                    tampilkanDataCustomer();
                    break;
                case 4:
                    tampilkanDataDriver();
                    break;
                case 5:
                    topupSaldo();
                    break;
                case 6:
                   Bayar();
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while (pilihan != 7);
    }
    private static void tampilkanDataCustomer() {
        System.out.println("\nMenampilkan data customer");
        for (Customer c : cus) {
            c.displayInfo();
        }
    }


    private static void tampilkanDataDriver() {
        System.out.println("\nMenampilkan data customer");
        for (Driver d : dri) {
            d.displayInfo();
        }
    }

    private static void inputDataCustomer() {
        System.out.println("\nMember baru customer");
        System.out.print("nik : ");
        String nik = s.next();
        System.out.print("nama : ");
        String nama = s.next();
        System.out.print("no Telpon : ");
        String noTelp = s.next();
        System.out.print("saldo : ");
        double saldo = s.nextDouble();

        Customer c = new Customer(nik, nama, noTelp, saldo);
        cus.add(c);
        System.out.println("Data Customer tersimpan");
        System.out.println();
    }

    private static void inputDataDriver() {
        System.out.println("\nMember baru driver");
        System.out.print("nik : ");
        String nik = s.next();
        System.out.print("nama : ");
        String nama = s.next();
        System.out.print("no Telpon : ");
        String noTelp = s.next();
        System.out.print("saldo : ");
        double saldo = s.nextDouble();
        System.out.print("Jenis Kendraan : ");
        String jenisKendaraan = s.next();
        System.out.print("no plat : ");
        String noPlat = s.next();


        Driver d = new Driver(nik, nama, noTelp, saldo, jenisKendaraan, noPlat);
        dri.add(d);
        System.out.println("Data Driver Tersimpan");
        System.out.println();
    }

    private static void topupSaldo() {
        double topup = 0;
        double p;
        System.out.println("Masukkan Saldo");
        topup = s.nextDouble();
        for (Customer c : cus) {
            p = c.getSaldo() + topup;
            System.out.println("Total Saldo Customer = " + p);

        }
        for (Driver d : dri) {
            p = d.getSaldo() - topup;
            System.out.println("Total Saldo Driver= " + p);
        }

    }
    private static void Bayar() {
        double topup = 0;
        double p;
        System.out.println("Masukkan Biaya");
        topup = s.nextDouble();
        for (Driver d : dri) {
            p = d.getSaldo() + topup;
            System.out.println("Total Saldo Driver = " + p);
        }
        for (Customer c : cus) {
            p = c.getSaldo() - topup;
            System.out.println("Total Saldo Customer = " + p);

        }
    }
}