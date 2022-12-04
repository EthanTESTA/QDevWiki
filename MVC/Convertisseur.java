public class Convertisseur {

    private double euro;

    public Convertisseur() {

    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double montant){
        this.euro = montant;

    }
    public double getDollars() {
        return euro * 1.04;
    }
}