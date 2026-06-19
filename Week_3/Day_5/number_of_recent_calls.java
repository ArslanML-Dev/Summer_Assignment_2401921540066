import java.util.*;

class RecentCounter {

    List<Integer> calls;
    int start;

    public RecentCounter() {
        calls = new ArrayList<>();
        start = 0;
    }

    public int ping(int t) {
        calls.add(t);

        // move start pointer forward
        while (calls.get(start) < t - 3000) {
            start++;
        }

        return calls.size() - start;
    }
}
