
public class Attribute {

	private String name;
	private Type type;
	private Attribute foreignKey;
	
	public Attribute(String name,Type type) {
		this.name = name;
		this.type=type;
	}
}
