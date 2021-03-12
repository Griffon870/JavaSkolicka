package cz.vkral.objekty;


/**
 * Náš novej super obdlenik
 * @author vkral
 *
 */
public class Obdelnik {
	
	private int stranaA;
	private int strnaB;			
	
	private boolean ctverec;
	
	
	/**
	 * konstruktor pro obdelniky 
	 * @param stranaA Tohle je strana a
	 * @param strnaB Tohle je strana B
	 */
	public Obdelnik(int stranaA, int strnaB) {
		this.ctverec = false;
		this.stranaA = stranaA;
		this.strnaB = strnaB;
	}		
	
	public Obdelnik(int stranaA) {
		this.ctverec = true;
		this.stranaA = stranaA;
		this.strnaB = stranaA;
	}		
	
 /**
  * vrati hodnotu strany A
  * @return
  */
	public int getStranaA() {
		return stranaA;
	}	
	
	/**
	 * nastavi stranu A
	 * @param stranaA
	 */
	public void setStranaA(int stranaA) {
		this.stranaA = stranaA;
	}
	
	public int getStrnaB() {
		return strnaB;
	}
	
	public void setStrnaB(int strnaB) {
		this.strnaB = strnaB;
	}	
	
	
	/**
	 * vypocita obsah obdelniku
	 * @return
	 */
	public int getObsah() {
		
		privatniMetoda();
		return this.stranaA*this.strnaB;
		
	}
	
	public void privatniMetoda() {
		
	}
	
	
	
	
	public boolean isCtverec() {
		
		return ctverec;
		
	}
	
	
	
	
}
