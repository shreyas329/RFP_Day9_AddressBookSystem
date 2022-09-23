package Day9;

import java.util.*;

public class AddressBook {

	public static void main(String[] args) {
        System.out.println("Welcome To Address Book System");
        DetailsAddressBook details = new DetailsAddressBook();
        Scanner scanner = new Scanner(System.in);
        Operation operation = new Operation();

        while (true) {

            System.out.println("\n Enter your choice: \n" + "1. Add person     \n" + "2. Edit detail \n"+ "3. Display list \n"+"0. EXIT    \n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operation.addPerson();
                    break;

                case 2:
                	operation.editPerson();
                	break;
                case 3:
                    operation.displayPerson();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
	}
}