import java.util.Scanner;


interface Shape {
    void area();
    void perimeter();
}


class Rectangle implements Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public void area() {
        System.out.println("Rectangle Area = " + (length * width));
    }

    public void perimeter() {
        System.out.println("Rectangle Perimeter = " + (2 * (length + width)));
    }
}

class Square implements Shape {
    int side;

    Square(int s) {
        side = s;
    }

    public void area() {
        System.out.println("Square Area = " + (side * side));
    }

    public void perimeter() {
        System.out.println("Square Perimeter = " + (4 * side));
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();

        Rectangle r = new Rectangle(l, w);
        r.area();
        r.perimeter();

        System.out.print("Enter side of square: ");
        int s = sc.nextInt();

        Square sq = new Square(s);
        sq.area();
        sq.perimeter();

        sc.close();
    }
} 
