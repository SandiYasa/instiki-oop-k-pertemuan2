/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author ASUS
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Sandi Yasa";
        String nim = "";
        double ipk = 4.0;
        BufferedReader dtain= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Input Nama Mahasiswa: ");
        try{
            nama = dtain.readLine();
            System.out.print("Input NIM Mahasiswa: ");
            nim = dtain.readLine();
            System.out.print("Input IPK Mahasiswa: ");
            ipk = Double.parseDouble(dtain.readLine());
        }catch(IOException e){
            System.out.println("Error Pembacaan data");
        }
               
        //System.out.print(nama);
        //System.out.print(nim);
        
        System.out.printf("Nama Saya %s dengan NIM %s dengan IPK %.2f", nama,nim,ipk);
    }
    
}
