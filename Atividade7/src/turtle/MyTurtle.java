public class MyTurtle extends BaseTurtle {
    public void draw() {

        this.pen.setStrokeWidth(350);
        this.setDelay(2);
        pen.setColor(150, 255, 0);
        for (int i = 0; i < 60; i++) {
            this.square(-15);
            this.turn(-9);
        }

        this.pen.setStrokeWidth(50);
        this.setDelay(2);
        pen.setColor(1, 1, 1);
        for (int i = 0; i < 60; i++) {
            this.square(-7);
            this.turn(-7);
        }


        this.pen.setStrokeWidth(20);
        this.setDelay(2);
        pen.setColor(255, 13, 0);
        for (int i = 0; i < 60; i++) {
            this.square(-10);
            this.turn(-10);
        }


        this.pen.setStrokeWidth(20);
        this.setDelay(2);
        pen.setColor(0, 0, 0);
        for (int i = 0; i < 200; i++) {
            this.square(2);
            this.turn(2);
        }




        this.pause(5);
        this.reset();

    }

    private void square(double size) {
        for (int i = 0; i < 4; i++) {
            this.forward(size);
            this.turn(90);
        }
    }
}
