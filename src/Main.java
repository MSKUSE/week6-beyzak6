public class Main {
    public static void main(String[] args) {

        Point p = new Point(3,4);
        Rectangle r1 = new Rectangle(p,3,4);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());


        TriAngle t1 = new TriAngle(p,1,2,3);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());

    }
}