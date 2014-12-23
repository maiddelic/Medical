package Authorities;

public class Nurse extends Authority{
	private String division;
	
	public Nurse(String name, String id, String division){
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
