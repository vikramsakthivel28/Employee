package com.example.Employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	@Query(value="select e from Employee e where e.name like :a")
	public List<Employee> getByName(@Param("a") String a) ;
	 
	@Query(value="select e from Employee e where e.name like :name")
	public List<Employee> getByname(@Param("name") String name);
	
	@Query(value="select e from Employee e order by e.salary desc limit 1")
	public Employee getMaxSalary();
	
	@Query(value="select e from Employee e where e.salary between :a and :b")
	public List<Employee> getBetween(@Param("a") int a, @Param("b") int b) ;
	
	@Query(value="select e.name from Employee e order by e.salary limit 1 ")
	public String getMinName() ;
	
	@Query(value="select e from Employee e where e.name like concat('%',:a)")
	public List<Employee> getByLastLetterName(@Param("a") String a);
	
	@Query(value="select e.id,e.name,e.role from Employee e where e.name like concat('_',:a,'%')")
	public List<Object> getBySecLetterName(@Param("a") String a);
	
	@Query(value="select max(e.salary) from Employee e") 
	public int getmaxSalary();
	
	@Query(value="select avg(e.salary) from Employee e")
	public float getAvgSalary() ;
	
	@Query(value="select e.name from Employee e group by e.name")
	public List<String> getGroupByName();
}
 