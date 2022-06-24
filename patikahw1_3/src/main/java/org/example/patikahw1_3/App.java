package org.example.patikahw1_3;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main( String[] args )
    		throws InterruptedException
    {

        final MacSkorlari macThreads = new MacSkorlari();
 
        // Create producer thread
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                	macThreads.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Create consumer thread
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                	macThreads.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Start both threads
        producer.start();
        consumer.start();
 
        // producer finishes before consumer
        producer.join();
        consumer.join();
    }
	
	
	public static class MacSkorlari {
		
		
	LinkedList<String> macSonucuList = new LinkedList<>();
	
	public void produce() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {   
            	
            	while (macSonucuList.size()==1)
                    wait();
            	
                Scanner scan = new Scanner(System.in); 
                System.out.println("MAÇ SKORUNU GİRİNİZ:"); 
                macSonucuList.add(scan.nextLine());
            
            
                System.out.println("Producer threadinin ürettiği maç skoru: " + macSonucuList.getFirst());

                // consumer' un artık başlayabileceğini bildiriyor
                notify();

                // programın daha iyi anlaşılması için bekleme adımı koyuldu
                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {

            	while (macSonucuList.size()==0)
                    wait();
            	

                System.out.println("Consumer threadinin tükettiği maç skoru: " + macSonucuList.removeFirst());

                
                // Producer' un artık başlayabileceğini bildiriyor
                notify();

                // programın daha iyi anlaşılması için bekleme adımı koyuldu
                Thread.sleep(1000);
            }
        }
    }
	
	}
}
