package org.project.service.rsgUser;

import org.project.dao.rsgUser.UserDao;
import org.project.domain.rsgUser.LoginDTO;
import org.project.domain.rsgUser.RsgUserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDao dao;
	
	// 스프링 시큐리티
	@Autowired
	private BCryptPasswordEncoder pwdEnc;
	
	@Override
	public RsgUserVO verifyLogin(LoginDTO dto) throws Exception {
		RsgUserVO vo = dao.login(dto);
		if (vo != null) {
			boolean loginYn = pwdEnc.matches(dto.getUpw(),vo.getUpw()); //암호화된 비밀번호와 일치하는지 확인한다. 일치할 시 true, 불일치시 false
			log.info("로그인 결과 = "+loginYn);
			if (loginYn) { //비밀번호가 일치하면 유저정보를 return
				return vo;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
		
	}

}
