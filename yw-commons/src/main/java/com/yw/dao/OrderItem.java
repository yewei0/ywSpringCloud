package com.yw.dao;


import java.util.Date;
import java.util.List;


import lombok.Data;
import lombok.experimental.Accessors;
@Data
@Accessors(chain=true)
public class OrderItem extends BasePojo{
	
    private String itemId;
	
    private String orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String picPath;
}