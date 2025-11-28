import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza = null;
        boolean isDeluxe = false;

        System.out.println("\nWelcome to Pizza Order System 🍕");
        System.out.println("Choose your Pizza type:");
        System.out.println("1. Veg Pizza (₹300)");
        System.out.println("2. Non-Veg Pizza (₹400)");
        System.out.println("3. Deluxe Veg Pizza (₹300 + Cheese + Topping)");
        System.out.println("4. Deluxe Non-Veg Pizza (₹400 + Cheese + Topping)\n");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                pizza = new Pizza(true);
                break;
            case 2:
                pizza = new Pizza(false);
                break;
            case 3:
                pizza = new DeluxePizza(true);
                isDeluxe = true;
                break;
            case 4:
                pizza = new DeluxePizza(false);
                isDeluxe = true;
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        int option;
        do {
            System.out.println("\n--- Menu ---");
            if (!isDeluxe) {
                System.out.println("1. Add Extra Cheese (+₹100)");
                System.out.println("2. Add Extra Topping (+₹150)");
            }
            System.out.println("3. Add Takeaway Parcel (+₹20)");
            System.out.println("4. View Bill");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            if (isDeluxe) {
                switch (option) {
                    case 3:
                        pizza.takeAway();
                        System.out.println("✅ Takeaway added.");
                        break;
                    case 4:
                        System.out.println("\n--- Your Bill ---");
                        System.out.println(pizza.getBill());
                        break;
                    case 5:
                        System.out.println("Thank you for ordering! Goodbye 👋");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } else {
                switch (option) {
                    case 1:
                        pizza.addExtraCheese();
                        System.out.println("✅ Extra cheese added.");
                        break;
                    case 2:
                        pizza.addExtraTopping();
                        System.out.println("✅ Extra topping added.");
                        break;
                    case 3:
                        pizza.takeAway();
                        System.out.println("✅ Takeaway added.");
                        break;
                    case 4:
                        System.out.println("\n--- Your Bill ---");
                        System.out.println(pizza.getBill());
                        break;
                    case 5:
                        System.out.println("Thank you for ordering! Visit again");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        } while (option != 5);

        sc.close();
    }
}