package org.project.service.rsgUser;

import org.project.dao.rsgUser.UserDao;
import org.project.domain.rsgUser.LoginDTO;
import org.project.domain.rsgUser.RsgUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	@Override
	public RsgUserVO verifyLogin(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}

}
