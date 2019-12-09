package sixthHW;

public class Triangle {
    Dot dotA;
    Dot dotB;
    Dot dotC;

    public Triangle(Dot dotA, Dot dotB, Dot dotC) {
        this.dotA = dotA;
        this.dotB = dotB;
        this.dotC = dotC;
    }

    double perimeter = perimeter(Triangle[] triangles, dotA, dotB, dotC);
    double square = square(Triangle[] triangles, dotA, dotB, dotC);

//    private double length(Dot dot1, Dot dot2) {
//        double x = dot1.x - dot2.x;
//        double y = dot1.y - dot2.y;
//        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
//    }

//    private double perimeter(double lengthAB, double lengthBC, double lengthAC) {
//        return lengthAB + lengthBC + lengthAC;
//    }

    public double perimeter(Triangle[] triangles, Dot dotA, Dot dotB, Dot dotC) {
        double xAB = dotA.x - dotB.x;
        double yAB = dotA.y - dotB.y;
        double xBC = dotB.x - dotC.x;
        double yBC = dotB.y - dotC.y;
        double xAC = dotA.x - dotC.x;
        double yAC = dotA.y - dotC.y;
        double lengthAB = Math.sqrt(Math.pow(xAB, 2) + Math.pow(yAB, 2));
        double lengthBC = Math.sqrt(Math.pow(xBC, 2) + Math.pow(yBC, 2));
        double lengthAC = Math.sqrt(Math.pow(xAC, 2) + Math.pow(yAC, 2));
        return lengthAB + lengthBC + lengthAC;
    }

//    private double square(double perimeter, double lengthAB, double lengthBC, double lengthAC) {
//        return Math.sqrt(perimeter * (perimeter - lengthAB) * (perimeter - lengthBC) * (perimeter - lengthAC));
//    }
//}

    public double square(Triangle[] triangles, Dot dotA, Dot dotB, Dot dotC) {
        double xAB = dotA.x - dotB.x;
        double yAB = dotA.y - dotB.y;
        double xBC = dotB.x - dotC.x;
        double yBC = dotB.y - dotC.y;
        double xAC = dotA.x - dotC.x;
        double yAC = dotA.y - dotC.y;
        double lengthAB = Math.sqrt(Math.pow(xAB, 2) + Math.pow(yAB, 2));
        double lengthBC = Math.sqrt(Math.pow(xBC, 2) + Math.pow(yBC, 2));
        double lengthAC = Math.sqrt(Math.pow(xAC, 2) + Math.pow(yAC, 2));
        double perimeter =  lengthAB + lengthBC + lengthAC;
        return Math.sqrt(perimeter * (perimeter - lengthAB) * (perimeter - lengthBC) * (perimeter - lengthAC));
    }
}