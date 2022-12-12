import java.util.Scanner;

public class Applicatie {

	public static void main(String[] args) {
		Hond hond = new Hond();
		Kat kat = new Kat();
		Vogel vogel = new Vogel();

		hond.setNaam("Ruffels");
		hond.setLeeftijd(12);
		hond.setSnelheid(10);
		hond.setGewicht(2000);
		hond.setHoogte(100);
		hond.setLefend(true);

		hond.maakGeluid();
		hond.Eten();
		hond.Slapen();

		System.out.println("Naam van de hond is " + hond.getNaam());
		System.out.println("Leeftijd van de hond is " + hond.getLeeftijd());
		System.out.println("Snelheid van de hond is " + hond.getSnelheid());
		System.out.println("Gewicht van de hond is " + hond.getGewicht());
		System.out.println("Hoogte van de hond is " + hond.getHoogte());
		System.out.println("Is de hond lefend? " + hond.isLefend());
		System.out.println("\n");

		kat.setNaam("Poes");
		kat.setLeeftijd(12);
		kat.setSnelheid(10);
		kat.setGewicht(10);
		kat.setHoogte(10);

		kat.maakGeluid();
		kat.Eten();
		kat.Slapen();

		System.out.println("Naam van de kat is " + kat.getNaam());
		System.out.println("Leeftijd van de kat is " + kat.getLeeftijd());
		System.out.println("Snelheid van de kat is " + kat.getSnelheid());
		System.out.println("Gewicht van de kat is " + kat.getGewicht());
		System.out.println("Hoogte van de kat is " + kat.getHoogte());
		System.out.println("Is de kat lefend? " + kat.isLefend());
		System.out.println("\n");

		vogel.setNaam("Jaap");
		vogel.setLeeftijd(12);
		vogel.setSnelheid(10);
		vogel.setGewicht(10);
		vogel.setHoogte(10);

		vogel.maakGeluid();
		vogel.Eten();
		vogel.Slapen();

		System.out.println("Naam van de vogel is " + vogel.getNaam());
		System.out.println("Leeftijd van de vogel is " + vogel.getLeeftijd());
		System.out.println("Snelheid van de vogel is " + vogel.getSnelheid());
		System.out.println("Gewicht van de vogel is " + vogel.getGewicht());
		System.out.println("Hoogte van de vogel is " + vogel.getHoogte());
		System.out.println("Is de vogel lefend? " + vogel.isLefend());
		System.out.println("\n");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Wat voor dier is het?");
		String Antwoord = scanner.nextLine();
		Dier dier;

		if (Antwoord.equals("hond")) {
			Hond hond2 = new Hond();
			System.out.println("Je hebt " + hond2 + " ingevuld");
			dier = hond2;
		} else if (Antwoord.equals("kat")) {
			Kat kat2 = new Kat();
			dier = kat2;
		} else  {
			Vogel vogel2 = new Vogel();
			dier = vogel2;
		}
		
		dier.maakGeluid();
	}
}
