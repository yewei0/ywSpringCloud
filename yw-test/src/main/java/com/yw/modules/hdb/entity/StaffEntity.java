package com.yw.modules.hdb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ÆóÒµÔ±¹¤
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class StaffEntity  {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String memberId;
	/**
	 * 
	 */
	private String id;
	/**
	 * 
	 */
	private String staffName;
	/**
	 * 
	 */
	private String status;
	/**
	 * 
	 */
	private String loginAccount;
	/**
	 * 
	 */
	private String paswd;
	/**
	 * 
	 */
	private String wxOpenid;
	/**
	 * 
	 */
	private String wxLogo;
	/**
	 * 
	 */
	private Integer revision;
	/**
	 * 
	 */
	private String createdBy;
	/**
	 * 
	 */
	private Date createdTime;
	/**
	 * 
	 */
	private String updatedBy;
	/**
	 * 
	 */
	private Integer isDel;
	/**
	 * 
	 */
	private Date updatedTime;

}
