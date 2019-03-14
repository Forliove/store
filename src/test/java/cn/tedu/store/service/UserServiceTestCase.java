package cn.tedu.store.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.ex.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {
	
	@Autowired
	private IUserService service;
	
	@Test
	public void reg() {
		try {
			User user = new User();
			user.setUsername("LiBai");
			user.setPassword("6666");
			user.setPhone("13811112222");
			user.setEmail("libai@tedu.cn");
			user.setGender(1);
			user.setAvatar("http://www.tedu.cn/logo.png");
			service.reg(user);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	public void login() {
		try {
			String username = "ChengHeng";
			String password = "1234";
			User user = service.login(username, password);
			System.err.println(user);
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void changePassword() {
		try {
			Integer id = 3;
			String oldPassword = "8888";
			String newPassword = "1234";
			service.changePassword(id, oldPassword, newPassword);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void changeInfo() {
		try {
			User user = new User();
			user.setId(3);
			user.setGender(0);
			user.setPhone("88888888");
			user.setEmail("tedu@qq.com");
			service.changeInfo(user);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void changeAvatar() {
		try {
			Integer id = 3;
			String avatar = "123456";
			service.changeAvatar(id, avatar);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void getByUid() {
		Integer id = 5;
		User user = service.getById(id);
		System.err.println(user);
	}
	
}








