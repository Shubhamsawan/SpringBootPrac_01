package com.example.demo.MyServices;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Entites.UserEntity;
import com.example.demo.Repo.UserRepository;
import com.example.demo.Ut.Utils;

//import ch.qos.logback.classic.pattern.Util;

@Service

public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;
	
//	@Autowired
//	private Utils utils;
	
//	@Autowired
//	BCryptPasswordEncoder bCryptPasswordEncoder;
//	
	@Override
	public UserDto createUser(UserDto dto) {
		
//		UserEntity storedUserDetails= repo.findByEmail(dto.getEmail());

		if( repo.findByEmail(dto.getEmail()) != null) throw new RuntimeException("Record Already Exist");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(dto, userEntity);
		
//		generate user public id
//		String publicUseerId = utils.generateUserId(30);
		
//		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(dto.getPasword()));
		userEntity.setEncryptedPassword("Ram");
//		userEntity.setUserId(publicUseerId);
		userEntity.setUserId("testUser");
		userEntity.setEmail("Gadaa20@gmail.com");
		userEntity.setFirstNmae("Dibh");
		userEntity.setLastName("Rawa");
		UserEntity storedUserDetail = repo.save(userEntity);
		
		UserDto returnedValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetail, returnedValue);
		return returnedValue;
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return null;
//	}


}
