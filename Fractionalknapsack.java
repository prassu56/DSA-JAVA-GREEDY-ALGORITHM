import java.util.*;

class Items1 {
    int w;        // weight
    int p;        // profit
    double ratio; // profit/weight ratio

    public Items1(int w, int p) {
        this.w = w;
        this.p = p;
        this.ratio = (double)p / w;
    }
}

public class Fractionalknapsack {
    public static void main(String[] args) {
        Items1[] Item = {
            new Items1(10, 60),
            new Items1(20, 100),
            new Items1(20, 100),
            new Items1(30, 120)
        };

        int capacity = 50;
        double profit = 0.0;

        // Sort items in descending order of ratio
        Arrays.sort(Item, (a, b) -> Double.compare(b.ratio, a.ratio));

        // Take items as per fractional knapsack logic
        for (Items1 it : Item) {
            if (capacity>it.w) {
                profit = profit+it.p;
                capacity = capacity-it.w;
            } else {
               profit=profit+it.ratio*capacity;
            }
        }

        System.out.println("Maximum Profit = " + profit);
    }
}
