package kodlamaIoUsers;



public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.id +" ��renci kullan�c�s� eklendi");
	}
}
