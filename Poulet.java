public class Poulet extends Volaille{
    private double prixJour;
    private double poidsAbattage;

    public Poulet(double poids,double prixJour, double poidsAbattage){
        super(poids);
        this.prixJour=prixJour;
        this.poidsAbattage=poidsAbattage;
    }

    public double getPrixJour() {
        return prixJour;
    }

    public void setPrixJour(double prixJour) {
        this.prixJour = prixJour;
    }

    public double getPoidsAbattage() {
        return poidsAbattage;
    }

    public void setPoidsAbattage(double poidsAbattage) {
        this.poidsAbattage = poidsAbattage;
    }
    public String toString() {
        String res= super.toString();
        res+=" Le poids d'abattage pour les poulets est de "+this.getPoidsAbattage()+"kg. Aujourd'hui le prix de revente des poulets est de "+this.getPrixJour()+"€/kg.";
        return res;
    }
    public boolean isPret(){
        boolean pret = false;
        if (this.getPoids()>=this.poidsAbattage)
            pret=true;
        return pret;
    }
}
