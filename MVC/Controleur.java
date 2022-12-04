public class Controleur {

    private Convertisseur modele;
    private Vue vue;

    public Controleur(Convertisseur modele, Vue vue) {
        this.modele = modele;
        this.vue = vue;
    }

    public void setEuro(int montant) {
        modele.setEuro(montant);
    }

    public double getEuro() {
        return modele.getEuro();
    }

    public double getDollars() {
        return modele.getDollars();
    }

    public void updateView() {
        vue.printDeviseConversion(modele.getEuro(), modele.getDollars());
    }
}