import java.util.Scanner;
public class MainVolaille {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ferme ferme = new Ferme();
        System.out.println("Quel est le prix du jour pour les canards ?");                                              //On demande à l'utilisateur de renseigner le prix du jour pour les canards et les poulets
        double prixCanard=scanner.nextDouble();
        System.out.println("Quel est le prix du jour pour les poulets ?");
        double prixPoulet=scanner.nextDouble();
        System.out.println("Quel est le poids d'abattage de vos canards ?");                                            //On demande à l'utilisateur de renseigner le poids minimal d'abattage pour les volailles
        double poidsCanard=scanner.nextDouble();
        System.out.println("Quel est le poids d'abattage de vos poulets ?");
        double poidsPoulet=scanner.nextDouble();
        System.out.println("Voulez-vous ajouter de nouvelles volailles dans votre ferme? O pour Oui / N pour Non");     //Ajout des volailles dans la ferme
        char reponse;
        reponse = Terminal.lireChar();
        do {
            if (reponse == 'O') {
                System.out.println("Voulez vous enregistrer un canard (taper C) ou un poulet (taper P) ?");
                char type = Terminal.lireChar();
                System.out.println("Quel est le poids de la volaille que vous souhaitez enregistrer?");
                double poids = scanner.nextDouble();
                if (type == 'C') {
                    Canard c = new Canard(poids,prixCanard,poidsCanard);
                    ferme.ajouter(c);
                }
                if (type == 'P') {
                    Poulet p = new Poulet(poids,prixPoulet,poidsPoulet);
                    ferme.ajouter(p);
                }
                System.out.println("Désirez-vous ajouter d'autres volailles dans votre ferme? O pour Oui / N pour Non");
                reponse = Terminal.lireChar();
            }
        } while (reponse == 'O');
        System.out.println("AFFICHAGE DE L'INVENTAIRE DE VOTRE FERME");
        ferme.afficher();
        System.out.println("EVALUATION DES PRIX DE VENTE");
        System.out.println("La vente de vos volailles ayant un poids suffisant pour l'abattage devrait vous rapporter au total "+ferme.evalVente()+"€.");
    }

}
