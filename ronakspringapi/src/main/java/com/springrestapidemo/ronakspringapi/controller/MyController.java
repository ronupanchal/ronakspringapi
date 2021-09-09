package com.springrestapidemo.ronakspringapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapidemo.ronakspringapi.entities.Course;
import com.springrestapidemo.ronakspringapi.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//Get Course
	@GetMapping("/courses")
	public List<Course> getCourse(){
		return this.courseService.getCourses();
	}
	
	//Get Course Id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path="/courses", consumes="application/json")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId){
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
	
}
