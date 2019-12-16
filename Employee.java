package jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Emp")
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(propOrder= {"name", "age", "role", "gender"}) //XML 스키마 이름 정의. 요소들의 표현 순서 정의
public class Employee {
	@XmlAttribute
	private int id=1;
	private String gender="Female";
	private int age=24;
	private String name="jiah";
	private String role="developer";
	@XmlTransient
	private String password="sesitive";
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@XmlTransient
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    @Override
    public String toString() {
        return "ID = " + id + " NAME=" + name + " AGE=" + age + " GENDER="
                + gender + " ROLE=" + role + " PASSWORD=" + password;
    }
}
