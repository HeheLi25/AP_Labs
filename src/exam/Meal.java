package exam;

public class Meal {
	private String mainCourse;
	private String dessert;

	public Meal(String mainCourse, String dessert) {
	this.mainCourse = mainCourse;
	this.dessert = dessert;
	}

	public String getMain() {
		return mainCourse;
	}

	public int hashCode() {
		return mainCourse.hashCode();
	}

	public String toString() {
		return mainCourse + " and " + dessert;
	}
	
	public String getDess(){
		return dessert;
	}

	public boolean equals(Object o) {
		String otherMain = ((Meal) o).getMain();
		String otherDess = ((Meal) o).getDess();
		if (mainCourse.equals(otherMain)) {
			if (dessert.equals(otherDess))
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args){
		String mainDish = "Fish";
		String dessert = "Tiramisu";
		Meal m = new Meal(mainDish,dessert);
		mainDish += " and chips";
		System.out.println(m);
	}

}
