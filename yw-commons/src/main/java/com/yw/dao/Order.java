package com.yw.dao;


import java.util.Date;
import java.util.List;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Order extends BasePojo{
	private OrderShipping orderShipping;
								//封装订单商品信息  一对多
	private List<OrderItem> orderItems;
	
    private String orderId;
    private String payment;
    private Integer paymentType;
    private String postFee;
    private Integer status; //'状态：1、未付款 2、已付款3、未发货4、已发货5、交易成功6、交易关闭'
    private Date paymentTime;
    private Date consignTime;
    private Date endTime;
    private Date closeTime;
    private String shippingName;
    private String shippingCode;
    private Long userId;
    private String buyerMessage;
    private String buyerNick;
    private Integer buyerRate;

}