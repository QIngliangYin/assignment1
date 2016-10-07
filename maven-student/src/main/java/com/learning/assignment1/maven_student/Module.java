//Qingliang Yin 13101588
package com.learning.assignment1.maven_student;

import java.util.ArrayList;

public class Module {

	private String Mname;
	private String MID;
	private ArrayList<Student> Students;

	//constructor
	public Module(){
		
	}
	
	public Module(String mname,String mid){
		Mname = mname;
		MID = mid;
		Students = new ArrayList<Student>();
	}
	
	public Module(String mname,String mid,ArrayList<Student> students){
		Mname = mname;
		MID = mid;
		Students = students;
	}
	public void addStudent(Student s){
		Students.add(s);
	}
	
	public ArrayList<Student> getStudents(){
		return Students;
	}
	
	public String getMname(){
		return Mname;
	}
	
	public String getMID(){
		return MID;
	}
}