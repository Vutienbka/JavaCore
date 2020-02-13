package TriangleClassifier;

public class TriangleClassifier {
    final static int EQUILATERAL_TRIANGLE = 1;
    final static int ISOSCELES_TRIANGLE = 2;
    final static int NORMAL_TRIANGLE = 3;
    final static int NOT_TRIANGLE = -1;
    public static int triangle(int side1, int side2, int side3) {


        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 == side2 && side2 == side3)
                return EQUILATERAL_TRIANGLE;
            else if (side1 == side2 || side2 == side3 || side1 == side3)
                return ISOSCELES_TRIANGLE;
            else return NORMAL_TRIANGLE;
        }
        else return NOT_TRIANGLE;
    }
}
