package org.example.patikahw1_2_Consumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	File txtpath = new File("D:\\score.txt");
    	
    	BufferedReader reader;

    	while(true) {
    	
		try {
			reader = new BufferedReader(new FileReader(txtpath));
			
			String macsonuc = reader.readLine();
			while (macsonuc != null) {
				System.out.println("CONSUMER: "+ macsonuc);
				macsonuc = reader.readLine();
			}
			reader.close();
	    	
			//File' ın içini boşaltmak için
	    	new FileWriter(txtpath,false).close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	}
    }
}
