package vector;

import static java.lang.Math.sqrt;

public class VectorArithmetic {

    public static double findEuclideanNorm(Vector vector) {

        double norm = 0;
        for(int e : vector.returnCopyValues()) {

            norm += e * e;
        }
        if(norm < 0) {

            norm = norm * (-1);
        }
        return sqrt(norm);
    }

    public static int[] sumVectors(Vector a, Vector b) {

        if(a.length() >= b.length()) {

            return getResult(a, b, a);
        } else {

            return getResult(a, b, b);
        }
    }

    private static int[] getResult(Vector a, Vector b, Vector vector) {

        int[] result = vector.returnCopyValues();
        int length = (vector.length() == a.length()) ? b.length() : a.length();

        for (int i = 0; i < length; i++){

            result[i] = b.getValue(i) + a.getValue(i);
        }

        return result;
    }

    public static int[] multiplyVector(Vector vector, int value) {

        int[] result = vector.returnCopyValues();

        for (int i = 0; i < result.length; i++) {

            result[i] = result[i] * value;
        }
        return result;
    }
}
