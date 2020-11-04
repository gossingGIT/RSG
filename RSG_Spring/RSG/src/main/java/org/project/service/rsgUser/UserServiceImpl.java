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
	
	// ������ ��ť��Ƽ
	@Autowired
	private BCryptPasswordEncoder pwdEnc;
	
	@Override
	public RsgUserVO verifyLogin(LoginDTO dto) throws Exception {
		RsgUserVO vo = dao.login(dto);
		if (vo != null) {
			boolean loginYn = pwdEnc.matches(dto.getUpw(),vo.getUpw()); //��ȣȭ�� ��й�ȣ�� ��ġ�ϴ��� Ȯ���Ѵ�. ��ġ�� �� true, ����ġ�� false
			log.info("�α��� ��� = "+loginYn);
			if (loginYn) { //��й�ȣ�� ��ġ�ϸ� ���������� return
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
