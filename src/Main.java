import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float side = getSquareSide();

        MyInscribedCircle inscribedCircle = new MyInscribedCircle(side);

        printResult("1", inscribedCircle.getFigure1Area());
        printResult("2", inscribedCircle.getFigure2Area());
        printResult("3", inscribedCircle.getFigure3Area());
    }

    private static float getSquareSide() {
        System.out.print("Введите размер стороны квадрата: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static void printResult(String figureName, float figure) {
        System.out.printf("Площадь %s фигуры: %.3f\n", figureName, figure);
    }
}