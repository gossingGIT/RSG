package org.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.project.domain.rsgGroup.CreateGroupDTO;
import org.project.service.rsgGroup.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private GroupService groupSvc;
	
	@RequestMapping(value="/createGroup",method=RequestMethod.POST) 
	public ResponseEntity<String> createGroup(@RequestBody CreateGroupDTO createGroupDTO) throws Exception { 
		groupSvc.createGroup(createGroupDTO);
		return null;
	}
}
