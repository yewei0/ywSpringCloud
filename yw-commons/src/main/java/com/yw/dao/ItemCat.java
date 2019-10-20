package com.yw.dao;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ItemCat extends BasePojo{
	private Long id;
	private Long parentId;
	private String name;
	private Integer status;		//状态
	private Integer sortOrder;	//商品分类排序号
	private Boolean isParent;	//是否为父级

}
