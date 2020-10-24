package org.project.dao.rsgUser;

import org.apache.ibatis.session.SqlSession;
import org.project.domain.rsgUser.LoginDTO;
import org.project.domain.rsgUser.RsgUserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger log = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Autowired
	private SqlSession session;
	
	private String namespace = "org.project.mapper.UserMapper";
	
	@Override
	public RsgUserVO login(LoginDTO dto) throws Exception {
		log.info("Login Dao");
		return session.selectOne(namespace+".login",dto);
	}

}
