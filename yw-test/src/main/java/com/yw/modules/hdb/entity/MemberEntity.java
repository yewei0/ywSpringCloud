package com.yw.modules.hdb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ÆóÒµ±í
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class MemberEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String id;
	/**
	 * 
	 */
	private String memberName;
	/**
	 * 
	 */
	private String kindId;
	/**
	 * 
	 */
	private String status;
	/**
	 * 
	 */
	private String staffId;
	/**
	 * 
	 */
	private String staffName;
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
	private Date updatedTime;
	/**
	 * 
	 */
	private Integer isDel;

}
