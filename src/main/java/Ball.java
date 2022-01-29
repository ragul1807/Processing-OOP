public class Ball {
    private final Processing sketch;
    private final int movingSpeed;
    private final int yPosition;
    private static final int diameter=50;
    private int xPosition;
    Ball(Processing sketch, int movingSpeed, int yPosition)
    {
        this.sketch = sketch;
        this.movingSpeed = movingSpeed;
        this.yPosition = yPosition;
    }
    public void ballMover()
    {
        this.sketch.ellipse(xPosition,yPosition,diameter,diameter);

    }

    public void speed() {
        this.xPosition+=movingSpeed;
    }

}
