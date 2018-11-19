package com.dwx.p2p.base.mapper;

import java.awt.List;

import com.dwx.p2p.base.domain.Logininfo;

public interface LogininfoMapper {

	int insert(Logininfo record);

	Logininfo selectByPrimaryKey(Long id);

	List/*<Logininfo>*/ selectAll();

	int updateByPrimaryKey(Logininfo record);

	/*根据用户名查询用户数量*/
	int getCountByUsername(String username);
}