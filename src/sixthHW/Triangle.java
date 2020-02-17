package sixthHW;

public class Triangle {
    public String name;
    public String type;
    public Dot dotA;
    public Dot dotB;
    public Dot dotC;
    public double perimeter;
    public double square;

    public Triangle(String name, Dot dotA, Dot dotB, Dot dotC) {
        this.name = name;
        this.dotA = dotA;
        this.dotB = dotB;
        this.dotC = dotC;
    }
}