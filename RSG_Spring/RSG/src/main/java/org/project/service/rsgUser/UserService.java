package org.project.service.rsgUser;

import org.project.domain.rsgUser.LoginDTO;
import org.project.domain.rsgUser.RsgUserVO;

public interface UserService {
	public RsgUserVO verifyLogin(LoginDTO dto) throws Exception;
}
