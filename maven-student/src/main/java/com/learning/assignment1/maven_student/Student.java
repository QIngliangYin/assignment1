//Qingliang Yin 13101588
package com.learning.assignment1.maven_student;

public class Student 
{
	private String Name;
	private String Age;
	private String DOB;
	private String ID;
	private String username;
	
	//constructor
	public Student(){
		
	}
	public Student(String name,String age,String dob,String id)
	{
		Name = name;
		Age = age;
		DOB = dob;
		ID = id;
		username = getUsername();
	}
    public String getUsername() {
		return Name+Age;
	}
    
    public String getName(){
    	return Name;
    }
    
    public String toString(){
    	return Name+' '+Age+' '+DOB+' '+ID+' '+username;
    }
}
