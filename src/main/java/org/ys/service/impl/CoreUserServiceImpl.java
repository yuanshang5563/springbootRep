package org.ys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ys.dao.UserDao;
import org.ys.model.CoreUser;
import org.ys.service.CoreUserService;

@Service("coreUserService")
public class CoreUserServiceImpl implements CoreUserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void save(CoreUser coreUser) {
		userDao.save(coreUser);
	}

}
