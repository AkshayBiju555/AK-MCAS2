/*
18-02-26
Q.10 Method Overriding  
*/

class methodoverloading {

    int add(int a) {
        return a + 10;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double area(double side) {
        return side * side;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(double base, double height, double third) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        methodoverloading obj = new methodoverloading();

        System.out.println(obj.add(5));
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(5.5, 4.5));

        System.out.println(obj.area(4));
        System.out.println(obj.area(5, 4));
        System.out.println(obj.area(6, 3, 1));
    }
}
/*
OUTPUT

PS C:\AK> cd "Java programming" 
PS C:\AK\Java programming> javac methodoverloading.java
PS C:\AK\Java programming> java methodoverloading
15
30
6
10.0
16.0
20.0
9.0
*/