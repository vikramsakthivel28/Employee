package collection1;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(123, "vikram", "male", 50000, true, "working");
		Employee e2 = new Employee(566, "abi", "female", 45001, false, "notWorking");
		Employee e3 = new Employee(456, "ram", "male", 60000, true, "working");
		Employee e4 = new Employee(789, "vik", "male", 40001, false, "notWorking");
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		// System.out.println(emp);
		// emp.remove(2);
		emp.forEach(x -> {
			if (x.getName().length() >= 5 && x.getGender().equals("male")) {
				// System.out.println(x.getName());
			}
		});
		// Max Salary EF
		int max = emp.get(0).getSalary();
		for (Employee x : emp) {
			if (x.getSalary() > max) {
				max = x.getSalary();
			}
		}
		//System.out.println(max);

		// Max Salary ForEach dose not providing sing valve in forEach

		// Full details for max salary EF
		Employee maxs = emp.get(0);
		for (Employee x : emp) {
			if (x.getSalary() > maxs.getSalary()) {
				maxs = x;
			}
		}
		// System.out.println(maxs);

		// Full details for max salary forEach dose not providing sing valve in forEach

		// print Salary only forEach
		// emp.forEach(a-> System.out.println(a.getSalary()+", "+a.getName()));

		// EvenSalary forEach
		emp.forEach(b -> {
			if (b.getSalary() % 2 == 0) {
				// System.out.println(b.getName());
			}
		});

		// OddSalary full details forEach
		emp.forEach(c -> {
			if (c.getSalary() % 2 != 0) {
				// System.out.println(c);
			}
		});

		// minimum salary increment 10% all detail
		Employee min = emp.get(0);
		for (Employee x : emp) {
			if (x.getSalary() < min.getSalary()) {
				min = x;
				x.setSalary(min.getSalary() + min.getSalary() * 10 / 100);
			}
			 System.out.println(x);

		} 
		// minimum salary increment 10%
		int mini = emp.get(0).getSalary();
		for (Employee x : emp) {
			if (x.getSalary() < mini) {
				mini = x.getSalary();
				 x.setSalary(mini+mini*10/100);
			}
		}
		 System.out.println(mini);

		ArrayList<Employee> temp = new ArrayList<>();
		for (Employee x : emp) {
			if (x.getRole().equals("notWorking")) {
				temp.add(x);
			}
		}
		for (Employee y : temp) {
			// System.out.println(y);
		}

		ArrayList<Employee> maleList = new ArrayList<>();
		for (Employee a : emp) {
			if (a.getGender().equals("male")) {
				maleList.add(a);
			}
		}
		for (Employee b : maleList) {
			// System.out.println(b);
		}

		// New ArrayList Female Only
		ArrayList<Employee> femaleList = new ArrayList<>();
		emp.forEach(c -> {
			if (c.getGender().equals("female")) {
				femaleList.add(c);
			}
		});
		// femaleList.forEach(d-> System.out.println(d));

		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getRole().equals("working") && (emp.get(i).getisDeveloper() == true)) {
				// System.out.println(emp.get(i));
			}
		}
		// minimum 50000 salary list
		ArrayList<Employee> minList = new ArrayList<>();
		emp.forEach(x -> {
			if (x.getSalary() < 50000) {
				minList.add(x);
			}
		});
		for (Employee y : minList) {
			// System.out.println(y);
		}
		// one max create ArrayList
		ArrayList<Employee> maxList = new ArrayList<>();
		Employee mx = emp.get(0);
		for (Employee x : emp) {
			if (x.getSalary() > mx.getSalary()) {
				mx = x;
			}
		}
		maxList.add(mx);
		for (Employee y : maxList) {
			// System.out.println(y);
		}
		// System.out.println(maxList);

		// Reveres adder
		for (int i = emp.size() - 1; i >= 0; i--) {
			// System.out.println(emp.get(i));
		}

		ArrayList<Character> ch = new ArrayList<>();
		emp.forEach(x -> {
			ch.add(x.getName().charAt(x.getName().length() - 1));
		});
		// System.out.println(ch);
		ch.forEach(y -> System.out.println(y));

		Employee mn = emp.get(0);
		for (Employee x : emp) {
			if (x.getSalary() <= mn.getSalary()) {
				mn = x;
			}
		}
		System.out.println(mn);

	}
}