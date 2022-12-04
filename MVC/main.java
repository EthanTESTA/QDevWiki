public class main {

    public static void main(String[] args) {

        Convertisseur convertisseur = new Convertisseur();

        Vue vue = new Vue();

        Controleur controleur = new Controleur(convertisseur, vue);

        controleur.updateView();
        System.out.println("<L'utilisateur change la valeur à convertir>");
        controleur.setEuro(10);

        controleur.updateView();

    }

}