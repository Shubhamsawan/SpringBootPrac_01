package com.example.demo.MyServices;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

//import java.util.ArrayList;
//import java.util.List;

//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.CourseDao;
//import com.example.demo.Dto.UserDto;
import com.example.demo.Entites.Course;
//import com.example.demo.Entites.UserEntity;
//import com.example.demo.Repo.UserRepository;

@Service
public class CourseServiceImpl implements ICourseService{
	
//	@Autowired
//	private UserRepository repo;
//	
	@Autowired
	private CourseDao courseDao;
	
//	@Autowired(required = true)
//	private UserDto userDto;

//	List<Course> list;
//	
//	
//	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(101,"Java Core Course","This course not difficult"));
//		list.add(new Course(102,"Python Core Course","Python is not a reptile"));
//		list.add(new Course(103,"JavaScript Course","This course is used fro frontened"));
//		list.add(new Course(104,"C++ Course","This course is for gaming purpose"));
//	}


	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}



//	@Override
//	public UserDto createUser(UserDto dto) {
//
//		UserEntity userEntity = new UserEntity();
//		BeanUtils.copyProperties(dto, userEntity);
//		
//		userEntity.setEncryptedPassword("test");
//		userEntity.setUserId("testUserId");
//		userEntity.setEmail("sat0420@gmail.com");
//		UserEntity storedUserDetail = repo.save(userEntity);
//		
//		UserDto returnedValue = new UserDto();
//		BeanUtils.copyProperties(storedUserDetail, returnedValue);
//		return returnedValue;
//	}


	@Override
	public Course getCourse(long courseId) {
//		
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {

//		list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);

		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {

//		list=this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		Course entity =courseDao.getOne(parseLong);
		courseDao.delete(entity);


	}

}
