package com.yw.modules.hdb.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * ¼¯×°ÏäÐÅÏ¢
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class OrderContainerInfoEntity  {
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
	private String orderId;
	/**
	 * 
	 */
	private String containerNo;
	/**
	 * 
	 */
	private String containerType;
	/**
	 * 
	 */
	private BigDecimal containerCapacity;
	/**
	 * 
	 */
	private String sealNo;
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
