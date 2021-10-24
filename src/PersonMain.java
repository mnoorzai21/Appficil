
public class PersonMain {
	
	public static void main(String[]args) {
		
		Person p = new Person();
		
		p.setName("Nabi");
		p.setAge(36);
		
		Student s = new Student();
		s.setName("nabi");
		s.setStudentId(5722009);
		
		System.out.println(p.getName().toUpperCase() + " is " + p.getAge());
		System.out.println(s.getName().toUpperCase() + " is a student and SDID is " + s.getStudentId());
	}

}
