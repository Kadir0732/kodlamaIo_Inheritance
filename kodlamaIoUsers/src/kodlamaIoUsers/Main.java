package kodlamaIoUsers;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		Instructor instructor = new Instructor();
		instructor.id = 2;
		LoginManager loginManager = new LoginManager();
		loginManager.login(new StudentManager(), student);
		loginManager.login(new InstructorManager(), instructor);
		
	}

}
