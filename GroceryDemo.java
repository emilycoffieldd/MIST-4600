package FinalProject;

import java.util.*;
public class GroceryDemo {
	public static void main(String[] args) {
		
		//scanner for use interaction
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello User, Welcome to The Grocery Store Inventory Program");
		
		//prompt the user to input each aspect of the store as modeled below with the name
		
		System.out.println("Lets get started by creating your Grocery Store");
		
		
		GroceryStore demoStore= new GroceryStore(); // instantiation of the store
		
		System.out.println("What is the name of your store?"); // prompt user
		
			String storeName = input.nextLine(); // collect input
			demoStore.setStoreName(storeName); // attach input to the object
		
			System.out.println("Store is named " + storeName); // tell the user what they just did
			
			
			// the rest of this should match
		
		System.out.println("Where is your store located?"); //prompt user
		
			String storeLocation = input.nextLine(); // collect input
			demoStore.setStoreLocation(storeLocation); // attach input to object
		
			System.out.println("Store is located in " + storeLocation); 	// tell the user what they just did
			
			
		// Now, the application should run until the user is ready to be done.
			System.out.println("Would you like to...");
			System.out.println("1. Log a delivery truck");
			System.out.println("2. Update inventory after receiving a delivery truck");
			System.out.println("3. Remove expired food from Database");
			System.out.println("4. Review a full printed list of inventory");
			System.out.println("5. Input discontinued item(s).");
			System.out.println("6. Input store layout.");
			System.out.println("7. Stop Running the program");
			
			System.out.println("Type 1-7");
			int action= input.nextInt();
			// create a while loop that prompts the user to enter the option they want to do
			while(action !=7) {
				// create an if/else tree for each of those options
				if(action == 1) {
					demoStore.deliveryLog();
					System.out.println("Delivery truck logged.");
				}
				else if(action==2) {
					demoStore.deliveryTruck(input);
					System.out.println("Delivery received, and inventory updated.");
				}
				else if(action==3){
					System.out.println("Enter the date as MM/DD/YYYY:");
					Scanner demoScnr= new Scanner(System.in);
					String todaysDate= demoScnr.nextLine();
					demoStore.expiration(todaysDate);
					System.out.println("Items having expired on "+ todaysDate+ " have been removed from the database.");
				}
				else if(action==4) {
					demoStore.print();
					System.out.println("Inventory summary complete.");
				}
				else if(action==5) {
					demoStore.discontinued();
				}
				else if(action==6) {
					demoStore.storeLayout();
				}
				else {
					System.out.println("Invalid Input");
					
				}
				// make sure one of the branches allows the user to end the program. 
				System.out.println("Would you like to...");
				System.out.println("1. Log a delivery truck");
				System.out.println("2. Update inventory after receiving a delivery truck");
				System.out.println("3. Remove expired food from Database");
				System.out.println("4. Review a full printed list of inventory");
				System.out.println("5. Input discontinued item(s).");
				System.out.println("6. Input store layout.");
				System.out.println("7. Stop Running the program");
				
				System.out.println("Type 1-7");
				action= input.nextInt();
				}
			}
		
			
			 
}