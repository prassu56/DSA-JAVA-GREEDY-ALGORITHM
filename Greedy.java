import java.util.*;

public class Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the item prices:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the amount: ");
        int num = sc.nextInt();
        
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        
        for (int price : arr) {
            if (sum + price <= num) {
                sum += price;
                count++;
            } else {
                break; // stop once we exceed the amount
            }
        }
        
        System.out.println("Maximum items that can be bought: " + count);
        sc.close();
    }
}
