public class Student {

	String firstName = "";
	String lastName = "";
	Integer grade = 0;
	
	public enum Gender {
	    MALE, FEMALE, HERMAPHRODIT 
	}
	Gender gender = Gender.HERMAPHRODIT;
	
	public enum House {
		 Gryffindor, Hufflepuff, Ravenclaw, Slytherin
	}
	House house = House.Gryffindor;
	
	public Student (String firstName, String lastName, Gender gender, int grade, House house) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.grade = grade;
		this.house = house;
	}
	
	public String toString () {
		return firstName + " " + lastName + ", Gender: " + gender + ", Grade: " + grade + ", House: " + house;
	}
	
}
