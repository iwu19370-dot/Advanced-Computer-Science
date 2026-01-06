public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = OrderProcessor.subtotal(items); // the subtotal of all the items by going through the whole array and adding the prices
        double tax = OrderProcessor.tax(items, taxRate); // the tax of all the items 
        double total = OrderProcessor.total(items, taxRate); // the total of tax and subtotal together
        int premiunItemCount = OrderProcessor.premiumItemCount(items); // Check if expensive
        String[] expensiveItems = OrderProcessor.expensiveItems(items); // Trim premium items to exact size
        
        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    public static double total(Item[] items, double taxRate) {
        double total = OrderProcessor.subtotal(items) + OrderProcessor.tax(items, taxRate);
        return total;
    } // Calculates the total for an individual item in the array

    public static double subtotal(Item[] items) {
        double subtotal = 0.0;
        for (int i = 0; i < items.length; i++) {
            subtotal = subtotal + items[i].getPrice() * items[i].getQuantity();
        }
        return subtotal;
    } // Calculates the total for all the items added together in the array without tax

    public static int premiumItemCount(Item[] items) {
        int premiumItems = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getPrice() > 50.0) {
            premiumItems++;
            System.out.println(items[i].getName() + " is a premium item at $" + items[i].getPrice());
        } else {
            System.out.println(items[i].getName() + " is a regular item at $" + items[i].getPrice());
        }
        }
        return premiumItems;
    } // Checks if a specific item is expensive and counts the total premium item count.

    public static double tax(Item[] items, double taxRate) {
        double tax = 0;
        if (OrderProcessor.subtotal(items) > 0) {
            tax = OrderProcessor.subtotal(items) * taxRate;
        } else {
            tax = 0;
        }
        return tax;
    } // Calculate tax and total

    public static String[] expensiveItems(Item[] items) {
        int premiumItems = OrderProcessor.premiumItemCount(items);
        int order = 0;
        String[] expensiveItems = new String[premiumItems];
        for (int j = 0; j < items.length; j++) {
            if (items[j].getPrice() >= 50) {
                expensiveItems[order] = items[j].getName();
                order++;
            }
        }
        return expensiveItems;
    }

    public static String toString(Item[] items, double taxRate) {
        return "Subtotal: $" + OrderProcessor.subtotal(items) + "\nTax: $" + OrderProcessor.tax(items, taxRate) + "\nTotal: $" + OrderProcessor.total(items, taxRate) + "\nNumber of premium items: " + OrderProcessor.premiumItemCount(items);

    }
} 