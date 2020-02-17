package sixthHW;

public class Runner {
    public static void main(String[] args) {

        Triangle[] triangles = { new Triangle("ABC", new Dot(0, 0), new Dot(0, 4), new Dot(6, 0)),
                new Triangle("KLM", new Dot(0, 0), new Dot(2, 8), new Dot(4, 0)),
                new Triangle("NOP", new Dot(0, 0), new Dot(0, 4), new Dot(6, 0)),
                new Triangle("EFH", new Dot(0, 2), new Dot(1, 4), new Dot(5, 1)) };

        CountMethods triangleManager = new CountMethods();

        for (int i = 0; i < triangles.length; i++) {
            triangleManager.calculatePerimiterAndSquare(triangles[i]);
            triangleManager.identifyTriangleType(triangles[i]);

            System.out.println("Triangle " + triangles[i].name + ":");
            System.out.println("_________________");
            System.out.println("Perimeter: " + triangles[i].perimeter);
            System.out.println("Square: " + triangles[i].square);
            System.out.println("Type: " + triangles[i].type);
            System.out.println();
        }


        TriangleCount triangleCount = triangleManager.countTriangles(triangles);
        System.out.println();
        System.out.println("-- Count triangles --");
        System.out.println("Equilateral: " + triangleCount.equilateralCount);
        System.out.println("Isosceles: " + triangleCount.isoscelesCount);
        System.out.println("Right: " + triangleCount.rightCount);
        System.out.println("Miscellaneous: " + triangleCount.miscellaneousCount);
        System.out.println();


        Triangle maxEquilateral = triangleManager.maximalTriangle(triangles, TriangleEnum.EQUILATERAL);
        Triangle maxIsosceles = triangleManager.maximalTriangle(triangles, TriangleEnum.ISOSCELES);
        Triangle maxRight = triangleManager.maximalTriangle(triangles, TriangleEnum.RIGHT);
        Triangle maxMiscellaneous = triangleManager.maximalTriangle(triangles, TriangleEnum.MISCELLANEOUS);

        System.out.println();
        System.out.println("-- Maximal perimiter --");
        if (maxEquilateral != null)
            System.out.println("Equilateral: " + maxEquilateral.name);
        if (maxIsosceles != null)
            System.out.println("Isosceles: " + maxIsosceles.name);
        if (maxRight != null)
            System.out.println("Right: " + maxRight.name);
        if (maxMiscellaneous != null)
            System.out.println("Miscellaneous: " + maxMiscellaneous.name);
        System.out.println();
    

        Triangle minEquilateral = triangleManager.minimalTriangle(triangles, TriangleEnum.EQUILATERAL);
        Triangle minIsosceles = triangleManager.minimalTriangle(triangles, TriangleEnum.ISOSCELES);
        Triangle minRight = triangleManager.minimalTriangle(triangles, TriangleEnum.RIGHT);
        Triangle minMiscellaneous = triangleManager.minimalTriangle(triangles, TriangleEnum.MISCELLANEOUS);

        System.out.println();
        System.out.println("-- Minimal perimiter --");
        if (minEquilateral != null)
            System.out.println("Equilateral: " + minEquilateral.name);
        if (minIsosceles != null)
            System.out.println("Isosceles: " + minIsosceles.name);
        if (minRight != null)
            System.out.println("Right: " + minRight.name);
        if (maxMiscellaneous != null)
            System.out.println("Miscellaneous: " + minMiscellaneous.name);
        System.out.println();
    }
}
