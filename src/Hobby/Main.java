package Hobby;

public class Main {
    public static void main(String[] args) {
        Tennis player1 = new Tennis ("Novak Djokovic", 36, "Serbian", true);
        Tennis player2 = new Tennis("Carlos Alcaraz", 20, "Spanish", true);
        Tennis player3 = new Tennis("Stefanis Tsitsipas", 25, "Greek", false);
        player1.printInfo();
        System.out.println();
        player2.printInfo();
        System.out.println();
        player3.printInfo();
    }
}
