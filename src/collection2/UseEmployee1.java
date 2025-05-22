package collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee1 {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("Vikram", 24, 45000, "male", true);
		Employee1 emp2 = new Employee1("Abi", 23, 30001, "female", false);
		Employee1 emp3 = new Employee1("Vik", 25, 40001, "male", true);
		Employee1 emp4 = new Employee1("Ram", 29, 50000, "male", false);
		Employee1 emp5 = new Employee1("Nisha", 24, 6000, "female", false);
		HashMap<Integer, Employee1> emp = new HashMap<>();
		emp.put(1, emp1);
		emp.put(2, emp2);
		emp.put(3, emp3);
		emp.put(4, emp4);
		emp.put(5, emp5);
 
		/** KETSET PRINT **/
		for (Integer x : emp.keySet()) {
			System.out.println("KEY="+x);
		}
		
		/** KETSET PRINT **/
		System.out.println("Key:"+emp.keySet());
		
		/** KETSET PRINT USING forEach **/
		emp.keySet().forEach((x) -> System.out.println(x));
		
        /** VALUES PRINT ENHANCED LOOP **/
		for (Employee1 x : emp.values()) {
			System.out.println(x);
		}
		
	    /** VALUES PRINT forEach LOOP **/
		emp.values().forEach(y -> System.out.println(y));

		/** STRING VALUES toUpperCase() **/
		for (Employee1 e : emp.values()) {
			System.out.println(e.getName() + ", " + e.getGender().toUpperCase());
		}

		/** FIND THE MAX SALARY USING Iterator and while**/
		Iterator<Employee1> itr = emp.values().iterator();
		int max = 0;
		while (itr.hasNext()) {
			if (itr.next().getSalary() > max) {
				max = itr.next().getSalary();
			}
		}
		System.out.println("max:"+max);

		/** FIND THE MAX SALARY LIST **/
		Employee1 maxi = emp1;
		for (Employee1 x : emp.values()) {
			if (x.getSalary() > maxi.getSalary()) {
				maxi = x;
			} 
		}
		System.out.println("MAX SALARY LIST="+maxi);

		/** FIND THE MAX SALARY **/
		int ma = 0;
		for (Employee1 x : emp.values()) {
			if (x.getSalary() > ma) {
				ma = x.getSalary();
			}
		}
		System.out.println("MaxSalay:"+ma);

		/** EVEN SALARY NAME ONLY PRINT USING forEach loop **/
		for (Employee1 b : emp.values()) {
			if (b.getSalary() % 2 == 0) {
				System.out.println("NAME="+b.getName());
			}
		}

		/** MINIMUM SALARY 10% INCREMENT IN PRINT THE LIST **/
		Employee1 mini = emp1; 
		for (Employee1 x : emp.values()) {
			if (x.getSalary() < mini.getSalary()) {
				mini = x;
				x.setSalary(mini.getSalary() + mini.getSalary() * 10 / 100);
			}
		}
		System.out.println("Mini 10% Increment="+mini);

		/** MAX SALARY ONLY CERATE ANOTHER LIST  **/
		HashMap<Integer, Employee1> maxList = new HashMap<>();
		int mx = emp1.getSalary();
		for (Integer x : emp.keySet()) {
			if (emp.get(x).getSalary() > mx) {
				mx = emp.get(x).getSalary();
				maxList.put(x, emp.get(x));
			}
		}
		System.out.println("Max Another List ="+maxList);
		
		/** Iterator USING REMOVE THE FEMALE LIST ONELY **/
//		Iterator<Employee1> it = emp.values().iterator();
//		while (it.hasNext()) {
//			if (it.next().getGender().equals("female")) {
//				it.remove();
//			}
//		}
//		emp.forEach((x,y)->System.out.println("Male emp:"+x+"="+y));

		/** FEMALE LIST ONELY CRAETE ANOTHER LIST **/
		HashMap<Integer, Employee1> femaleList = new HashMap<>();
		for (Integer x : emp.keySet()) {
			if (emp.get(x).getGender().equals("female")) {
				femaleList.put(x, emp.get(x));
			}
		}
		femaleList.forEach((x,y)-> System.out.println("Female emp:"+x+"="+y));
	}
} 
 
class Employee1 {
	private String name;
	private int age;
	private int salary; 
	private String gender;
	private boolean isIt;

	public Employee1(String name, int age, int salary, String gender, boolean isIt) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.isIt = isIt;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + ", isIt="
				+ isIt + "]";
	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isIt() {
		return isIt;
	}

	public void setIt(boolean isIt) {
		this.isIt = isIt;
	}

}