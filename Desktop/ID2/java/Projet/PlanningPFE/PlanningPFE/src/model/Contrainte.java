package model;

public class Contrainte {
	//Attributs:
	int id;
	Enseignant enseignant;
	LocalDate jour;
	LocalDate heureDebut;
	LocalDate heureFin;
	
	public Contrainte() {
		this.id=id;
		this.jour=jour;
		this.enseignant=enseignant;
		this.heureDebut=heureDebut;
   	}
	//Méthodes :
	public Enseignant getEnseignant(){}
	public LocalDate getJour(){}
	public boolean estDisponible{}
}
