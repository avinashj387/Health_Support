package com.Health.health.Support.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String DOB;
    private String name;
    private String bloodGroup;
    private int age;
    private String gender;
    private String weight;
    private String height;
    private String emailId;
    private String mobileNumber;
    private String password;
	private String token;
    public User() {
        super();
    }
	public User(long id, String dOB, String name, String bloodGroup, int age, String gender, String weight,
			String height, String emailId, String mobileNumber, String password,String token) {
		super();
		this.id = id;
		DOB = dOB;
		this.name = name;
		this.token= token;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	public User(String dOB, String name, String bloodGroup, int age, String gender, String weight, String height,
			String emailId, String mobileNumber, String password) {
		super();
		DOB = dOB;
		this.name = name;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setToken(String token) {
	    this.token = token;
	}

	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

}