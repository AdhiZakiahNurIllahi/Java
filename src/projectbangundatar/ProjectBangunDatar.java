/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author WINDOWS
 */
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat obyek persegi panjang A
        PersegiPanjang A = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari A
        A.panjang = 10;
        A.lebar = 7;
        
        // menghitung luas dan keliling dari A
        System.out.println("Persegi Panjang A");
        A.hitungLuas();
        A.hitungKeliling();
        
        // membuat obyek persegi panjang B
        System.out.println("Persegi Panjang B");
        PersegiPanjang B = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        B.panjang = 14;
        B.lebar = 9;
        
        // menghitung luas dan keliling dari B
        B.hitungLuas();
        B.hitungKeliling();
        
        //Persegi panjang C 
        System.out.println("Persegi Panjang C");
        PersegiPanjang C = new PersegiPanjang ();
        
        C.panjang = 17;
        C.lebar = 8;
        
        C.hitungLuas();
        C.hitungKeliling();
        
        //Persegi panjang D
        System.out.println("Persegi Panjang D");
        PersegiPanjang D = new PersegiPanjang();
        
        D.lebar = 26;
        D.panjang = 14;
        
        D.hitungLuas();
        D.hitungKeliling();
        
        //Lingkaran L1
        System.out.println("Lingkaran L1");
        Lingkaran L1 = new Lingkaran ();
        
        L1.jejari = 6;
        
        L1.hitungLuas();
        L1.hitungKeliling();
        
        //Lingkaran L2
        System.out.println("Lingkaran L2");
        Lingkaran L2 = new Lingkaran();
        
        L2.jejari = 12;
                
        L2.hitungLuas();
        L2.hitungKeliling();
        
        
        
    }
    
}
