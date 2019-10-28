package com.yw.modules.hdb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ¶©µ¥¸½¼þ
 * 
 * @author yewei
 * @email 965893795@qq.com
 * @date 2019-10-27 17:37:34
 */
@Data
public class OrderAttachmentEntity  {
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
	private String attachName;
	/**
	 * 
	 */
	private String attachmentFile;
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
