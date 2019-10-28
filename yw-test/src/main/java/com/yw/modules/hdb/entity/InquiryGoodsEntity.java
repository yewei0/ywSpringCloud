package com.yw.modules.hdb.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * Ñ¯¼ÛÉÌÆ·
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class InquiryGoodsEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String id;
	/**
	 * 
	 */
	private String inquiryId;
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
	private String usd;
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
	private Date updatedTime;
	/**
	 * 
	 */
	private Integer isDel;

}
