package com.yw.modules.hdb.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * ¶©µ¥ÉÌÆ·
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:39:12
 */
@Data
public class OrderGoodsEntity  {
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
	private String goodsName;
	/**
	 * 
	 */
	private String goodsCode;
	/**
	 * 
	 */
	private Long qty;
	/**
	 * 
	 */
	private BigDecimal weight;
	/**
	 * 
	 */
	private String volume;
	/**
	 * 
	 */
	private Integer sortOrder;
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

}
