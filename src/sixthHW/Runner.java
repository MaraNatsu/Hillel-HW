package sixthHW;

public class Runner {
    public static void main(String[] args) {

        Triangle[] triangles = {
                new Triangle(new Dot(0, 0), new Dot(0, 4), new Dot(6, 0)),
                new Triangle(new Dot(0, 0), new Dot(2, 8), new Dot(4, 0)),
                new Triangle(new Dot(0, 0), new Dot(0, 4), new Dot(6, 0)),
                new Triangle(new Dot(0, 2), new Dot(1, 4), new Dot(5, 1)),
        };

        CountMethods triangle = new CountMethods();
        //System.out.println(triangle.countPerimeter(triangles,) + " ");


//        System.out.println(triangle.square + " ");

    }
}