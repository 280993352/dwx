package com.dwx.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

/*用户登录信息*/
public class Logininfo extends BaseDomain {
    public static final int STATE_NORMAL=0;//正常
    public static final int STATE_LOCK=0;//锁定
    @Setter
    @Getter
	private Long id;
	private String username;
	private String password;
	/*锁定，封号*/
	private int state; 
	
}
