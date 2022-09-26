public class Volaille {
    private double poids;
    private int id;
    private static int lastId=0;

    public Volaille(){

    }

    public Volaille (double poids){
        this.poids=poids;
        this.id=lastId++;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "La volaille ayant pour ID "+this.getId()+" a un poids de "+this.poids+"kg.";
    }
}
