package java09;

public class Leopard extends Thread {
    private String name;

    public Leopard(String name) {
        this.name = name;
    }


    private void runLikeLeopard() {
        System.out.println(name + " is running extremely fast");
    }

    public void run() {
        System.out.println(name + " Leopard is at the start of the race!");
        for (int pos = 20; pos > 0; pos--) {
            runLikeLeopard();
            System.out.println(name + " is at position " + pos);
        }
        System.out.println(name + " Leopard finished the race!");
    }
}
