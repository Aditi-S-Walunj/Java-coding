package com.pqr;

class Teacher{
	String TeacherName;
	String TeacherSubName;
Teacher()
	{
		System.out.println("I am default Constructor");
	}
Teacher(String teacherName) 
	{
		this("Thakrey Sir","JAVA");
		TeacherName = teacherName;
		System.out.println(TeacherName);
	}
Teacher(String teacherName, String teacherSubName) 
	{
		TeacherName = teacherName;
		TeacherSubName = teacherSubName;
		System.out.println(TeacherName);
		System.out.println(TeacherSubName);	
	}
}
class Student extends Teacher{
	int StudRoll;
	String StudentName;
Student()
	{
		super("Mande sir");
	}
Student(int studRoll, String studentName) {
		StudRoll = studRoll;
		StudentName = studentName;
		System.out.println(StudRoll+" and "+StudentName);
	}
}
public class SuperWithConstructor {
	public static void main(String[] args) {
		Student s1 = new Student();
	}
}
