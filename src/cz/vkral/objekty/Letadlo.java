package cz.vkral.objekty;


/**
 * Trida letadlo
 * @author vkral
 *
 */
public class Letadlo {

	/**
	 * Rozpeti kridel letadla
	 */
	private int rozpetiKridel;
	private int hmotnost;
	private String registrace;
	
	
			
	
	public Letadlo(int rozpetiKridel, int hmotnost, String registrace) {
		super();
		this.rozpetiKridel = rozpetiKridel;
		this.hmotnost = hmotnost;
		this.registrace = registrace;
	}
	
	
	
	public int getRozpetiKridel() {
		return rozpetiKridel;
	}
	public void setRozpetiKridel(int rozpetiKridel) {
		this.rozpetiKridel = rozpetiKridel;
	}
	public int getHmotnost() {
		return hmotnost;
	}
	public void setHmotnost(int hmotnost) {
		this.hmotnost = hmotnost;
	}
	public String getRegistrace() {
		return registrace;
	}
	public void setRegistrace(String registrace) {
		this.registrace = registrace;
	}
	
	
	public String getMajitel() {
		
		if(this.registrace.equals("OK-4716")) {
			return "AKMB";		
			
		}
		return "Nevim";
	}
	
	
	
	
	
}
