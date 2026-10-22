import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int mousePrice = 20;
    int keyboardPrice = 40;
    int headphonesPrice = 50;
    int laptopStandPrice = 30;
    int choice = 0;
    double total = 0;
    int itemsPurchased = 0;
    int mCounter = 0;
    int kCounter = 0;
    int hCounter = 0;
    int lCounter = 0;



    while (choice != 5) {
        System.out.println("\n==SIMPLE STORE==");
        System.out.println("1.Mouse - $20");
        System.out.println("2.Keyboard - $40");
        System.out.println("3.Headphones - $50");
        System.out.println("4.Laptop stand - $30");
        System.out.println("5.Checkout");
        System.out.print("\nChoose a product: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("\nYou selected: Mouse");
            System.out.println("Price: $20");
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity > 0) {

                double itemCost = quantity * mousePrice;
                if (quantity >= 5) {
                    itemCost = itemCost * 0.95;
                }
                itemsPurchased = itemsPurchased + quantity;
                total = total + itemCost;
                System.out.println(quantity + " * $" + mousePrice + " = $" + itemCost);
                System.out.println("\nAdded to your cart!");
                System.out.println("Current total: $" + total);
                mCounter = mCounter + quantity;
            } else {
                System.out.println("Invalid quantity");
                System.out.println("Quantity must be greater than 0");
            }


        } else if (choice == 2) {
            System.out.println("\nYou selected: Keyboard");
            System.out.println("Price: $40");
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity > 0) {

                double itemCost = quantity * keyboardPrice;
                if (quantity >= 5) {
                    itemCost = itemCost * 0.95;
                }
                itemsPurchased = itemsPurchased + quantity;
                total = total + itemCost;
                System.out.println(quantity + " * $" + keyboardPrice + " = $" + itemCost);
                System.out.println("\nAdded to your cart!");
                System.out.println("Current total: $" + total);
                kCounter = kCounter + quantity;
            } else {
                System.out.println("Invalid quantity");
                System.out.println("Quantity must be greater than 0");
            }
        } else if (choice == 3) {
            System.out.println("\nYou selected: Headphones");
            System.out.println("Price: $50");
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity > 0) {

                double itemCost = quantity * headphonesPrice;
                if (quantity >= 5) {
                    itemCost = itemCost * 0.95;
                }
                itemsPurchased = itemsPurchased + quantity;
                total = total + itemCost;
                System.out.println(quantity + " * $" + headphonesPrice + " = $" + itemCost);
                System.out.println("\nAdded to your cart!");
                System.out.println("Current total: $" + total);
                hCounter = hCounter + quantity;
            } else {
                System.out.println("Invalid quantity");
                System.out.println("Quantity must be greater than 0");
            }
        } else if (choice == 4) {
            System.out.println("\nYou selected: Laptop stand");
            System.out.println("Price: $30");
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity > 0) {

                double itemCost = quantity * laptopStandPrice;
                if (quantity >= 5) {
                    itemCost = itemCost * 0.95;
                }
                itemsPurchased = itemsPurchased + quantity;
                total = total + itemCost;
                System.out.println(quantity + " * $" + laptopStandPrice + " = $" + itemCost);
                System.out.println("\nAdded to your cart!");
                System.out.println("Current total: $" + total);
                lCounter = lCounter + quantity;
            } else {
                System.out.println("Invalid quantity");
                System.out.println("Quantity must be greater than 0");
            }
        }
        else if (choice == 5) {
            break;
        } else {
            System.out.println("Invalid option");
            System.out.println("Choose number from 1 to 5");
        }


    }

    System.out.println("==CHECKOUT==");

    double subtotal = total;
    double discount = 0;

    System.out.println("Items purchased: " + itemsPurchased);
    System.out.println("Subtotal: $" + subtotal);

    if (subtotal >= 200) {
        discount = subtotal * 0.15;
        System.out.println("You received a 15% discount!");
    }
    else if (subtotal >= 100) {
        discount = subtotal * 0.10;
        System.out.println("You received a 10% discount!");
    }
    double finalTotal = subtotal - discount;

    System.out.println("Discount: $" + discount);
    System.out.println("Final total: $" + finalTotal);

    double payment = 0;

    while (payment < finalTotal) {
        System.out.println("Enter payment amount: ");
        payment = sc.nextDouble();
        if (payment < finalTotal) {
            System.out.println("Insufficient payment");
            System.out.println("You still need to pay: $" + (finalTotal - payment));
        }
    }

    System.out.println("Payment successful!");
    System.out.println("Change: $" + (payment - finalTotal));

    System.out.println("\n=====================");
    System.out.println("    SIMPLE STORE    ");
    System.out.println("=====================");

    System.out.println("\n==== ITEMS PURCHASED====");
    System.out.println("Mouse: " + mCounter);
    System.out.println("Keyboard: " + kCounter);
    System.out.println("Headphones: " + hCounter);
    System.out.println("Laptop Stand: " + lCounter);
    System.out.println("Total purchased: " + itemsPurchased);


    if (mCounter > kCounter && mCounter > hCounter && mCounter > lCounter) {
        System.out.println("Most purchased product: Mouse");
        System.out.println("Quantity: " + mCounter);
    } else if  (kCounter > mCounter && kCounter > hCounter && kCounter > lCounter) {
        System.out.println("Most purchased product: Keyboard");
        System.out.println("Quantity: " + kCounter);
    } else if (hCounter > mCounter && hCounter > kCounter && hCounter > lCounter) {
        System.out.println("Most purchased product: Headphones");
        System.out.println("Quantity: " + hCounter);
    } else if (lCounter > mCounter && lCounter > kCounter && lCounter > hCounter) {
        System.out.println("\nMost purchased product: Laptop Stand");
        System.out.println("Quantity: " + lCounter);
    }

    if(itemsPurchased >= 10) {
        System.out.println("\nYou earned a $10 coupon for your next visit!");
    }

    System.out.println("\nSubtotal: $" + subtotal);
    System.out.println("Discount: $" + discount);
    System.out.println("Final total: $" + finalTotal);
    System.out.println("Payment: $" + payment);
    System.out.println("Change: $" + (payment - finalTotal));
    System.out.println("\n=====================");
    System.out.println("Thank you for shopping!");
    System.out.println("=====================");

    sc.close();
}