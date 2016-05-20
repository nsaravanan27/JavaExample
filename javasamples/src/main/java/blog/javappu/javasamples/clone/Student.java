package blog.javappu.javasamples.clone;

/**
 * 
 * @author Saravanan
 * 
 * Student is a simple class which implements Cloneable interface
 *
 */
class Student implements Cloneable {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}
}
