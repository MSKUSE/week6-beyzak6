public class Rectangle extends Shape{


    private Point topLeft;

    private int sideA , sideB;


    public Rectangle(Point topLeft, int sideA, int sideB) {
        super (topLeft);
        setSideA(sideA);
        setSideB(sideB);

    }



    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw  new IllegalArgumentException("Side Cant be negative");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            throw  new IllegalArgumentException("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }

    @Override
    public double area() {
        return this.sideA*this.sideB;
    }

    @Override
    public double perimeter() {
        return 2*sideA + 2*sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Location=" + getLocation() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +

                '}';
    }
}
