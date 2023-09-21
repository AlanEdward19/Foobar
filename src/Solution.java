import java.util.HashSet;

public class Solution {
    public static int solution(int[] x, int[] y) {
        int[] greaterArray = x.length > y.length ? x : y;
        int[] minorArray = x.length > y.length ? y : x;

        HashSet<Integer> arrayValues = new HashSet<>();

        for (int i : minorArray)
        {
            arrayValues.add(i);
        }

        for (int i : greaterArray)
        {
            if (!arrayValues.contains(i))
            {
                return i;
            }
        }

        return 0;
    }
}