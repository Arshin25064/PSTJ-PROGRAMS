import java.util.*;

class Record {
    int totalSales;
    String maxItem;
    int maxAmount;

    Record(int amount, String item) {
        this.totalSales = amount;
        this.maxItem = item;
        this.maxAmount = amount;
    }
}

public class TASK_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedHashMap<String, Record> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String category = sc.next();
            String item = sc.next();
            int amount = sc.nextInt();

            if (!map.containsKey(category)) {
                map.put(category, new Record(amount, item));
            } else {
                Record r = map.get(category);
                r.totalSales += amount;

                if (amount > r.maxAmount) {
                    r.maxAmount = amount;
                    r.maxItem = item;
                }
            }
        }

    
        for (Map.Entry<String, Record> entry : map.entrySet()) {
            String category = entry.getKey();
            Record r = entry.getValue();

            System.out.println(category + " " + r.totalSales + " " + r.maxItem);
        }
    }
}