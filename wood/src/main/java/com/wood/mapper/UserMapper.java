package com.wood.mapper;

import java.util.List;

import com.wood.entity.UserFormMap;
import com.wood.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
