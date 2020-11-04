package org.project.controller;

import org.project.domain.rsgUser.LoginDTO;
import org.project.domain.rsgUser.RsgUserVO;
import org.project.service.rsgUser.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService service;
	
	/**
	 * 로그인 처리
	 * @param loginDTO
	 * @return ResponseEntity
	 * @throws Exception
	 */
	@RequestMapping(value="/verifyLogin",method=RequestMethod.POST) 
	public ResponseEntity<String> verifyUserLogin(@RequestBody LoginDTO loginDTO) throws Exception {
		log.info("Verify Login");
		ResponseEntity<String> entity = null;
		log.info(loginDTO.toString());
		RsgUserVO vo = service.verifyLogin(loginDTO); // 아이디, 비밀번호로 로그인 정보 가져옴
		if (vo != null) { //
			entity = new ResponseEntity<>("success",HttpStatus.OK);
			log.info(entity.toString());
			return entity;
		
		}
		else {
			entity = new ResponseEntity<>("fail",HttpStatus.BAD_REQUEST);
			log.info(entity.toString());
			return entity;
		}
		
	}
}
