package com.example.Employee.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Employee.dao.EmployeeDao;
import com.example.Employee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	
	public String PostEmp(Employee e) {
		return ed.PostEmp(e);
	}
	
	public String PostMultipelEmp(List<Employee> e) {
		return ed.PostMultipelEmp(e);
	}
	
	public Employee findById(int n) {
		return ed.findById(n);
	}
	
	public List<Employee> findAll(){
		return ed.findAll();
	}
	
	public String deleteById(int n) {
		return ed.deleteById(n);
	}
	
	public String update( int n, Employee e) {
		return ed.update(n,e);
	}
	
	public String NameUpdate(int n, Employee name) {
		return ed.NameUpdate(n,name);
	}
	
	public Employee getSecMaxAge() {
		List<Employee> x = ed.findAll();
		Employee e = x.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).skip(1).findFirst().get();
		return e;
	}
	
	// JPQL Query  also J Query
	
	public List<Employee> getByName(String a) {
		return ed.getByName(a);
	} 
	
	public List<Employee> getByname(String name) {
		return ed.getByname(name);
	}
	
	public Employee getMaxSalary() {
		return ed.getMaxSalary();
	}
 
	public List<Employee> getBetween( int a, int b) {
		return ed.getBetween(a,b);
	}
	
	public String getMinName() {
		return ed.getMinName();
	}
	
	public List<Employee> getByLastLetterName(String a){
		return ed.getByLastLetterName(a);
	}
	
	public List<Object> getBySecLetterName(String a){
		return ed.getBySecLetterName(a); 
	} 
	
	public int getmaxSalary() {
		return ed.getmaxSalary();
	}
	
	public float getAvgSalary() {
		return ed.getAvgSalary();
	}
	
	public List<String> getGroupByName(){
		return ed.getGroupByName();
	}
}
