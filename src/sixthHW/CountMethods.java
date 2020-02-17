package sixthHW;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CountMethods {

    public void calculatePerimiterAndSquare(Triangle triangle) {
        double xAB = triangle.dotA.x - triangle.dotB.x;
        double yAB = triangle.dotA.y - triangle.dotB.y;
        double xBC = triangle.dotB.x - triangle.dotC.x;
        double yBC = triangle.dotB.y - triangle.dotC.y;
        double xAC = triangle.dotA.x - triangle.dotC.x;
        double yAC = triangle.dotA.y - triangle.dotC.y;
        double lengthAB = Math.sqrt(Math.pow(xAB, 2) + Math.pow(yAB, 2));
        double lengthBC = Math.sqrt(Math.pow(xBC, 2) + Math.pow(yBC, 2));
        double lengthAC = Math.sqrt(Math.pow(xAC, 2) + Math.pow(yAC, 2));

        double perimeter = lengthAB + lengthBC + lengthAC;
        triangle.perimeter = roundNumber(perimeter, 2);
        double square = Math.sqrt(triangle.perimeter * (triangle.perimeter - lengthAB) * (triangle.perimeter - lengthBC)
                * (triangle.perimeter - lengthAC));
        triangle.square = roundNumber(square, 2);
    }

    public void identifyTriangleType(Triangle triangle) {
        double xAB = triangle.dotA.x - triangle.dotB.x;
        double yAB = triangle.dotA.y - triangle.dotB.y;
        double xBC = triangle.dotB.x - triangle.dotC.x;
        double yBC = triangle.dotB.y - triangle.dotC.y;
        double xAC = triangle.dotA.x - triangle.dotC.x;
        double yAC = triangle.dotA.y - triangle.dotC.y;
        double lengthAB = Math.sqrt(Math.pow(xAB, 2) + Math.pow(yAB, 2));
        double lengthBC = Math.sqrt(Math.pow(xBC, 2) + Math.pow(yBC, 2));
        double lengthAC = Math.sqrt(Math.pow(xAC, 2) + Math.pow(yAC, 2));

        if (lengthAB == lengthBC && lengthAB == lengthAC && lengthBC == lengthAC) {
            triangle.type = TriangleEnum.EQUILATERAL;
        } else if ((lengthAB == lengthBC && lengthAB != lengthAC) 
                || (lengthAB == lengthAC && lengthAB != lengthBC)
                || (lengthBC == lengthAC && lengthAC != lengthAB)) {
            triangle.type = TriangleEnum.ISOSCELES;
        } else if (((Math.pow(lengthAB, 2) + Math.pow(lengthBC, 2)) == Math.pow(lengthAC, 2))
                || ((Math.pow(lengthAB, 2) + Math.pow(lengthAC, 2)) == Math.pow(lengthBC, 2))
                || ((Math.pow(lengthBC, 2) + Math.pow(lengthAC, 2)) == Math.pow(lengthAB, 2))) {
            triangle.type = TriangleEnum.RIGHT;
        } else {
            triangle.type = TriangleEnum.MISCELLANEOUS;
        }
    }

    public TriangleCount countTriangles(Triangle[] triangles) {
        TriangleCount triangleCount = new TriangleCount();

        for (int i = 0; i < triangles.length; i++) {
            if (triangles[i].type.equals(TriangleEnum.EQUILATERAL)) {
                triangleCount.equilateralCount++;
            } else if (triangles[i].type.equals(TriangleEnum.ISOSCELES)) {
                triangleCount.isoscelesCount++;
            } else if (triangles[i].type.equals(TriangleEnum.RIGHT)) {
                triangleCount.rightCount++;
            } else if (triangles[i].type.equals(TriangleEnum.MISCELLANEOUS)) {
                triangleCount.miscellaneousCount++;
            }
        }

        return triangleCount;
    }

    public Triangle minimalTriangle(Triangle[] triangles, String type) {
        Triangle minTriangle = null;
        for (int i = 0; i < triangles.length; i++) {
            if (!triangles[i].type.equals(type)) {
                continue;
            }

            if (minTriangle == null) {
                minTriangle = triangles[i];
            }

            if (triangles[i].perimeter <= minTriangle.perimeter) {
                minTriangle = triangles[i];
            }
        }
        return minTriangle;
    }

    public Triangle maximalTriangle(Triangle[] triangles, String type) {
        Triangle maxTriangle = null;
        for (int i = 0; i < triangles.length; i++) {
            if (!triangles[i].type.equals(type)) {
                continue;
            }

            if (maxTriangle == null) {
                maxTriangle = triangles[i];
            }

            if (triangles[i].perimeter >= maxTriangle.perimeter) {
                maxTriangle = triangles[i];
            }
        }
        return maxTriangle;
    }

    private double roundNumber(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
