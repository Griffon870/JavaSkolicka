package cz.vkral.skolicka;

import cz.vkral.objekty.Letadlo;
import cz.vkral.objekty.Obdelnik;
import cz.vkral.objekty.Vetron;
import cz.vkral.rozh.IPohyblive;
import cz.vkral.utils.Konstanty;
import cz.vkral.utils.Nastroje;

/**
 * Hlavni program
 * 
 * @author vkral
 *
 */
public class Main {


	public static void main(String[] args) {		
		
	
	
		Vetron blanicek = new Vetron(16, 500, "OK-4716", 25, false);
		
		System.out.println(blanicek.getMajitel());
		
		
		int cena = Konstanty.MAX_CENA;
		
		
		String hezkaCena = Nastroje.addCzk(cena);
		
		
		System.out.println("cena: "+hezkaCena);
		
		
		IPohyblive letdylko;
		
		letdylko = new Vetron(15, 500, "", 87, false);

		
		
	}
	
	
	
	

}
