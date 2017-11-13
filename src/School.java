import java.util.ArrayList;


public class School {
	
	//Variables for this class
	Library library;
	ArrayList<Student> students = new ArrayList<Student>();
	int numStudents = 0;
	String name = "Unknown School";
	int MAX_STUDENTS = 0;

	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 * Use the library class for reference.
	 * 
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 * 
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 * 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */
	public static void main(String args[]) {
		//TODO create a school (similar to the library)
		School mySchool = new School("Hogwarts", 7500);
		
		mySchool.AddSingleStudent("Harry", "Potter", Student.Gender.MALE, 1);
		
		mySchool.AddSingleStudent("Draco", "Malfoy", Student.Gender.MALE, 1);
		
		mySchool.AddSingleStudent("Hermy", "Granger", Student.Gender.FEMALE, 1);
		
		mySchool.AddSingleStudent("Fred", "Wesley", Student.Gender.MALE, 3);
		
		mySchool.AddSingleStudent("George", "Wesley", Student.Gender.MALE, 3);
		
		mySchool.AddSingleStudent("Serge", "Ilinskiy", Student.Gender.MALE, 3);
		
		mySchool.removeSingleStudent();
		
		//TODO Print the toString method in school. Such as, school.toString()
		System.out.println(mySchool.toString());
		
		//TODO Print any other variables that make sense for a school. Be creative.
				
		System.out.println(mySchool.getInfo());
	}
	
	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
	public School(String name, int maxStudents) {
		this.name = name;
		this.MAX_STUDENTS = maxStudents;
		this.library = new Library ();
	}
	
	/**
	 * Write a method to return a list of all books at the school
	 */
	public String toString() {
		//TODO Write a method to return a list of all books at the school
		String returnString = "School: '" + this.name + "'\n  School library:\n";	
		returnString += library;
		
		return returnString;
	}
	
	/**
	 * adds a single student to the school
	 */
	public void AddSingleStudent(String firstName, String lastName, Student.Gender gender, int grade) {
		if(numStudents < MAX_STUDENTS) {
			numStudents++;
			students.add(new Student (firstName, lastName, gender, grade));
			
		}
		//Do I need a MAX_STUDENTS ??? Yees? 
	}
	
	/**
	 * removes a single student from the school
	 */
	public void removeSingleStudent() {
		if(numStudents > 0) {
			numStudents--;
			students.remove(students.size()-1);
			
		}
	}
	
	/**
	 * method to return number of students
	 * 
	 * @return number of students in the school
	 */
	public int getStudents() {
		return numStudents;
	}
	
	public String getInfo() {
		String returnString = "School: '" + this.name + "', number of students " + this.numStudents + " of capasity " + this.MAX_STUDENTS;
		
		returnString += "\nStudents:\n";
		for (Student s : students ) {
			returnString += "    " + s + "\n";
		}
		return returnString;
	}
}
