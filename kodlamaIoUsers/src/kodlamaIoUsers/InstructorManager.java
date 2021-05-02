package kodlamaIoUsers;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.id +" eðitmen kullanýcýsý eklendi");
	}
}
