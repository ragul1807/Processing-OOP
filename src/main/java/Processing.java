import processing.core.PApplet;

public class Processing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Ball[] ball=new  Ball[4];
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

        ball[0]=new Ball(this,1,HEIGHT/5);
        ball[1]=new Ball(this,2,2*HEIGHT/5);
        ball[2]=new Ball(this,3,3*HEIGHT/5);
        ball[3]=new Ball(this,4,4*HEIGHT/5);
    }

    @Override
    public void draw() {
        ball[0].move();
        ball[1].move();
        ball[2].move();
        ball[3].move();
    }
}
