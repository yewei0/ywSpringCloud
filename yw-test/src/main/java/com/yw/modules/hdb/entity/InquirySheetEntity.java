package com.yw.modules.hdb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Ñ¯¼Ûµ¥
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class InquirySheetEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String id;
	/**
	 * 
	 */
	private String inquiryNo;
	/**
	 * 
	 */
	private String inOut;
	/**
	 * 
	 */
	private String transportModeId;
	/**
	 * 
	 */
	private String businessType;
	/**
	 * 
	 */
	private String loadingId;
	/**
	 * 
	 */
	private String dischargeId;
	/**
	 * 
	 */
	private String packageMethod;
	/**
	 * 
	 */
	private String serviceIds;
	/**
	 * 
	 */
	private String transportRequirements;
	/**
	 * 
	 */
	private String transportPreference;
	/**
	 * 
	 */
	private String serverPreference;
	/**
	 * 
	 */
	private String domesticTakeAddress;
	/**
	 * 
	 */
	private String domesticTabkeContacts;
	/**
	 * 
	 */
	private String domesticTabkeTel;
	/**
	 * 
	 */
	private String domesticDeliveryAddress;
	/**
	 * 
	 */
	private String domesticDeliveryContact;
	/**
	 * 
	 */
	private String domesticDeliveryTel;
	/**
	 * 
	 */
	private String domesticHarvestAddress;
	/**
	 * 
	 */
	private String domesticHarvestContacts;
	/**
	 * 
	 */
	private String domesticHarvestTel;
	/**
	 * 
	 */
	private String domesticSendAddress;
	/**
	 * 
	 */
	private String domesticSendContacts;
	/**
	 * 
	 */
	private String domesticSendTel;
	/**
	 * 
	 */
	private String abroadTakeAddress;
	/**
	 * 
	 */
	private String abroadTakeContacts;
	/**
	 * 
	 */
	private String abroadTakeTel;
	/**
	 * 
	 */
	private String abroadDeliveryAddress;
	/**
	 * 
	 */
	private String abroadDeliveryContacts;
	/**
	 * 
	 */
	private String abroadDeliveryTel;
	/**
	 * 
	 */
	private String abroadHarvestAddress;
	/**
	 * 
	 */
	private String abroadHarvestContacts;
	/**
	 * 
	 */
	private String abroadHarvestTel;
	/**
	 * 
	 */
	private String abroadSendAddress;
	/**
	 * 
	 */
	private String abroadSendContacts;
	/**
	 * 
	 */
	private String abroadSendTel;
	/**
	 * 
	 */
	private String mark;
	/**
	 * 
	 */
	private String inquiryStatus;
	/**
	 * 
	 */
	private String memberId;
	/**
	 * 
	 */
	private String staffId;
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
