public abstract class Livre {

    private String auteur;
    private String type;
    private double prix;
    
    String getType() {
        return this.type;
    }

    double getPrix() {
        return this.prix;
    }

    void setType(String type) {
        this.type = type;
    }

    void setPrix(double prix) {
        this.prix = prix;
    }
}
