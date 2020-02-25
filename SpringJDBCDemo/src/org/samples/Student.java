package org.samples;

// Model Class or Bean or POJO
public class Student {
	
	// Attributes : Property of Object and now we have attributes also as Objects
	private Integer id; // Pure OOPS | Anytime now pas attributes by reference
	private String name;
	private Integer age;
	
    public Student(){
    	
    }
	
	public Student(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	
}
