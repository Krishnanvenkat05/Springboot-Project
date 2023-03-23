package com.krishnan.Springboot.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bankdata {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountNo;
	private String accholdname;
	private String location;

	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccholdname() {
		return accholdname;
	}
	public Bankdata(String accholdname, String location) {
		super();
		this.accholdname = accholdname;
		this.location = location;
	}
	
	public Bankdata() {
		
	}
	public void setAccholdname(String accholdname) {
		this.accholdname = accholdname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
