package co.edureka.bean;

public class Connection {
	
	String url;
	String user;
	String password;
	
	public Connection() {
		System.out.println(">> Connection Object Constrcuted - Default Constructor");
	}
	
	public Connection(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		System.out.println(">> Connection Object Constrcuted - Parameterized Constructor");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", user=" + user + ", password=" + password + "]";
	}
	
	// myInit can be any name of your choice
	// and must be public
	public void myInit() {
		System.out.println(">> myInit executed");
	}
	
	// myDestroy can be any name of your choice
	// and must be public
	public void myDestroy() {
		System.out.println(">> myDestroy executed");
	}

}
