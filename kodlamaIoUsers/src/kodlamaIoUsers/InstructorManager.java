package kodlamaIoUsers;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.id +" e�itmen kullan�c�s� eklendi");
	}
}
