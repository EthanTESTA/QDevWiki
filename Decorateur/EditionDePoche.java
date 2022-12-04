public class EditionDePoche extends DecorateurLivre {

    public EditionDePoche(Livre livre){
        this.livre = livre;
    }

    @Override
    public String getType(){
        return this.livre.getType() + ", EditionDePoche";
    }

    @Override
    public double getPrix(){
        return this.livre.getPrix() * 0.8;
    }

}
