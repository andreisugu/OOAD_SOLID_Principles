public class Main {
    public static void main(String[] args) {
        Cook chef = new Chef();
        chef.cookFood();

        Cleaner janitor = new Janitor();
        janitor.cleanKitchen();

        Server waiter = new Waiter();
        waiter.serveFood();
    }
}