/**
 * The type Volaille.
 */
public class Volaille {
    private double poids;
    private int id;
    private static int lastId=0;

    /**
     * Instantiates a new Volaille.
     */
    public Volaille(){

    }

    /**
     * Instantiates a new Volaille.
     *
     * @param poids the poids
     */
    public Volaille (double poids){
        this.poids=poids;
        this.id=lastId++;
    }

    /**
     * Gets poids.
     *
     * @return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * Sets poids.
     *
     * @param poids the poids
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "La volaille ayant pour ID "+this.getId()+" a un poids de "+this.poids+"kg.";
    }
}
