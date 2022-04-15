package test;

import vector.Vector;

import static vector.VectorArithmetic.*;

public class Test {

    public static void testVector() {
        Vector v1 = new Vector(3);
        Vector v2 = new Vector(4);
        System.out.println(v1.length());

        int[] e1 = {7, 9, 1};
        int[] e2 = {3, 5, 8, 4};

        v1.addValues(e1);
        v2.addValues(e2);

        System.out.println(v1.getValue(0));
        v1.sortByAscend();
        for(int i = 0; i < v1.returnCopyValues().length; i++) {

            System.out.println(v1.returnCopyValues()[i]);
        }

        System.out.println(findEuclideanNorm(v1));

        for(int i = 0; i < sumVectors(v1, v2).length; i++) {

            System.out.println(sumVectors(v1, v2)[i]);
        }

        for(int i = 0; i < v1.length(); i++) {

            System.out.println(multiplyVector(v1, 3)[i]);
        }
    }
}
