package oops3;

public interface UseCourse {
	public static void main (String[]args) {
		Course c = new OnlineCourse();
		System.out.println(c.CourseFee("java"));
	}
 
}
interface Course {
	public int id (int i);
	public String CourseName (String cn);
	public String CourseTrainer (String ct);
	public String CourseFee (String cf);
}
class OnlineCourse implements Course {
	public int id (int i) {
		return i;
	}
	public String CourseName (String cn) {
		return cn;
	}
	public String CourseTrainer (String ct) {
		return ct;
	}
	public String CourseFee (String cf) {
		
		if(cf.equals("java")) {
			return "20,000";
		}
		else if (cf.equals("Ethical Hacking")) {
			return "8000";
		}
		else if (cf.equals("python")) {
			return "15000";
		}
		else if (cf.equals("SQL")) {
			return "10000";
		}
		else {
			return "Invalid Input";
		} 
	}
	
}