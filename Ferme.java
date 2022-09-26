import java.util.ArrayList;

/**
 * The type Ferme.
 */
public class Ferme {
    private ArrayList<Volaille> inventaire;

    /**
     * Instantiates a new Ferme.
     */
    public Ferme (){
        this.inventaire = new ArrayList<Volaille>();
    }

    /**
     * Ajouter.
     *
     * @param v the v
     */
    public void ajouter(Volaille v){
        int indice=0;
        for (int i=0;i<inventaire.size();i++){
            Volaille a=inventaire.get(i);
            if (v.getId()>a.getId())
                indice++;
        }
        inventaire.add(indice,v);
    }

    /**
     * Afficher.
     */
    public void afficher (){
        for (int i=0;i<inventaire.size();i++){
            Volaille a = inventaire.get(i);
            System.out.println(a.toString());
        }
    }

    /**
     * Eval vente double.
     *
     * @return the double
     */
    public double evalVente(){
        double total=0;
        for (int i=0;i< inventaire.size();i++){
            Volaille a=inventaire.get(i);
            if (a instanceof Canard) {
                Canard b= (Canard) a;
                if (b.isPret()){
                    double valeur=b.getPoids()*b.getPrixJour();
                    System.out.println("Le canard ayant pour id "+b.getId()+" est prêt à l'abattage. Il devrait vous rapporter "+valeur+"€.");
                    total+=valeur;
                }
            }
            if (a instanceof Poulet){
                Poulet b= (Poulet) a;
                if (b.isPret()){
                    double valeur=b.getPoids()*b.getPrixJour();
                    System.out.println("Le poulet ayant pour id "+b.getId()+" est prêt à l'abattage. Il devrait vous rapporter "+valeur+"€.");
                    total+=valeur;
                }
            }
        }
        return total;
    }


}
