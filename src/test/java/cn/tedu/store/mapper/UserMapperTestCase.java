package cn.tedu.store.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {

	@Autowired
	private UserMapper mapper;
	
	@Test
	public void addnew() {
		User user = new User();
		user.setUsername("rootUser1");
		user.setPassword("rootUser123");
		user.setSalt("hello,md5");
		Integer rows = mapper.addnew(user);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void updatePassword() {
		Integer uid = 1;
		String password = "1234";
		String modifiedUser = "Admin";
		Date modifiedTime = new Date();
		Integer rows 
			= mapper.updatePassword(
				uid, password, modifiedUser, modifiedTime);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void updateInfo() {
		User user = new User();
		user.setId(5);
		user.setPhone("666666");
		user.setEmail("rest@tedu.cn");
		user.setGender(1);
		Integer rows = mapper.updateInfo(user);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void updateAvatar() {
		Integer uid = 6;
		String avatar = "1234";
		String modifiedUser = "Admin";
		Date modifiedTime = new Date();
		Integer rows 
			= mapper.updateAvatar(
				uid, avatar, modifiedUser, modifiedTime);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void findByUsername() {
		String username = "digest";
		User user = mapper.findByUsername(username);
		System.err.println(user);
	}
	
	@Test
	public void findByUid() {
		Integer uid = 3;
		User user = mapper.findById(uid);
		System.err.println(user);
	}
	
}









