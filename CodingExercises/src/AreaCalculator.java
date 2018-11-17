public class AreaCalculator {

    public static double area (double radius) {
        double pi = 3.14159;
        if (radius < 0) {
            return -1;
        } else {
            double factor1 = area(radius, radius);
            return area(factor1, pi);
        }
    }

    public static double area (double x, double y) {

        if (x < 0 || y < 0) {
            return -1;
        } else {
            return x * y;
        }
    }
}
