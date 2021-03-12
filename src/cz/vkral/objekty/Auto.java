package cz.vkral.objekty;

import cz.vkral.rozh.IPohyblive;

public class Auto {

	private int pocetKol;
	private String znacka;
	
	
	
	public Auto(int pocetKol, String znacka) {
		super();
		this.pocetKol = pocetKol;
		this.znacka = znacka;
	}
	
	
	
	
	
	public int getPocetKol() {
		return pocetKol;
	}
	public void setPocetKol(int pocetKol) {
		this.pocetKol = pocetKol;
	}
	public String getZnacka() {
		return znacka;
	}
	public void setZnacka(String znacka) {
		this.znacka = znacka;
	}



	
	
	
	
}
