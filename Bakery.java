package FinalProject;
import java.util.*;
import java.util.Scanner;
public class Bakery extends GroceryItem{
	boolean hasEggs;
	boolean madeInHouse;
	String grain;
	boolean gF;
	public boolean isHasEggs() {
		return hasEggs;
	}
	public void setHasEggs(boolean hasEggs) {
		this.hasEggs = hasEggs;
	}
	public boolean isMadeInHouse() {
		return madeInHouse;
	}
	public void setMadeInHouse(boolean madeInHouse) {
		this.madeInHouse = madeInHouse;
	}
	public String getGrain() {
		return grain;
	}
	public void setGrain(String grain) {
		this.grain = grain;
	}
	public boolean isgF() {
		return gF;
	}
	public void setgF(boolean gF) {
		this.gF = gF;
	}
	

}
