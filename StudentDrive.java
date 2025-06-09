class StudentDrive
{
	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.full_name = "Abhishek Pulate";
		s1.mobile_no = "9999999999";
		s1.address = "Erandwane,Pune";
		s1.branch = "CSE";
		s1.cgpa = 7.5;
		s1.course = "Java Full Stack";
		s1.displayStudent();

		System.out.println("---------------------------------");

		Student s2 = new Student();
		s2.full_name = "Dinesh Gawande";
		s2.mobile_no = "8888888888";
		s2.address = "kothrud,Pune";
		s2.branch = "CSE";
		s2.cgpa = 8.5;
		s2.course = "Python Full Stack";
		s2.displayStudent();
	}
}
	