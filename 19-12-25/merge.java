import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] curr = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= curr[1])
                curr[1] = Math.max(curr[1], intervals[i][1]);
            else {
                result.add(curr);
                curr = intervals[i];
            }
        }
        result.add(curr);

        for (int[] i : result)
            System.out.println(i[0] + " " + i[1]);
    }
}
