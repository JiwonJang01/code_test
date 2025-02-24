import java.util.*;
public abstract class Human{

	String gender;
	String name;
	String id;
	String job;
	
	public Human(String gender,String name, String job){
		this.gender = gender;
		this.name = name;
		this.job = job;
		this.id = job + (int)(Math.random()+10000+1);
	}

	abstract public void showRole();

	public void updateInfo(String changeName, String gender){
		this.gender = gender;
		this.changeName = name;
		this.id = this.job + (int)(Math.random()+10000+1);
	}
}
