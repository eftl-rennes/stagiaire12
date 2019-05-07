package fr.eftl.agence.voyages.prix;

public class CalculPrixUnitaire {
	private String depart;
	private String arrivee;
	
	public CalculPrixUnitaire(String depart, String arrivee) {
		this.setDepart(depart);
		this.setArrivee(arrivee);
	}
	
	public CalculPrixUnitaire() {
		// TODO Auto-generated constructor stub
	}

	public Integer generer() {
		return null;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getArrivee() {
		return arrivee;
	}

	public void setArrivee(String arrivee) {
		this.arrivee = arrivee;
	}
}
