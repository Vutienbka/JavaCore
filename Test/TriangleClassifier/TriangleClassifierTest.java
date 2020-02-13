package TriangleClassifier;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;


class TriangleClassifierTest {
    final int EQUILATERAL_TRIANGLE = 1;
    final int ISOSCELES_TRIANGLE = 2;
    final int NORMAL_TRIANGLE = 3;
    final int NOT_TRIANGLE = -1;
    @Test
    void testEquilateralTriangle() {

        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        int actualResult = TriangleClassifier.triangle(side1, side2, side3);
        int expectedResult = EQUILATERAL_TRIANGLE;
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void testIsoscelesTriangle() {

        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        int actualResult = TriangleClassifier.triangle(side1, side2, side3);
        int expectedResult = ISOSCELES_TRIANGLE;
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void testNormalTriangle() {
        int side1 = 2;
        int side2 = 1;
        int side3 = 3;
        int actualResult = TriangleClassifier.triangle(side1, side2, side3);
        int expectedResult = NORMAL_TRIANGLE;
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void testNotTriangle() {

        int side1 = -1;
        int side2 = 2;
        int side3 = 3;
        int actualResult = TriangleClassifier.triangle(side1, side2, side3);
        int expectedResult = NOT_TRIANGLE;
        assertEquals(expectedResult,actualResult);
    }
}

