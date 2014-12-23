package Authorities;

public class Doctor extends Authority {
	private String division;
	
	public Doctor(String name, String id, String division){
		this.name = name;
		this.id = id;
		this.division = division;
	}
	public String getDivision(){
		return division;
	}
	public void changeDivision(String newDivision){
		division = newDivision;
	}
}

