package org.project.service.rsgGroup;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.project.domain.rsgGroup.CreateGroupDTO;
import org.project.domain.rsgGroup.RsgGroupVO;
import org.springframework.stereotype.Service;

@Service("GroupService")
public class GroupServiceImpl implements GroupService{

	@Resource
	private SqlSessionTemplate groupSql;
	
	private String namespace = "org.project.mapper.GroupMapper";

	@Override
	public int createGroup(CreateGroupDTO createGroupDTO) {
		// TODO Auto-generated method stub
		return groupSql.insert(namespace+".insertGroupInfo", createGroupDTO);
	}

}
