/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author WINDOWS
 */
public class Lingkaran {
    int jejari;
    
    void hitungLuas(){
        double luas = 3.14 * (this.jejari * this.jejari);
        System.out.println("Luas Lingkaran: " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 2 * 3.14 * this.jejari;
        System.out.println("Keliling Lingkaran: " + keliling);
        System.out.println("");
    }
}
