class FastFoodManagerProst{
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

    public void spalaVase(int vaseNespalate) {
        System.out.println("Spalatorul a spalat " + vaseNespalate + " vase.");
    }

    public void faMancare(String comanda) {
        System.out.println("Bucatarul prepara comanda: " + comanda);
    }

    public void daComanda(String comanda) {
        System.out.println("Casierul a dat comanda: " + comanda);
    }

    public void servireClient(String comanda) {
        this.daComanda(comanda);
        this.faMancare(comanda);
        this.spalaVase(comanda.length());
    }

    public void curataRestaurant(int nivel) {
        this.datCuMopul(nivel);
    }
}

public class ExempluProst {
    public static void main(String[] args) {
        FastFoodManagerProst fastFoodManager = new FastFoodManagerProst();

        fastFoodManager.servireClient("Pizza");
        fastFoodManager.curataRestaurant(15);
    }
}
