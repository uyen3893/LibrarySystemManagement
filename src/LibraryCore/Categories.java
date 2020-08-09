package LibraryCore;

import java.util.UUID;

public class Categories {
	
	public UUID ID;
	public String nameOfCategory;
	public UUID getID() {
		return ID;
	}
	public void setID(UUID ID) {
		this.ID = ID;
	}
	
	public String getNameOfCategory() {
		return nameOfCategory;
	}
	public void setNameOfCategory(String nameOfCategory) {
		this.nameOfCategory = nameOfCategory;
	}
	
	public Categories() {
		
	}
	
	public Categories(UUID ID, String NameOfCategory) {
		this.ID = ID;
		this.nameOfCategory = NameOfCategory;
	}
	
}
