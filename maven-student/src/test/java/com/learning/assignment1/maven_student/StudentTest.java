//Qingliang Yin 13101588
package com.learning.assignment1.maven_student;

import junit.framework.Assert;
import junit.framework.TestCase;

public class StudentTest extends TestCase {

	public void testGetUsername() {
		Student student;
		student = new Student("a","1","1","1");
		String result = student.getUsername();
		System.out.println(result);
		Assert.assertEquals("a1", result);
	}

}
