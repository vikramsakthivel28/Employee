package com.example.Employee.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.entity.Employee;
import com.example.Employee.service.EmployeeService;

@RestController
@RequestMapping(value="/emp/api")
public class EmployeeControler {
	@Autowired
	EmployeeService es;
	
	@PostMapping(value="/postSingleEmp")
	public String PostEmp(@RequestBody Employee e) {
		return es.PostEmp(e);
	}
	
	@PostMapping(value="/postMultipelEmp")
	public String PostMultipelEmp(@RequestBody List<Employee> e) {
		return es.PostMultipelEmp(e);
	}

	@GetMapping(value="/findById/{n}")
	public Employee findById(@PathVariable int n) {
		return es.findById(n);
	}
	 
	@GetMapping(value="/findAll")
	public List<Employee> findAllObject(){
		return es.findAll();
	}
	
	@DeleteMapping(value="/deleteById/{n}")
	public String deleteById(@PathVariable int n) {
		return es.deleteById(n);
	}
	
	@PutMapping(value="/update/{n}")
	public String update(@PathVariable int n, @RequestBody Employee e) {
		return es.update(n,e); 
	}
	
	@PatchMapping(value="/NameUpdate/{n}")
	public String NameUpdate(@PathVariable int n, @RequestBody Employee name) {
		return es.NameUpdate(n,name);
	}
	
	
	@GetMapping(value="/FindSecMaxAge")
	public Employee getSecMaxAge() {
		return es.getSecMaxAge();
	}
	
	// JPQL Query  also J Query
	@GetMapping(value="/FindByName/{a}") 
	public List<Employee> getByName(@PathVariable String a) {
		return es.getByName(a);
	} 
	
	@GetMapping(value="/findByName") // http://localhost:8080/emp/api/findByName?name=vikram
	public List<Employee> getByname(@RequestParam String name) {
		return es.getByname(name);
	} 
	
	@GetMapping(value="/findMaxSalary")
	public Employee getMaxSalary() {
		return es.getMaxSalary();
	}
	
	@GetMapping(value="/findBetween/{a}/{b}")
	public List<Employee> getBetween(@PathVariable int a, @PathVariable int b) {
		return es.getBetween(a,b); 
	}
	
	@GetMapping(value="/findMinName")
	public String getMinName() {
		return es.getMinName();
	} 
	
	@GetMapping(value="/findByLastLetterName/{a}")
	public List<Employee> getByLastLetterName(@PathVariable String a){
		return es.getByLastLetterName(a);
	} 
	
	@GetMapping(value="/findBySecLetterName/{a}")
	public List<Object> getBySecLetterName(@PathVariable String a){
		return es.getBySecLetterName(a); 
	} 
	
	@GetMapping(value="/findMaxSalaryOnely")
	public int getmaxSalary() {
		return es.getmaxSalary();
	}
	
	@GetMapping(value="/findAvgSalary")
	public float getAvgSalary() {
		return es.getAvgSalary();
	}
	
	@GetMapping(value="/findGroupByName")
	public List<String> getGroupByName(){
		return es.getGroupByName();
	}
}    
  