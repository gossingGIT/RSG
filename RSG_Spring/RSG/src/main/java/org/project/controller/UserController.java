package org.project.controller;

import org.project.domain.rsgUser.LoginDTO;
import org.project.domain.rsgUser.RsgUserVO;
import org.project.service.rsgUser.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value="/verifyLogin",method=RequestMethod.POST) 
	public ResponseEntity<String> verifyUserLogin(@RequestBody LoginDTO loginDTO) throws Exception {
		log.info("Verify Login");
		log.info(loginDTO.toString());
		RsgUserVO vo = service.verifyLogin(loginDTO);
		log.info(vo.getUlastLogin().toString());
		return null;
	}
}
