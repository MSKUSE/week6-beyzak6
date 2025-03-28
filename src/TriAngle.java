public class TriAngle extends Shape{

    private double sideA , sideB,sideC;


    public TriAngle(Point topLeft, double sideA, double sideB, double sideC) {
        super(topLeft);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw  new IllegalArgumentException("Side Cant be negative");
        }
        else {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            throw  new IllegalArgumentException("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC < 0) {
            this.sideC = 0;
            throw  new IllegalArgumentException("Side B can't be negative!!");
        } else {
            this.sideC = sideC;
        }
    }

    @Override
    public double area() {
        return (sideA*sideB) / 2;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "TriAngle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
