package com.springrestapidemo.ronakspringapi.services;

import java.util.List;

import com.springrestapidemo.ronakspringapi.entities.Course;

public interface CourseService {
	//get all courses
	public List<Course> getCourses();
	//get course by course id
	public Course getCourse(long courseId);
	//add course
	public Course addCourse(Course course);
	//update course
	public Course updateCourse(Course course);
	//delete course
	public Course deleteCourse(long courseId);
}
