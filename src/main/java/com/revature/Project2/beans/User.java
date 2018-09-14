package com.revature.Project2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
@SequenceGenerator(name="new_user", sequenceName="NEW_USER_SEQ", initialValue=1, allocationSize=1)
public class User {
	
	//Primary Key for Users Table in Oracle DB
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="new_user")
	@Column(name="U_ID")
	private int uId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="F_NAME")
	private String firstname;
	
	@Column(name="L_NAME")
	private String lastname;
	
	@Column(name="HEIGHT")
	private int height;
	
	@Column(name="WEIGHT")
	private int weight;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="SEX")
	private int sex;
	
	public User() {}
	
	public User(int uId, String username, String password, String email, String firstname, String lastname, int height,
			int weight, int age, int sex) {
		super();
		this.uId = uId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
	}

	//Getter and Setter methods for states of User
	public int getuId() {
		return uId;
	}
	
	public void setuId(int uId) {
		this.uId = uId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	//Custom toString to display User information
	@Override
	public String toString() {
		return "User [uId=" + uId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", height=" + height + ", weight=" + weight
				+ ", age=" + age + ", sex=" + sex + "]";
	}	
}
