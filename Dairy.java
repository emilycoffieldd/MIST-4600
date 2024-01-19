package FinalProject;
import java.util.*;
import java.util.Scanner;
public class Dairy extends GroceryItem{
	protected double storageTemp;
	protected boolean hasEggs;
	protected boolean containsLactose;
	public double getStorageTemp() {
		return storageTemp;
	}
	public void setStorageTemp(double storageTemp) {
		this.storageTemp = storageTemp;
	}
	public boolean isHasEggs() {
		return hasEggs;
	}
	public void setHasEggs(boolean hasEggs) {
		this.hasEggs = hasEggs;
	}
	public boolean isContainsLactose() {
		return containsLactose;
	}
	public void setContainsLactose(boolean containsLactose) {
		this.containsLactose = containsLactose;
	}
	

}
