package factory.com.zss.service.impl;

import factory.com.zss.bean.UserBean;
import factory.com.zss.dao.IuserDao;
import factory.com.zss.service.UserService;

public class UserServiceImpl implements UserService {

	private IuserDao userDao;
	public void say(UserBean user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}
	public IuserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IuserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
