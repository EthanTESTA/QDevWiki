public class main {

    public static void main(String[]) {

        Convertisseur convertisseur = new Convertisseur();

        Vue vue = new Vue();

        Controleur controleur = new Controleur(convertisseur, vue);

        controleur.updateView();

        controleur.setEuro(10);

        controleur.updateView();

    }

}
