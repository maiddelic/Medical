package Authorities;

public class SocialAuthority extends Authority {
	protected String name;
	protected String id;
	
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getId(){
		return id;
	}
	public void setId(String newID){
		id = newID;
	}
}
