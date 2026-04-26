package model;

public class Etudiant {
	 int id;
	 String nom;
	 String prenom;
	 String langue;
	 Filiere filiere; 
	 Enseignant encadrant; 
	 //Attributs:
	 public Etudiant() {
		 this.id=id;
		 this.nom=nom;
		 this.prenom=prenom;
		 this.langue=langue;
		 this.filiere=filiere;
		 this.encadrant=encadrant;
	 }
	//Méthodes :
	 public int getId() {}
	 public String getNom() {}
	 public String getLangue() {}
	 public Enseignant getEncadrant() {}
	 
}
