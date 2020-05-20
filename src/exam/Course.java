package exam;

public class Course implements Comparable<Course>{
	private int numOfStudents;
	private String name;
	public Course(String name, int num){
		this.name = name;
		numOfStudents = num;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Course otherCourse) {
		int otherNum = otherCourse.getNumOfStudents();
		if(otherNum > numOfStudents) return 1;
		else if (otherNum < numOfStudents) return -1;
		else return 0;
	}
	public String toString(){
		return name + ": " + numOfStudents;
	}

}
