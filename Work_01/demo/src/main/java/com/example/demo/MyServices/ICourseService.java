package com.example.demo.MyServices;



import java.util.List;

//import com.example.demo.Dto.UserDto;
import com.example.demo.Entites.Course;


public interface ICourseService {
	
	public List<Course> getCourses();


//	public UserDto createUser(UserDto dto);


	public Course getCourse(long courseId) ;


	public Course addCourse(Course course);


	public Course updateCourse(Course course);


	public void deleteCourse(long parseLong);

}
