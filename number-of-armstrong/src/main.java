
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args)
    {
        int number = 100_000_000;
        int[] a = getNumbers(number);

        for (int i : a) {
            System.out.print(i + " ");
        }
        
        System.out.println();

    }
    public static int[] getNumbers(int N) {
        int[] result = null;

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < N; i++) {
            int degree = getDegree(i);

            int input = i;
            int sum = 0;
            int k;

            do {
                k = input % 10;
                int a = 1;
                for(int j = 0; j < degree; j++) {
                    a *= k;
                }
                sum += a;
            } while ( (input /= 10) > 0);

            if (sum == i) {
                list.add(i);
            }
        }
        result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
    public static int getDegree(int i)
    {
        int degree = 0;

        do {
            degree += 1;
        } while ( (i /= 10) > 0);
        return degree;
    }
}