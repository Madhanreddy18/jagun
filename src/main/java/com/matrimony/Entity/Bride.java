package com.matrimony.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Bride {

	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long brideid;
    private String name;
    private long age;
    private String education;
    private String profession;
    private String Religion;
    private float height;
    private long weight;
    private String language;
    private long phoneNumber;
    private String location;
    private String country;
    private String maritalStatus;
    private String divorsed;
    private String widowed;
	public Bride() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bride(long brideid, String name, long age, String education, String profession, String religion,
			float height, long weight, String language, long phoneNumber, String location, String country,
			String maritalStatus, String divorsed, String widowed) {
		super();
		this.brideid = brideid;
		this.name = name;
		this.age = age;
		this.education = education;
		this.profession = profession;
		Religion = religion;
		this.height = height;
		this.weight = weight;
		this.language = language;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.country = country;
		this.maritalStatus = maritalStatus;
		this.divorsed = divorsed;
		this.widowed = widowed;
	}
	public long getBrideid() {
		return brideid;
	}
	public void setBrideid(long brideid) {
		this.brideid = brideid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getReligion() {
		return Religion;
	}
	public void setReligion(String religion) {
		Religion = religion;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDivorsed() {
		return divorsed;
	}
	public void setDivorsed(String divorsed) {
		this.divorsed = divorsed;
	}
	public String getWidowed() {
		return widowed;
	}
	public void setWidowed(String widowed) {
		this.widowed = widowed;
	}
	@Override
	public String toString() {
		return "Bride [brideid=" + brideid + ", name=" + name + ", age=" + age + ", education=" + education
				+ ", profession=" + profession + ", Religion=" + Religion + ", height=" + height + ", weight=" + weight
				+ ", language=" + language + ", phoneNumber=" + phoneNumber + ", location=" + location + ", country="
				+ country + ", maritalStatus=" + maritalStatus + ", divorsed=" + divorsed + ", widowed=" + widowed + "]";
	}
    
    
    
    
}
