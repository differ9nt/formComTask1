import java.io.IOException;

public class Triangle {
    public static void main(String[] args) throws IOException {


    }

    public static TriangleType classify(final int a, final int b, final int c) {
        int triangle;
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            return TriangleType.INVALID;
        }
        triangle = 0;
        if (a == b) {
            triangle = triangle + 1;
        }
        if (a == c) {
            triangle = triangle + 2;
        }
        if (b == c) {
            triangle = triangle + 3;
        }
        if (triangle == 0) {
            if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
                return TriangleType.INVALID;
            } else {
                return TriangleType.SCALENE;
            }
        }
        if (triangle > 3) {
            return TriangleType.EQUILATERAL;
        }
        if ((triangle == 1) && ((a + b) > c)) {
            return TriangleType.ISOSCELES;
        } else if ((triangle == 2) && ((a + c) > b)) {
            return TriangleType.ISOSCELES;
        } else if ((triangle == 3) && ((b + c) > a)) {
            return TriangleType.ISOSCELES;
        }
        return TriangleType.INVALID;
    }
}
