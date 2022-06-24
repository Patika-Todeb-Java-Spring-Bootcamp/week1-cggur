package org.example.patikahw1_1;

import java.awt.Color;
import java.time.LocalDate;

public final class Car {
	
	
	public enum Model{
		
		AUDI, BMW, MERCEDES, VOLKSWAGEN;
	}
	
	final Model model;
	
	final int yıl;
	
	final int kacKisilik;
	
	final LocalDate uretimTarihi;
	
	final int km;
	
	final Color color; 

	public Car(Model model, int yıl, int kacKisilik, LocalDate uretimTarihi, int km, Color color) {
		this.model = model;
		this.yıl = yıl;
		this.kacKisilik = kacKisilik;
		this.uretimTarihi = uretimTarihi;
		this.km = km;
		this.color = color;
	}

	public Model getModel() {
		return model;
	}

	public int getYıl() {
		return yıl;
	}

	public int getKacKisilik() {
		return kacKisilik;
	}

	public LocalDate getUretimTarihi() {
		return uretimTarihi;
	}

	public int getKm() {
		return km;
	}

	public Color getColor() {
		return color;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", yıl=" + yıl + ", kacKisilik=" + kacKisilik + ", uretimTarihi=" + uretimTarihi
				+ ", km=" + km + ", color=" + color + "]";
	}

	public static void main( String[] args )
    {
		Car ornekcar = new Car(Model.MERCEDES, 2002, 4, LocalDate.of(2001, 5, 19), 140822, Color.BLACK);
		
		System.out.println(ornekcar.toString());
    }
}
