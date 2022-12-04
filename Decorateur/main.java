public class main {

    public static void main(String[] args) {
        // Création et affichage d'une gaufre au chocolat.
        Livre l1 = new BD();
        l1 = new EditionDePoche(l1);
        System.out.println(l1.getPrix());
        System.out.println(l1.getType());
        // Création et affichage d'une crêpe au chocolat et chantilly.
        Livre l2 = new Roman();
        l2 = new EditionSpeciale(l2);
        l2 = new EditionDePoche(l2);
        System.out.println(l2.getPrix());
        System.out.println(l2.getType());
    }

}
