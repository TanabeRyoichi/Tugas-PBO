package com.company;

public class Dropshipper {
    private String namaPengirimDopshipper,alamatPengirimDropshipper;

    public  Dropshipper(String namaPengirimDopshipper,String alamatPengirimDropshipper){
        this.namaPengirimDopshipper = namaPengirimDopshipper;
        this.alamatPengirimDropshipper = alamatPengirimDropshipper;
    }
    public String getNamaPengirimDopshipper () {return namaPengirimDopshipper;}
    public String getAlamatPengirimDropshipper () {return alamatPengirimDropshipper;}

}
