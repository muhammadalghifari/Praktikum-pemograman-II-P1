/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

/**
 *
 * @author User
 */
public class Komik extends Buku{
    private int volume;
    private String sinopsis;

    public Komik(String j, String p, String t, int v, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.volume = v;
        this.sinopsis = s;
    }

    public String getKomikDetail() {
        return "Data yang baru di inputkan adalah\nSebuah Komik dengan judul \"" + judul
                + "\".\nKomik  tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun
                + ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah."
                + "\nSinopsis : " + sinopsis.substring(0, 64) + "...";
    }
}
