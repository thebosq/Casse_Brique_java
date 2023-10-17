public class Personne {

    private String prenom;
    private String nom;
    private int age;
    private boolean majeur;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom.toUpperCase();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.majeur = age >= 18;
    }

    public boolean isMajeur() {
        return majeur;
    }
}
