import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        menu();
    }
    private static void menu() throws IOException {

        int option;

        do {
            System.out.println("""
                    What would you like to do?
                    1- Create Flower Shop.
                    2. Add a tree.
                    3. Add a flower.
                    4. Add a decoration.
                    5. Print all the stock from the flower shop.
                    6. Remove tree.
                    7. Remove flower.
                    8. Remove decoration.
                    9. Print stock & quantities.
                    10. Print full flower shop value.
                    11. Create a purchase ticket.
                    12. Print old purchases.
                    13. Print total sum of all purchases.
                    Choose an option""");

            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option){
                case 1 -> MenuOptions.createFlowerShop();
                case 2 -> MenuOptions.addTree();
                case 3 -> MenuOptions.addFlower();
                case 4 -> MenuOptions.addDecoration();
                case 5 -> MenuOptions.printAllStock();
                case 6 -> MenuOptions.removeProduct("tree");
                case 7 -> MenuOptions.removeProduct("flower");
                case 8 -> MenuOptions.removeProduct("decoration");
                case 9 -> MenuOptions.printStockAndQuantities();
                case 10 -> MenuOptions.printFullValue();
                case 11 -> MenuOptions.createPurchaseTicket();
                case 12 -> MenuOptions.printOldPurchases();
                case 13 -> MenuOptions.printTotalSumPurchases();
            }
        } while (option != 0);

        String name;

    }}