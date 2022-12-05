public class MyInscribedCircle {
    private final float side;
    private final float squareS;
    private final float circleS;
    private final float cornerPieceS;

    public MyInscribedCircle(float side) {
        this.side = side;
        this.squareS = getSquareArea(this.side);
        this.circleS = getCircleArea(this.side);
        this.cornerPieceS = getCornerPieceArea(this.squareS, this.circleS);
    }

    private float getSquareArea(float side) {
        return side * side;
    }

    private float getCircleArea(float side) {
        return (float)Math.PI * side * side / 4;
    }

    private float getCornerPieceArea(float squareS, float circleS) {
        return (squareS - circleS) / 4;
    }

    public float getFigure1Area() {
        return cornerPieceS * 2;
    }

    public float getFigure2Area() {
        return cornerPieceS * 2 + circleS;
    }

    public float getFigure3Area() {
        return cornerPieceS + getSquareArea(this.side/2);
    }
}
