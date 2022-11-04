package java09;

class Rabbit extends Thread {
    private String name;

    public Rabbit(String name) {
        this.name = name;
    }

    private void runLikeRabbit() {
        System.out.println(name + " is running fast");
    }

    public void run() {
        System.out.println(name + " rabbit is at the start of the race!");
        for (int pos = 10; pos > 0; pos--) {
            runLikeRabbit();
            System.out.println(name + " is at position " + pos);
        }
        System.out.println(name + " rabbit finished the race!");
    }
}
