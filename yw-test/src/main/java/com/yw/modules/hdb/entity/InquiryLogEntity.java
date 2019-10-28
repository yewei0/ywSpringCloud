package com.yw.modules.hdb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Ñ¯±¨¼ÛÈÕÖ¾
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class InquiryLogEntity  {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String id;
	/**
	 * 
	 */
	private String memberId;
	/**
	 * 
	 */
	private String memberName;
	/**
	 * 
	 */
	private String createrName;
	/**
	 * 
	 */
	private String remark;
	/**
	 * 
	 */
	private String refType;
	/**
	 * 
	 */
	private String refId;
	/**
	 * 
	 */
	private String bizStatus;
	/**
	 * 
	 */
	private String bizStatusName;
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
	private Integer isDel;

}
