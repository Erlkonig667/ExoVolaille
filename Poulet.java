/**
 * The type Poulet.
 */
public class Poulet extends Volaille{
    private double prixJour;
    private double poidsAbattage;

    /**
     * Instantiates a new Poulet.
     *
     * @param poids         the poids
     * @param prixJour      the prix jour
     * @param poidsAbattage the poids abattage
     */
    public Poulet(double poids,double prixJour, double poidsAbattage){
        super(poids);
        this.prixJour=prixJour;
        this.poidsAbattage=poidsAbattage;
    }

    /**
     * Gets prix jour.
     *
     * @return the prix jour
     */
    public double getPrixJour() {
        return prixJour;
    }

    /**
     * Sets prix jour.
     *
     * @param prixJour the prix jour
     */
    public void setPrixJour(double prixJour) {
        this.prixJour = prixJour;
    }

    /**
     * Gets poids abattage.
     *
     * @return the poids abattage
     */
    public double getPoidsAbattage() {
        return poidsAbattage;
    }

    /**
     * Sets poids abattage.
     *
     * @param poidsAbattage the poids abattage
     */
    public void setPoidsAbattage(double poidsAbattage) {
        this.poidsAbattage = poidsAbattage;
    }
    public String toString() {
        String res= super.toString();
        res+=" Le poids d'abattage pour les poulets est de "+this.getPoidsAbattage()+"kg. Aujourd'hui le prix de revente des poulets est de "+this.getPrixJour()+"€/kg.";
        return res;
    }

    /**
     * Is pret boolean.
     *
     * @return the boolean
     */
    public boolean isPret(){
        boolean pret = false;
        if (this.getPoids()>=this.poidsAbattage)
            pret=true;
        return pret;
    }
}
