import java.util.ArrayList;

public class CircleDemo {

    public static void m2(ArrayList<Circle> circles){
        circles.remove(0);
    }
    public static void m1(Circle c){
        Circle c2 = c;
        c2.setRadius(5);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10);

        System.out.println("area 0f c1 before calling m1 = " + c1.getArea());

        m1(c1);

        System.out.println("area of c1 after calling m1 = " + c1.getArea());

        ArrayList<Circle> cList = new ArrayList<>();

        Circle c2 = new Circle(1);
        Circle c3 = new Circle(2);

        cList.add(c1);
        cList.add(c2);
        cList.add(c3);

        System.out.println("size of list before calling m2 = " + cList.size());
        m2(cList);
        System.out.println("size of list after calling m2 = " + cList.size());
    }
}
