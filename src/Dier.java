
public abstract class Dier {
	protected String naam;
	protected int snelheid;
	protected int leeftijd;
	protected int gewicht;
	protected int hoogte;
	protected boolean lefend;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getSnelheid() {
		return snelheid;
	}
	public void setSnelheid(int snelheid) {
		this.snelheid = snelheid;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public int getHoogte() {
		return hoogte;
	}
	public void setHoogte(int hoogte) {
		this.hoogte = hoogte;
	}
	public boolean isLefend() {
		return lefend;
	}
	public void setLefend(boolean lefend) {
		this.lefend = lefend;
	}
	public abstract void maakGeluid();
	public abstract void Eten();
	public abstract void Slapen();
	
	
}
