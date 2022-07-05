package com.spring.app;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController{
	@GetMapping("/student")
	public Student getstudent() {
	return new Student("ramesh","fadatare");
}
	@GetMapping("/students")
		public List<Student>getStudents(){
			
			List<Student>students=new ArrayList<>();
			students.add(new Student("ramesh","fadatare"));
			students.add(new Student("ramesh","fadatare"));
			students.add(new Student("ramesh","fadatare"));
			students.add(new Student("ramesh","fadatare"));
			students.add(new Student("ramesh","fadatare"));
			return students;
		}
			
		}
	

			
		
	
		
	
	

