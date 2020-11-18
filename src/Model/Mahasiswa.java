/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author V for Vladimir
 */
public class Mahasiswa {
    private String NIM;
    private String nama;
    private int angkatan;
    private String kode_jurusan;

    public Mahasiswa() {
    }
    
    

    public Mahasiswa(String NIM, String nama, int angkatan, String kode_jurusan) {
        this.NIM = NIM;
        this.nama = nama;
        this.angkatan = angkatan;
        this.kode_jurusan = kode_jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getKode_jurusan() {
        return kode_jurusan;
    }

    public void setKode_jurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "NIM=" + NIM + ", nama=" + nama + ", angkatan=" + angkatan + ", kode_jurusan=" + kode_jurusan + '}';
    }
    
}
