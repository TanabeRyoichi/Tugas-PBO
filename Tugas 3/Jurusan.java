package com.company;
import java.util.ArrayList;

public class Jurusan {
        private String kode;
        private String nama;
        private ArrayList<Mahasiswa>Mhs;

        public Jurusan(String kode, String nama) {
            this.kode = kode;
            this.nama = nama;
            Mhs = new ArrayList<>();
        }

        public void addMhs(Mahasiswa m) {
            this.Mhs.add(m) ;
        }

        public String getKode() {
            return kode;
        }

        public String getNama() {
        return nama;
    }

        public ArrayList<Mahasiswa> getMhs() {
            return Mhs;
        }
    }

