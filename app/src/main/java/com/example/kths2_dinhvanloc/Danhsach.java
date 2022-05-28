package com.example.kths2_dinhvanloc;

import java.util.ArrayList;

public class Danhsach {
    int coquocgia;
    String tenquocgia;
    String danso;

    public Danhsach(int coquocgia, String tenquocgia, String danso) {
        this.coquocgia = coquocgia;
        this.tenquocgia = tenquocgia;
        this.danso = danso;
    }

    public int getCoquocgia() {
        return coquocgia;
    }

    public void setCoquocgia(int coquocgia) {
        this.coquocgia = coquocgia;
    }

    public String getTenquocgia() {
        return tenquocgia;
    }

    public void setTenquocgia(String tenquocgia) {
        this.tenquocgia = tenquocgia;
    }

    public String getDanso() {
        return danso;
    }

    public void setDanso(String danso) {
        this.danso = danso;
    }

    public static ArrayList<Danhsach> dulieu() {
        ArrayList<Danhsach> x = new ArrayList<>();
        int quocgia[] = {R.drawable.vn, R.drawable.usa, R.drawable.jp, R.drawable.rus, R.drawable.bra};
        String ten[] = {"VietNam", "American", "Japan", "Russia", "Brazil"};
        String danso[] = {"9800000", "3200000", "56000000", "78000000", "40000000",};

        for (int i = 0; i < ten.length; i++)

            x.add(new Danhsach(quocgia[i], ten[i], "Population: " + danso[i]));
        return x;
    }
}
