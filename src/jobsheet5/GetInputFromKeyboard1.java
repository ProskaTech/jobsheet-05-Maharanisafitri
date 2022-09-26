/*
 created by 21343008_Maharani Safitri
 */
package jobsheet5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = ""; 
        String hoby = "";
        
        try {
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda : ");
            hoby = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
        System.out.println("Jadi Hobi Anda " +hoby);
        System.out.println("Hobi yang bagus" +name);
    }
    
}

