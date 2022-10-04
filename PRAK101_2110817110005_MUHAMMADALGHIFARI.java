/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package PRAK1;
import java.util.Scanner;
/**
 *
 * @author Muhammad Alghifari
 */
public class PRAK101_2110817110005_MUHAMMADALGHIFARI {

    public static void main(String[] args) {
        String nama, tempat;
        int tanggal, bulan, tahun, TB;
        float BB;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        nama = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        tempat = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggal = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        bulan = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir: ");
        tahun = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        TB = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        BB = keyboard.nextFloat();
        
        System.out.println("Data Telah Ditambahkan, ");
        System.out.println("Nama Lengkap"+" "+ nama +"," + "Lahir di"+" " + tempat + " Pada Tanggal "+ tanggal +" " + bulan+ " " + tahun);
        System.out.println("Tinggi Badan"+" "+ TB +" cm" + " dan Berat Badan " + BB+ " Kilogram");
    }
}
