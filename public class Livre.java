public class Livre {
 
    private String auteur;
    private int id;
    private String titre;
    private double prix;

    public Livre(String auteur, int id, String titre, double prix) {
        this.auteur = auteur;
        this.id = id;
        this.titre = titre;
        this.prix = prix;
    }
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    public String toString() {
        return "Auteur: " + auteur + " / ID: " + id + " / Titre: " + titre + " / Prix: " + prix;
    }

    public static void main(String[] args) {
 
        Livre livre = new Livre("Author Name", 1, "Book Title", 29.99);


        System.out.println(livre.toString());

     
        livre.setAuteur("New Author Name");

     
        System.out.println(livre.toString());
    }
}