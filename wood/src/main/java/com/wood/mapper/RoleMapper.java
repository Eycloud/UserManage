package com.wood.mapper;

import java.util.List;

import com.wood.entity.RoleFormMap;
import com.wood.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
