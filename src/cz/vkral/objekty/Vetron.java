package cz.vkral.objekty;

import cz.vkral.rozh.IPohyblive;
import cz.vkral.utils.Konstanty;

public class Vetron extends Letadlo implements IPohyblive{
	
	private int klouzak;
	private boolean voda;
	
	
	
	
	
	public Vetron(int rozpetiKridel, int hmotnost, String registrace, int klouzak, boolean voda) {
		
		super(rozpetiKridel, hmotnost, registrace);
		this.klouzak = klouzak;
		this.voda = voda;
	}
	
	
	
	public static String getInfo() {
		return "Vetron ma registraci cislo";
	}
	
	
	public int getKlouzak() {
		return klouzak;
	}
	public void setKlouzak(int klouzak) {
		this.klouzak = klouzak;
	}
	public boolean isVoda() {
		return voda;
	}
	public void setVoda(boolean voda) {
		this.voda = voda;
	}



	@Override
	public int getMaxRychlost() {
		
		
		return Konstanty.MAX_RYCHLOST;
	}



	@Override
	public int getZrychleni() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getCena() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
