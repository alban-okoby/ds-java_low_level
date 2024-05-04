import java.time.LocalDateTime;
import java.util.ArrayList;

abstract class Employe {
   private String nom;
   private String prenom;
   private int age;
   private LocalDateTime deteEntree;

   public Employe() {

   }

    public Employe(String nom, String prenom, int age, LocalDateTime dateTime) {
       this.nom = nom;
       this.prenom = prenom;
       this.age = age;
       this.deteEntree = dateTime;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
       return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getDeteEntree() {
        return deteEntree;
    }

    public void setDeteEntree(LocalDateTime deteEntree) {
        this.deteEntree = deteEntree;
    }

    public String afficherNomPrenomsEmploye() {
       return getNom() + " " + getPrenom();
    }

    public abstract double calculSalaire();
}

class Commercial extends Employe {
    private double chiffreAffaire;

    public Commercial(String nom, String prenom, int age, LocalDateTime dateTime, double chiffreAffaire) {
        super(nom, prenom, age, dateTime);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double chiffreAffaire() {
        return chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculSalaire() {
        return 0;
    }
}

class Vendeur extends Commercial {

    private final static double POURCENTAGE_VENDEUR = 0.20;
    private final static double BONUS_VENDEUR = 400.0;

    public Vendeur(String nom, String prenom, int age, LocalDateTime dateTime, double chiffreAffaire) {
        super(nom, prenom, age, dateTime, chiffreAffaire);
    }

    @Override
    public double calculSalaire() {
        return ((POURCENTAGE_VENDEUR * getChiffreAffaire()) + BONUS_VENDEUR);
    }

    @Override
    public String afficherNomPrenomsEmploye() {
        return ("Le vendeur : " + super.afficherNomPrenomsEmploye());
    }
}

class Representant extends Commercial {

    private final static double POURCENTAGE_REPRESENTANT = 0.20;
    private final static double BONUS_REPRESENTANT = 800.0;

    public Representant(String nom, String prenom, int age, LocalDateTime dateTime, double chiffreAffaire) {
        super(nom, prenom, age, dateTime, chiffreAffaire);
    }

    @Override
    public double calculSalaire() {
        return ((POURCENTAGE_REPRESENTANT * getChiffreAffaire()) + BONUS_REPRESENTANT);
    }

    @Override
    public String afficherNomPrenomsEmploye() {
        return ("Le Représentant : " + super.afficherNomPrenomsEmploye());
    }
}

class Technicien extends Employe {

    private double nbreUnite;
    private final static double COEFFICIENT = 5.0;

    public Technicien(String nom, String prenom, int age, LocalDateTime dateTime, double nbreUnite) {
        super(nom, prenom, age, dateTime);
        this.nbreUnite = nbreUnite;
    }

    @Override
    public double calculSalaire() {
        return (COEFFICIENT * nbreUnite);
    }

    @Override
    public String afficherNomPrenomsEmploye() {
        return ("Le Technicien : " + super.afficherNomPrenomsEmploye());
    }
}

class TechnARisque extends Technicien implements PrimeDeRisque {

    public TechnARisque(String nom, String prenom, int age, LocalDateTime dateTime, double nbreHeure) {
        super(nom, prenom, age, dateTime, nbreHeure);
    }

    @Override
    public double calculSalaire() {
        return (super.calculSalaire() + PRIME);
    }
}

class Manutentionnaire extends Employe {

    private double nbreHeure;
    private final static double COEFFICIENT = 65.0;

    public Manutentionnaire(String nom, String prenom, int age, LocalDateTime dateTime, double nbreHeure) {
        super(nom, prenom, age, dateTime);
        this.nbreHeure = nbreHeure;
    }

    @Override
    public double calculSalaire() {
        return (COEFFICIENT * nbreHeure);
    }

    @Override
    public String afficherNomPrenomsEmploye() {
        return ("Le Manutentionnaire : " + super.afficherNomPrenomsEmploye());
    }

}

class ManutARisque extends Manutentionnaire implements PrimeDeRisque {

    public ManutARisque(String nom, String prenom, int age, LocalDateTime dateTime, double nbreHeure) {
        super(nom, prenom, age, dateTime, nbreHeure);
    }

    @Override
    public double calculSalaire() {
        return (super.calculSalaire() + PRIME);
    }
}

interface PrimeDeRisque {
    double PRIME = 200;
}

class Personnel {
    final static int MAX_EMPLOYE = 100;
    private int nbreEmployes;
    private ArrayList<Employe> collectionEmployes;

    public Personnel() {
        collectionEmployes = new ArrayList<Employe>();
        nbreEmployes = 0;
    }

    public void ajouterEmploye(Employe emp) {
        if (collectionEmployes.size() < MAX_EMPLOYE) {
            collectionEmployes.add(emp);
            nbreEmployes++;
        } else {
            System.out.println("Désolé, nombre max d'employés atteint !");
        }

    }

    public void afficherSalaires() {
        // Parcours tout les employés et affiche le salaire de chacun
        for (Employe employe: collectionEmployes) {
            System.out.println(employe.afficherNomPrenomsEmploye() + " gagne " + employe.calculSalaire() + " francs.");
        }
    }

    public double salaireMoyen() {
        double somSalaire = 0;
        // Parcours tout les employés et on additionne leurq salaires moyen
        for (Employe employe: collectionEmployes) {
            somSalaire += employe.calculSalaire();
        }

        return (collectionEmployes.size() > 0 ? somSalaire / collectionEmployes.size() : 0);

    }

    public static void main(String[] args) {
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Kouassi", "Business", 45, LocalDateTime.now(), 30000));
        p.ajouterEmploye(new Representant("Balo", "Vendtout", 25, LocalDateTime.now(), 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, LocalDateTime.now(), 1000));
        p.ajouterEmploye(new Manutentionnaire("Mélanie", "Stocketout", 32, LocalDateTime.now(), 45));
        p.ajouterEmploye(new TechnARisque("Eman", "Flippe", 28, LocalDateTime.now(), 1000));
        p.ajouterEmploye(new ManutARisque("Cris", "Abordage", 30, LocalDateTime.now(), 45));

        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");
    }

}