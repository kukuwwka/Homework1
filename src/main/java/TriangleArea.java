public class TriangleArea {
    public static void main(String[] args) {
        int sideA = 24;
        int sideB = 36;
        double degrees = 30.0;
        double radians = Math.toRadians(degrees);
        double area = 0.5 * sideA * sideB * Math.sin(radians);
        System.out.println(area);
    }
}

/*
- Создать метод который будет считать площадь треугольника произвольными (установленными вами) сторона
*/
