

public class Student
{
	private int studentID;
	private int gradeLevel;
	private boolean honorRoll;


	public Student(int s, int g)
	{
		studentID = s;
		gradeLevel = g;
		honorRoll = false;
	}

	public Student(int s)
	{
		studentID = s;
		gradeLevel = 9;
		honorRoll = false;
	}

	public static void main(String []args) {
      System.out.println("Hello World"); // prints Hello World
   
int id = 282828;
int grade = 11;
Student three = new Student(id,grade);
Student one = new Student(12);
Student two = new Student(12,14);

}
}


//Student one = new Student(12);


