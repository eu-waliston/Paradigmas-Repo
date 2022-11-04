package java09;

class Turtle implements Runnable {
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    private void runLikeTurtle() {
        System.out.println(name + " is running slow");
    }

    public void run() {
        System.out.println(name + " turtle is at the start of the race!");
        for (int pos = 10; pos > 0; pos--) {
            runLikeTurtle();
            System.out.println(name + " is at position " + pos);
        }
        System.out.println(name + " turtle finished the race!");

    }
}
