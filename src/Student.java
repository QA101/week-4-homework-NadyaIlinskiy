
public class Student {

	String firstName = "";
	String lastName = "";
	Integer grade = 0;
	
	public enum Gender {
	    MALE, FEMALE, HERMAPHRODIT 
	}
	Gender gender = Gender.HERMAPHRODIT;
	
	public Student (String firstName, String lastName, Gender gender, int grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.grade = grade;
	}
	
	public String toString () {
		return firstName + " " + lastName + ", Gender: " + gender + ", Grade: " + grade;
	}
	
}
