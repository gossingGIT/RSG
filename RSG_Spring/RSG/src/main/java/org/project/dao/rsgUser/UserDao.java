package org.project.dao.rsgUser;

import org.project.domain.rsgUser.LoginDTO;
import org.project.domain.rsgUser.RsgUserVO;

public interface UserDao {
	public RsgUserVO login(LoginDTO dto) throws Exception; 
}
