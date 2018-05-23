public class Main {

    public static void main(String[] args) {

        Personage bob = new Personage();
        bob.direBonjour();

        Personage toto= new Personage("toto");
        toto.direBonjour();

        toto.doubleTape(bob);
        bob.direBonjour();
    }
}

