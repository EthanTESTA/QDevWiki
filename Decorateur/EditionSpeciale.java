public class EditionSpeciale extends DecorateurLivre {

    public EditionSpeciale(Livre livre) {
        this.livre = livre;
    }

    @Override
    public double getPrix() {
        return this.livre.getPrix() * 1.2;
    }

    @Override
    public String getType() {
        return this.livre.getType() + ", Edition Spéciale";
    }
}
