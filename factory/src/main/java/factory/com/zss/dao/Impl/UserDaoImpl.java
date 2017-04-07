package factory.com.zss.dao.Impl;

import factory.com.zss.bean.UserBean;
import factory.com.zss.dao.IuserDao;

public class UserDaoImpl implements IuserDao {

	
	public void addUser(UserBean user) {
		// TODO Auto-generated method stub
		UserBean newUser= user;
		System.out.println(newUser.getUser_name());
	}

}
