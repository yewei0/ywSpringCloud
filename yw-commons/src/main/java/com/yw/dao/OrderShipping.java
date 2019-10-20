package com.yw.dao;


import java.util.Date;
import java.util.List;


import lombok.Data;
import lombok.experimental.Accessors;
@Data
@Accessors(chain=true)
public class OrderShipping extends BasePojo{
	
    private String orderId;

    private String receiverName;

    private String receiverPhone;

    private String receiverMobile;

    private String receiverState;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;
    
}