package java09;

public class AnotherThreadRace {

    public static void main(String[] args) {
        Rabbit r = new Rabbit("Snowball");
        Thread t = new Thread(new Turtle("Donatello"));
        Leopard l = new Leopard("GreenLight");
        r.start();
        t.start();
        l.start();

    }


}

