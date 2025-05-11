class Casier {
    public void daComanda(String comanda) {
        System.out.println("Casierul a dat comanda: " + comanda);
    }
}

class Bucatar {
    public void faMancare(String comanda) {
        System.out.println("Bucatarul prepara comanda: " + comanda);
    }
}

class SpalatorVase {
    public void spalaVase(int vaseNespalate) {
        System.out.println("Spalatorul a spalat " + vaseNespalate + " vase.");
    }
}

class Ingrijitor {
    public void datCuMopul(int nivelMizerie) {
        System.out.print("Ingrijitorul a dat cu mopul ");
        if (nivelMizerie < 25) {
            System.out.println("si a curatat putin mizeria");
        } else if (nivelMizerie <50) {
            System.out.println("si a curatat intens mizeria");
        } else {
            System.out.println("si a facut o rugaciune dupa ce a terminat sa curete jegul de pe jos");
        }
    }
}

class FastFoodManager {
    private Casier casier = new Casier();
    private Bucatar bucatar = new Bucatar();
    private SpalatorVase spalatorVase = new SpalatorVase();
    private Ingrijitor ingrijitor = new Ingrijitor();

    public void servireClient(String comanda) {
        casier.daComanda(comanda);
        bucatar.faMancare(comanda);
        spalatorVase.spalaVase(comanda.length());
    }

    public void curataRestaurant(int nivel) {
        ingrijitor.datCuMopul(nivel);
    }
}

public class ExempluBun {
    public static void main(String[] args) {
        FastFoodManager fastFoodManager = new FastFoodManager();

        fastFoodManager.servireClient("Pizza");
        fastFoodManager.curataRestaurant(15);
    }
}