package com.yw.modules.hdb.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * ¶©µ¥·ÑÓÃÐÅÏ¢
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class OrderExpensesEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String id;
	/**
	 * 
	 */
	private String orderId;
	/**
	 * 
	 */
	private String expensesName;
	/**
	 * 
	 */
	private String expensesType;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private String currencyId;
	/**
	 * 
	 */
	private BigDecimal taxRate;
	/**
	 * 
	 */
	private BigDecimal excludTaxRec;
	/**
	 * 
	 */
	private BigDecimal containTaxRec;
	/**
	 * 
	 */
	private BigDecimal exchangeRate;
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
	private String size;
	/**
	 * 
	 */
	private Integer status;
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
