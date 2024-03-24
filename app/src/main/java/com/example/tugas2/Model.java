package com.example.tugas2;

public class Model {
    private String namaM;
    private int ppM;
    private String nimM;

    public Model(String namaM, int ppM, String nimM) {
        this.namaM = namaM;
        this.ppM = ppM;
        this.nimM = nimM;
    }

    public String getNamaM() {
        return namaM;
    }

    public void setNamaM(String namaM) {
        this.namaM = namaM;
    }

    public int getPpM() {
        return ppM;
    }

    public void setPpM(int ppM) {
        this.ppM = ppM;
    }

    public String getNimM() {return nimM;}
}