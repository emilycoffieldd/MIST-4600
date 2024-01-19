package FinalProject;
import java.util.*;
//import java.util.Scanner;
public class GroceryItem {
	protected String itemName;
	private String expDate;
	private boolean isVegan;
	private boolean isOrganic;
	public GroceryItem() {
		itemName= "TBD";
		expDate= "";
		isVegan= false;
		isOrganic= false;
		
	}
	public GroceryItem(String name, String date, boolean vegan, boolean organic) {
		itemName= name;
		expDate= date;
		isVegan= vegan;
		isOrganic= organic;
		
	}
	public boolean isVegan() {
		return isVegan;
	}
	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
	public boolean isOrganic() {
		return isOrganic;
	}
	public void setOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
		public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	
}
