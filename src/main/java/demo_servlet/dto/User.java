package demo_servlet.dto;

public class User {
	private int id;
	private String name;
	private String email;
	private String pwd;
	private Double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "\nUser [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", sal=" + sal + "]";
	}
	public User(int id, String name, String email, String pwd, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.sal = sal;
	}
	public User() {
		super();
	}
	
}
