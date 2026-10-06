import java.util.Scanner;

public class MainT {

    // Method dengan Wildcard (<?>): menerima Customer dengan tipe ID apa pun.
    // Data hanya dibaca (read-only), tidak diubah.
    public static void displayOrderInfo(Customer<?> customer, FoodOrder order) {
        System.out.println("\n=== Order Information ===");
        System.out.println("Order Code       : " + order.getOrderCode());
        System.out.println("Customer Name    : " + customer.getName());
        System.out.println("Customer ID      : " + customer.getCustomerId());
        System.out.println("Customer ID Type : " + customer.getCustomerId().getClass().getSimpleName());
        System.out.println("Menu Name        : " + order.getMenuName());
        System.out.println("Food Category    : " + order.getCategory());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Food Ordering System ===");
        System.out.print("Enter Customer Name: ");
        String name = input.nextLine();

        // ID dibaca sebagai Long (sesuai output modul: Customer ID Type : Long)
        long id;
        while (true) {
            System.out.print("Enter Customer ID: ");
            try {
                id = Long.parseLong(input.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID harus berupa angka!");
            }
        }

        System.out.print("Enter Order Code: ");
        String orderCode = input.nextLine();
        System.out.print("Enter Menu Name: ");
        String menuName = input.nextLine();

        System.out.println("\nSelect Food Category:");
        FoodCategory[] categories = FoodCategory.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        int choice;
        while (true) {
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(input.nextLine().trim());
                if (choice >= 1 && choice <= categories.length) break;
            } catch (NumberFormatException e) {
                // abaikan, minta input ulang
            }
            System.out.println("Pilihan tidak valid, masukkan 1-" + categories.length + "!");
        }

        Customer<Long> customer = new Customer<>(name, id);
        FoodOrder order = new FoodOrder(orderCode, customer, menuName, categories[choice - 1]);

        displayOrderInfo(customer, order);
        input.close();
    }
}