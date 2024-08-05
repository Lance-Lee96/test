package ex02_class;

public class StudentMain {
	public static void main(String[] args) {
		
		System.out.println(Student.schoolName);
		Student.goToSchool();
		
		Student stu1 = new Student();
		stu1.studentName = "김고이";
		stu1.hello();
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		System.out.println("-------------------------------------------");
		
		Student stu2 = new Student();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool();
		
		//Arrays 클래스
		//Math 
		
		
		
		
		
	}
}
