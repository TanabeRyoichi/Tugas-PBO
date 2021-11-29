package com.company;

public class Member {
    protected String nik;
    protected String nama;
    protected String noTelp;

    public Member(String nik, String nama, String noTelp) {
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
    }


    public void displayInfo() {

        System.out.println(this.nik);
        System.out.println(this.nama);
        System.out.println(this.noTelp);

        }
    }


