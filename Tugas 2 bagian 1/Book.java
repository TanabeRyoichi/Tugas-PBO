package com.company;

public class Book {
    private  String isbn;
    private String judul;
    private String pengarang;
    private String tater;
    private  double harga;
    private float rating;

    public  Book(String isbn, String judul,String pengarang,String tater,double harga,float rating){
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tater = tater;
        this.harga = harga;
        this.rating = rating;
    }
    public String getIsbn(){
        return  isbn;
    }
    public String getJudul(){
        return  judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public double getHarga(){
        return  harga;
    }
    public void setHarga(double harga){
        this.harga= harga;
    }
    public String getPengarang(){
        return  pengarang;
    }
    public void setPengarang(String pengarang){
        this.pengarang= pengarang;
    }
    public String getTater(){
        return  tater;
    }
    public void setTater(String tater){
        this.tater= tater;
    }
    public float getRating(){
        return  rating;
    }
    public void setRating(float rating){
        this.rating= rating;
    }




}
