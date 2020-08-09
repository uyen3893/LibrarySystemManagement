package LibraryCore;

import java.time.LocalDateTime;
import java.util.UUID;

public class Users {
	public UUID codeUser;
	
	public UUID getCodeUser() {
		return codeUser;
	}

	public void setCodeUser(UUID codeUser) {
		this.codeUser = codeUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCountNumberOfBorrow() {
		return countNumberOfBorrow;
	}

	public void setCountNumberOfBorrow(int countNumberOfBorrow) {
		this.countNumberOfBorrow = countNumberOfBorrow;
	}

	public LocalDateTime getCreateCardDate() {
		return createCardDate;
	}

	public void setCreateCardDate(LocalDateTime createCardDate) {
		this.createCardDate = createCardDate;
	}

	public LocalDateTime getReturnCardDate() {
		return returnCardDate;
	}

	public void setReturnCardDate(LocalDateTime returnCardDate) {
		this.returnCardDate = returnCardDate;
	}

	public String name;
	public LocalDateTime birthDate;
	public String CMND;
	public boolean gender;
	public String email;
	public int countNumberOfBorrow;
	public LocalDateTime createCardDate;
	public LocalDateTime returnCardDate;
	
	public Users(){
		codeUser = UUID.randomUUID();
		name = "";
		birthDate = LocalDateTime.now();
		CMND = "000000000";
		email = "abc@agc.com";
		countNumberOfBorrow = 0;
		createCardDate = LocalDateTime.now();
		returnCardDate = LocalDateTime.now();
		
	}
	
	public Users(UUID CodeUser, String Name, LocalDateTime BirthDate, String CMND, String Email, int CountNumberOfBorrow, LocalDateTime CreateCardDate, LocalDateTime ReturnCardDate) {
		this.codeUser = CodeUser;
		this.name = Name;
		this.birthDate = BirthDate;
		this.CMND = CMND;
		this.email = Email;
		this.createCardDate = CreateCardDate;
		this.returnCardDate = ReturnCardDate;
		this.countNumberOfBorrow = CountNumberOfBorrow;
	}
	
	public Users(String Name, LocalDateTime BirthDate, String CMND, String Email, int CountNumberOfBorrow, LocalDateTime CreateCardDate, LocalDateTime ReturnCardDate) {
		this.name = Name;
		this.birthDate = BirthDate;
		this.CMND = CMND;
		this.email = Email;
		this.createCardDate = CreateCardDate;
		this.returnCardDate = ReturnCardDate;
		this.countNumberOfBorrow = CountNumberOfBorrow;
	}
	
	

}
