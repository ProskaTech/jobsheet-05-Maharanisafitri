/*
 created by 21343008_Maharani Safitri
 */
package jobsheet5;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan nama lengkap : ");
        String nama = in.nextLine();
        
        System.out.print("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.print("Masukan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama : " + nama );
        System.out.println("\nNIM : " + NIM );
        System.out.println("\nNilai : " + nilai );
                 
    }
}
