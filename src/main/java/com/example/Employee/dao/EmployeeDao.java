
 package com.example.Employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	
	public String PostEmp(Employee e) {
		er.save(e);
		return "Save Successfully";
	}
	
	public String PostMultipelEmp(List<Employee> e) {
		er.saveAll(e);
		return "Multipel List Save Successfully ";
	}
	
	public Employee findById(int n) {
		Employee e = er.findById(n).get();
		return e;
	}
	
	public List<Employee> findAll(){
		List<Employee> FindAll = er.findAll();
		return FindAll;
	}
	
	public String deleteById(int n) {
		er.deleteById(n);
		return "Delete Sueccssfully";
	}
	
	public String update(int n, Employee e) {
		Employee x = er.findById(n).get();
		x.setName(e.getName());
		x.setSalary(e.getSalary());
		x.setRole(e.getRole());
		x.setAge(e.getAge());
		x.setGender(e.getGender());
		
		er.save(x);
		return "Update seuccssfully";
	}
	
	public String NameUpdate(int n, Employee name) {
		Employee x = er.findById(n).get();
		x.setName(name.getName());
		er.save(x);
		return "Name Updated";
	}
	
	// JPQL Query  also J Query
	
	public List<Employee> getByName(String a) {
		return er.getByName(a);
	} 
	
	public List<Employee> getByname(String name) {
		return er.getByname(name);
	} 

	public Employee getMaxSalary() {
		return er.getMaxSalary();
	}
 
	public List<Employee> getBetween( int a, int b) {
		return er.getBetween(a,b);
	}
	
	public String getMinName() {
		return er.getMinName();
	}
	
	public List<Employee> getByLastLetterName(String a){
		return er.getByLastLetterName(a);
	}
	
	public List<Object> getBySecLetterName(String a){
		return er.getBySecLetterName(a); 
	}
	
	public int getmaxSalary() {
		return er.getmaxSalary();
	}
	
	public float getAvgSalary() {
		return er.getAvgSalary();
	}
	
	public List<String> getGroupByName(){
		return er.getGroupByName();
	}
}
 