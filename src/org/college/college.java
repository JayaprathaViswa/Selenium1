package org.college;

public class college {
public void collegeName() {
System.out.println("Saranathan College");
}
public void collegecode() {
System.out.println("12343");
}
public void collegerank() {
System.out.println("Rank:2");
}
public static void main(String[] args) {
	college n= new college();
	n.collegeName();
	n.collegecode();
	n.collegerank();
	DeptName d= new DeptName();
	d.deptName();
	Hostel h= new Hostel();
	h.hostelname();
	Student s = new Student();
	s.studentDept();
	s.studentId();
	s.studentName();
	
	s.studentId();
	
	
	
}
}
