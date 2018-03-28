
public abstract class Type {

	public static int ID=0;
	
	private int id;
	private String name;
	
	public Type(String name) {
		this.name=name;
		this.id = ID++;
	}
	
}
