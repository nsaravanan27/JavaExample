package blog.javappu.javasamples.clone;

/**
 * 
 * @author Saravanan
 *
 */
public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student = new Student("Appu");
		System.out.println(student.getName());
		
		Student cloneStudent = student.clone();
		System.out.println(cloneStudent.getName());
		
	}
}


