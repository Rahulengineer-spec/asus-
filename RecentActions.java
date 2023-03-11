import java.util.*;

public class RecentActions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] actions = new int[m];
            for (int i = 0; i < m; i++) {
                actions[i] = sc.nextInt() - 1;
            }
            int[] latestOccurrence = new int[n];
            Arrays.fill(latestOccurrence, -1);
            int lastRemoved = -1;
            for (int i = 0; i < m; i++) {
                if (actions[i] != lastRemoved) {
                    latestOccurrence[actions[i]] = i + 1;
                    if (i + 1 < n) {
                        lastRemoved = -1;
                    } else {
                        lastRemoved = actions[i - n + 1];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(latestOccurrence[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
