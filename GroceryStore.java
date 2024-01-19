package FinalProject;
import java.util.*;
public class GroceryStore {
private String StoreName;	
private String StoreLocation;
private HashMap<String, GroceryItem> storeDatabase;
private HashSet<String> discontinued;
private String[] storeLayout;
private ArrayList<String> deliveryLog = new ArrayList<String>();
	
public GroceryStore() {
	this.storeDatabase = new HashMap<String, GroceryItem>();
	this.discontinued = new HashSet<String>();
	this.deliveryLog = new ArrayList<String>();
	
	System.out.println("To continue setting up you store, there are some additional items that require your attention");
	System.out.println("Be sure to populate your store database with the delivery Truck method");
	System.out.println("The Discontinued, DeliveryLog, and StoreLayout method can be used to define those aspects of your store.");
	
	
}
// Create constructor for naming store
public GroceryStore(String storeName, String storeLocation) {
	
	StoreName = storeName;
	StoreLocation = storeLocation;
	
	System.out.println("To continue setting up you store, there are some additional items that require your attention");
	System.out.println("Be sure to populate your store database with the delivery Truck method");
	System.out.println("The Discontinued, DeliveryLog, and StoreLayout method can be used to define those aspects of your store.");
}
	
//returns a reference to the StoreDatabase hasSet
	public HashMap<String, GroceryItem> getStoreDatabase(){
		return storeDatabase;
	}
	
	
	
	
	// Getters and setters for Store Name and Location
	public String getStoreName() {
		return StoreName;
	}
	public void setStoreName(String storeName) {
		StoreName = storeName;
	}
	public String getStoreLocation() {
		return StoreLocation;
	}
	public void setStoreLocation(String storeLocation) {
		StoreLocation = storeLocation;
	}
	//_____________________________________________________________
	
	
	//Set items expected
	public void deliveryTruck(Scanner kboard)
	{
		System.out.println("How many items are getting delivered?");
		
		int numItems = kboard.nextInt();
		kboard.nextLine();
		
		
		
		
		//iterate through number of items expected
		for(int i =0; i<numItems; i++) {
			
			System.out.println("Enter next Item Type (Dairy, Produce, Bakery, Frozen):");
			@SuppressWarnings("resource")
			Scanner keyboard= new Scanner(System.in);
			String itemType = keyboard.nextLine();
			//runs if item type is dairy
			if (itemType.equals("Dairy")) {
				
				//temporary variables for initialization of the object later
				boolean thisIsVegan = false;
				boolean thisIsOrganic = false;
				//unique variables for dairy. Department specific ones will take its place elsewhere
				boolean thisHasEggs = false;
				boolean thisHasLactose = false;
				
				System.out.println("Enter Item Name:");	
				String name = keyboard.nextLine();
				
				System.out.println("Enter Item Expiration date as text MM/DD/YYYY:");
				String expDate = keyboard.nextLine();
				
				System.out.println("Is the Item Vegan? Type y/n");
				String veganYN = keyboard.next();	
					thisIsVegan= (veganYN.equals("y"));
					
				System.out.println("Is the Item Organic? Type y/n");
				String organicYN = keyboard.next();	
					thisIsOrganic = (organicYN.equals("y"));
					
				//setting attributes of a dairy object	
					
				System.out.println("Enter storage temperature in celsius as a number with two decimal points:");	
				double storageTemp = keyboard.nextDouble();
				
				System.out.println("Does the Item contain eggs? Type y/n");
				String eggsYN = keyboard.next();	
					thisHasEggs =(eggsYN.equals("y"));
					
				System.out.println("Does the Item contain lactose? Type y/n");
					String lactoseYN = keyboard.next();	
						thisHasLactose = (lactoseYN.equals("y") );
					
					Dairy d = new Dairy();
					d.setExpDate(expDate);
					d.setItemName(name);
					d.setVegan(thisIsVegan);
					d.setOrganic(thisIsOrganic);
					d.setStorageTemp(storageTemp);
					d.setHasEggs(thisHasEggs);
					d.setContainsLactose(thisHasLactose);
					
					storeDatabase.put(expDate, d);
					//continue;
					
			}
			
			else if (itemType.equals("Produce")) {
				boolean thisIsVegan = false;
				boolean thisIsOrganic = false;
				
				System.out.println("Enter Item Name:");	
				String name = keyboard.nextLine();
				
				System.out.println("Enter Item Expiration date as text MM/DD/YYYY:");
				String expDate = keyboard.nextLine();
				
				System.out.println("Is the Item Vegan? Type y/n");
				String veganYN = keyboard.nextLine();	
					thisIsVegan= (veganYN.equals("y"));
					
				System.out.println("Is the Item Organic? Type y/n");
				String organicYN = keyboard.nextLine();	
					thisIsOrganic = (organicYN.equals("y"));
					
				System.out.println("Enter storage temperature in celsius as a number with two decimal points:");	
				double storageTemp = keyboard.nextDouble();
				
				System.out.println("Enter in if item is Fruit, Vegetable, or Neither:");
				String fOrV= keyboard.next();
				
				
				Produce p = new Produce();
				p.setExpDate(expDate);
				p.setItemName(name);
				p.setVegan(thisIsVegan);
				p.setOrganic(thisIsOrganic);
				p.setStorageTemp(storageTemp);
				p.setFruitOrVegetable(fOrV);
				
				storeDatabase.put(expDate, p);
				//continue;
				
			}
			
			else if (itemType.equals("Bakery")) {
				
				boolean thisIsVegan = false;
				boolean thisIsOrganic = false;
				String baName= "";
				String baExp= "";
				
				boolean baEggs= true;
				boolean baMadeInHouse= false;
				String baGrain= "";
				boolean baGF= false;
				
				System.out.println("Enter Item Name:");
				baName= keyboard.nextLine();
				
				System.out.println("Enter Item Expiration date as text MM/DD/YYYY:");
				baExp= keyboard.nextLine();
				
				System.out.println("Is the Item Vegan? Type y/n");
				String veganYN = keyboard.nextLine();	
					thisIsVegan = (veganYN.equals("y"));
					
				System.out.println("Is the Item Organic? Type y/n");
				String organicYN = keyboard.nextLine();	
					thisIsOrganic = (organicYN.equals("y"));
					
					
				System.out.println("Does this item contain eggs? Type y/n");
				String eggYN = keyboard.nextLine();	
					baEggs = (eggYN.equals("y"));
						
						
				System.out.println("Is this item made in house? Type y/n");
				String houseYN = keyboard.nextLine();	
					baMadeInHouse =(houseYN.equals("y"));
							
				
				System.out.println("Enter grain type as white, wheat, multi-grain, rye, sourdough, or unknown:");
				baGrain= keyboard.nextLine();
				
				System.out.println("Is this item gluten-free? Type y/n");
				String gFYN = keyboard.next();
				baGF= (gFYN.equals("y"));
					
				
				
				Bakery b= new Bakery();
				b.setExpDate(baExp);
				b.setItemName(baName);
				b.setVegan(thisIsVegan);
				b.setOrganic(thisIsOrganic);
				b.setHasEggs(baEggs);
				b.setMadeInHouse(baMadeInHouse);
				b.setGrain(baGrain);
				b.setgF(baGF);
				
				storeDatabase.put(baExp, b);
				//continue;
				
			}
			
			else if (itemType.equals("Frozen")) {
				
				boolean thisIsVegan = false;
				boolean thisIsOrganic = false;
				
				System.out.println("Enter Item Name:");
				String froName= keyboard.nextLine();
				
				System.out.println("Enter Item Expiration date as text MM/DD/YYYY:");
				String froExp= keyboard.nextLine();
				
				System.out.println("Is the Item Vegan? Type y/n");
				String veganYN = keyboard.nextLine();	
					thisIsVegan = (veganYN.equals("y"));
					
				System.out.println("Is the Item Organic? y/n");
				String organicYN = keyboard.nextLine();
					thisIsOrganic = (organicYN.equals("y"));
					
				System.out.println("Enter storage temperature in celsius as a number with two decimal points:");
				double froTemp= keyboard.nextDouble();
				
				
				
				System.out.println("Enter frozen food type as either pizza, meat, vegetables, dessert, fruit, or none:");
				String froType= keyboard.next();
				
				
				Frozen f= new Frozen();
				f.setExpDate(froExp);
				f.setItemName(froName);
				f.setVegan(thisIsVegan);
				f.setOrganic(thisIsOrganic);
				f.setStorageTemp(froTemp);
				f.setType(froType);
				
				storeDatabase.put(froExp, f);
				//continue;
				
			}
			else {
			System.out.println("Enter Item Name:");
			String name = keyboard.nextLine();
			
			System.out.println("Enter Item Expiration date as text MM/DD/YYYY:");
			String exp= keyboard.next();
				
			GroceryItem e = new GroceryItem();
			e.setItemName(name);
			e.setExpDate(exp);
			storeDatabase.put(exp, e);
			
			//continue;
				
			}
			
		}
	}
	
	public void storeLayout() {
		int i;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many Aisles does your store have?");
		int storeAisles = keyboard.nextInt();
		this.storeLayout = new String[storeAisles];
		System.out.println("Here is your layout");
		
		for(i=1; i<=storeLayout.length; i++) {
			
			System.out.println("Aisle: " + i);
			
		}
		System.out.println("Layout Complete");
	}
	
	
	public void discontinued() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the item you wish to discontinue");
		String discontinuedItem = keyboard.nextLine();
		discontinued.add(discontinuedItem);
	}
	
	public void deliveryLog() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the date of the last Delivery as MM/DD/YYYY");
		String deliveryDate = keyboard.nextLine();
		deliveryLog.add(deliveryDate);
	}
	
	public void expiration(String today) {
		storeDatabase.remove(today);
		
	}
public void print() {
	for(String expo : storeDatabase.keySet()) {
		String key= expo.toString();
		String value= storeDatabase.get(expo).getItemName();
		System.out.println(key+ ", "+ value);
	}
}

}
