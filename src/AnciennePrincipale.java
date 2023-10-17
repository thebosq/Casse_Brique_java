import java.util.ArrayList;
import java.util.HashMap;

public class AnciennePrincipale {
    public static void main(String[] args) {

        String maPhrase = "world !"; // Double cote pour chaine de caractère
        char noteModuleJava = 'A'; // Simple cote pour caractère

        byte octet = 127; // 1 octet
        short petitNombre = 32767; // 2 octet
        int monNombre = 32; // 4 octet
        long monGrandNombre = 4299999999L; // 8 octet

        float monPetitDecimal = 8.9F; // 4 octet
        double monGrandDecimal = 3.1415925855962; // 8 octet

        int resultat = octet + petitNombre / monNombre;
        float resultatDecimal = monNombre / monPetitDecimal;

        System.out.println("Résultat : " + resultat);
        System.out.println("Résultat décimal : " + resultatDecimal);
        System.out.println(monNombre + 10);
        System.out.println("Hello " + maPhrase);



        Personne theo = new Personne();
        theo.setNom("Hoffmann");
        theo.setPrenom("Théo");
        theo.setAge(18);

        Personne mailise = new Personne();
        mailise.setNom("Lizbell");
        mailise.setPrenom("Mailise");
        mailise.setAge(18);

        Personne pablito = new Personne();
        pablito.setNom("ElDaron");
        pablito.setPrenom("Pablo");
        pablito.setAge(18);

        Personne oktoblin = new Personne();
        oktoblin.setNom("ElChanteur");
        oktoblin.setPrenom("Oktoblin");
        oktoblin.setAge(15);

        Personne bennixxu = new Personne();
        bennixxu.setNom("ElPetit");
        bennixxu.setPrenom("Bennixxu");
        bennixxu.setAge(16);

        Personne avril = new Personne();
        avril.setNom("ElSoleil");
        avril.setPrenom("Laure");
        avril.setAge(27);

        Personne antoine = new Personne();
        antoine.setNom("Feisthauer");
        antoine.setPrenom("Antoine");
        antoine.setAge(19);

        Personne le_sucre = new Personne();
        le_sucre.setNom("ElFondant");
        le_sucre.setPrenom("le_sucre");
        le_sucre.setAge(20);

        byte[] listeNombre = {42,69,100};

        Personne[] listePersonne = {theo,mailise,pablito,oktoblin,bennixxu,avril,antoine,le_sucre};

        System.out.println("\nListe des nom des personnes:");
        int index = 0;
        while (index < listePersonne.length) {
            System.out.println(listePersonne[index].getNom());
            index++;
        }

        System.out.println("\nListe des prénom des personnes:");
        for (int i = 0; i < listePersonne.length; i++) {
            System.out.println(listePersonne[i].getPrenom());
        }

        System.out.println("\nListe des ages des personnes: ");
        for (Personne personneActuel : listePersonne) {
            System.out.println(personneActuel.getAge());
        }

        ArrayList<Personne> listeTwitch = new ArrayList<>();
        listeTwitch.add(theo);
        listeTwitch.add(oktoblin);
        listeTwitch.add(avril);
        listeTwitch.add(pablito);
        System.out.println("\n" + listeTwitch.get(0).getPrenom());

        HashMap<String,Personne> listeUsernameTwitch= new HashMap<>();
        listeUsernameTwitch.put("Thebosq",theo);
        listeUsernameTwitch.put("Lizbell_2312",mailise);
        listeUsernameTwitch.put("Exacium",pablito);
        listeUsernameTwitch.put("Oktoblin",oktoblin);
        listeUsernameTwitch.put("Bennixxu",bennixxu);
        listeUsernameTwitch.put("Avril_fantome",avril);
        listeUsernameTwitch.put("Antoinfef1222",antoine);
        listeUsernameTwitch.put("Le_sucre",le_sucre);
        System.out.println(listeUsernameTwitch.get("Le_sucre").getPrenom());

        Subscription kyumaok = new Subscription();
        kyumaok.setNombreSub(10000);
    }
}