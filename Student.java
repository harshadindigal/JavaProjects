
public class Student implements Comparable<Student> {
	private double GPA;
	private String name;

	public Student(double gpa, String name) {
		this.GPA = gpa;
		this.name = name;
	}

	public static void main(String[] args) {

	}

	@Override
	public int compareTo(Student o) {
		Double one = new Double(this.GPA);
		Double two = new Double(o.GPA);
		double comparison = one.compareTo(two);
		if (comparison != 0.0) {
			return (int) comparison;
		}
		int comparison1 = this.name.compareTo(o.name);
		if (comparison1 != 0) {
			return comparison1;
		}
		return 0;

	}

}
