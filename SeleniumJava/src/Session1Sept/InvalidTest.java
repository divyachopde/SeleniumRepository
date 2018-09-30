package Session1Sept;

public class InvalidTest {
	
	String name;
	String value;
	String errmsg;
	public InvalidTest(String name, String value, String errmsg) {
		super();
		this.name = name;
		this.value = value;
		this.errmsg = errmsg;
	}
	@Override
	public String toString() {
		return "InvalidTest [name=" + name + ", value=" + value + ", errmsg=" + errmsg + "]";
	}
	
	

}
