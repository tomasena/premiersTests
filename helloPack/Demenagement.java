package helloPack;

public class Demenagement {
	private String nom;				// attributs
	private int capCamion;
	public  Demenagement(String nom,int capCamion) {		// constructeur
		this.nom = nom;
		this.capCamion = capCamion;
		}
	public void auTravail(int nbCartons){
		System.out.println(nom + 
				" posede un camion de capacit� : " + capCamion);
		System.out.println("Debut du d�m�nagement");
		System.out.println("noVoyage nbCartons emport capCamion");
		int noVoyage=1;
		do {
			int emport;
			if (nbCartons <= capCamion)
				emport = nbCartons;
			else
				emport = capCamion;
			System.out.println(noVoyage + "\t " + nbCartons+"\t   "+
					emport + "\t   " + capCamion);
			nbCartons -= emport;
			noVoyage++;
		} while (nbCartons > 0);
		System.out.println("Fin du d�m�nagement");
	}
}
