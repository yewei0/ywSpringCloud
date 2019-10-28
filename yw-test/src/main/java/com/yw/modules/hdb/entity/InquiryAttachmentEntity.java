package com.yw.modules.hdb.entity;

import lombok.Data;

import java.util.Date;

/**
 * Ñ¯¼Ûµ¥¸½¼þ
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class InquiryAttachmentEntity {
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
	private String attachName;
	/**
	 * 
	 */
	private String attachType;
	/**
	 * 
	 */
	private String fileSize;
	/**
	 * 
	 */
	private Integer sortOrder;
	/**
	 * 
	 */
	private String fileDesc;
	/**
	 * 
	 */
	private String attachmentFile;
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
