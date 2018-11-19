package com.dwx.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

/*用户登录信息*/

@Setter
@Getter
public class Logininfo extends BaseDomain{
    
	public static final int STATE_NORMAL = 0;//正常
	public static final int STATE_LOCK = 1; //锁定
	
	private Long id;
	private String username;
	private String password;
	private int state;
	public void setUsername(String username2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}
	public void setState(int stateNormal) {
		// TODO Auto-generated method stub
		
	}

	
}
