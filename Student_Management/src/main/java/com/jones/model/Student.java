package com.jones.model;

public class Student {
	private int id;
	private String name;
	private String dateOfBirth;
	private String national;
	private String clazz;
	private String school;
	private int nameId;
	public Student() {
		super();
	}

	public Student(int id,int nameId, String name, String dateOfBirth, String national, String clazz, String school) {
		super();
		this.id = id;
		this.nameId=nameId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.national = national;
		this.clazz = clazz;
		this.school = school;
	}
	

	public Student( int nameId, String name,String dateOfBirth, String national, String clazz, String school) {
		super();
		this.nameId=nameId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.national = national;
		this.clazz = clazz;
		this.school = school;
	}
	
	public Student(int nameId) {
		super();
		this.nameId = nameId;
	}

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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getNameId() {
		return nameId;
	}

	public void setNameId(int nameId) {
		this.nameId = nameId;
	}
	
}	
