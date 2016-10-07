//Qingliang Yin 13101588
package com.learning.assignment1.maven_student;

import java.util.ArrayList;
import org.joda.time.*;

public class Course {

	private String Cname;
	private String CID;
	private ArrayList<Module> Modules;
	private DateTime StartTime;
	private DateTime EndTime;
	
	//constructor
	public Course(){
		
	}
	
	public Course(String cname,String cid,ArrayList<Module> modules,DateTime start,DateTime end)
	{
		Cname=cname;
		CID=cid;
		Modules=modules;
		StartTime=start;
		EndTime=end;
	}
	
	public Course(String cname,String cid,DateTime start,DateTime end)
	{
		Cname=cname;
		CID=cid;
		Modules=new ArrayList<Module>();
		StartTime=start;
		EndTime=end;
	}
	
	public void addModule(Module module){
		Modules.add(module);
	}
	
	public ArrayList<Module> getModules(){
		return Modules;
	}
	
	public String getName(){
		return Cname;
	}
	
	public String getID(){
		return CID;
	}
	
	public DateTime getStart(){
		return StartTime;
	}
	
	public DateTime getEnd(){
		return EndTime;
	}
	
}
