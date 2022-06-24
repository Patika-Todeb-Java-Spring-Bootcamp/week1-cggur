package org.example.patikahw1_2_Producer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )throws FileNotFoundException
    {
    	File txtpath = new File("D:\\score.txt");
    	
        String macSonuc;
        Scanner scan = new Scanner(System.in); 
       
        PrintWriter producer = new PrintWriter(txtpath);
        
        do{
        
        System.out.println("MAÇ SKORUNU GİRİNİZ (BİTİRMEK İÇİN BOŞ ENTERLAYINIZ):"); 
        macSonuc= scan.nextLine();
        	
        producer.println(macSonuc);
        
        
        }while(!macSonuc.isEmpty());
        
        producer.flush();

        producer.close();
        

    }
}
