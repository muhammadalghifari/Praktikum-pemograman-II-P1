/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK1;
import java.util.Scanner;
/**
 *
 * @author Muhammad Alghifari
 */
public class PRAK102_2110817110005_MUHAMMADALGHIFARI {
   public static void main (String [] args){
    Scanner userInput = new Scanner(System.in); 
    int user= userInput.nextInt(); 
    int angka = 1;
       
        while (angka <= 7){            
            if (user % 2 == 0){  
                int a;
                a =(user / 2)-1;
                System.out.print(" "+a+" ");               
            }
            else {
                System.out.print(user);
            }
        user++;
        angka++;
        }
    } 
}
