package com.springrestapidemo.ronakspringapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapidemo.ronakspringapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(142,"Java Core Course","this is my course"));
		list.add(new Course(143,"Spring Boot Core Course","this is my Spring course"));
		list.add(new Course(144,"Java 8 Course","this is my Java 8course"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.add(course);
		return course;
	}


	@Override
	public Course deleteCourse(long courseId) {		
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
}
