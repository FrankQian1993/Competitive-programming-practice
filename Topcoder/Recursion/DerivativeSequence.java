import java.lang.reflect.Array;
import java.util.*;

public class DerivativeSequence
{
    public static int[] derSeq(int[] a, int n)
    {
        if (n == 0)
        {
            return a;
        }
        int[] array_res = new int[a.length - 1];
        for(int i = 0; i < a.length - 1; i++) {
            array_res[i] = a[i+1] - a[i];
        }
        n--;
        return derSeq(array_res, n);
    }
    public static void main(String[] args) {
        int [] array0 = {5,6,3,9,-1};
        int n0 = 1;
        int [] array1 = {5,6,3,9,-1};
        int n1 = 2;
        int [] array2 = {5,6,3,9,-1};
        int n2 = 4;
        int [] array3 = {4,4,4,4,4,4,4,4};
        int n3 = 3;
        int [] array4 = {-100,100};
        int n4 = 0;
        System.out.println(Arrays.toString(derSeq(array0, n0)));
        System.out.println(Arrays.toString(derSeq(array1, n1)));
        System.out.println(Arrays.toString(derSeq(array2, n2)));
        System.out.println(Arrays.toString(derSeq(array3, n3)));
        System.out.println(Arrays.toString(derSeq(array4, n4)));
    }
}