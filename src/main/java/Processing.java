import processing.core.PApplet;

public class Processing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Ball[] ball;
    public static void main(String[] args) {
        PApplet.main("Processing",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        ball=new  Ball[4];
        for(int i=0;i<4;i++) {
            ball[i] = new Ball(this, i+1, (i+1)*HEIGHT / 5);
        }
    }

    @Override
    public void draw() {
        for(int i=0;i<4;i++) {
            ball[i].ballMover();
            ball[i].speed();
        }
    }
}
