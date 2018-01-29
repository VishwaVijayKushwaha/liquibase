package in.vv.example.simple.responseVO;

public class HelloResponse {
	
	private String name;
	private String message;
	
	public HelloResponse() {
		super();
	}
	public HelloResponse(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "HelloResponse [name=" + name + ", message=" + message + "]";
	}
	
}
