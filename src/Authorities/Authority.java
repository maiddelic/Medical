package Authorities;

public abstract class Authority {
	protected String name;
	protected String id;
	
	
	public String getName(){
		return name;
	}
	public void setName(String name1){
		name = name1;
	}
	public String getId(){
		return id;
	}
	public void setId(String id1){
		id = id1;
	}
	
}
