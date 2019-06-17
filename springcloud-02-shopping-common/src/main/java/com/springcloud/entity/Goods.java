package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Goods表对应的实体类，用于保存商品信息
 * @author zy
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 * 商品编号
	 */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private Double goodsPrice;

    /**
     * 商品折扣价
     */
    private Double goodsDiscount;

    /**
     * 商品状态：0预售，1热卖，2已下架
     */
    private Integer goodsStatus;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 是否新品：0新品，1旧品
     */
    private Integer goodsNew;

    /**
     * 是否热卖：0是，1不是
     */
    private Integer goodsHot;

    /**
     * 商品等级：0-4，5个级别
     */
    private Integer goodsLevel;

    /**
     * 商品描述
     */
    private String goodsDesc;

    /**
     * 商品详情
     */
    private String goodsDetail;

    /**
     * 商品图片
     */
    private String goodsImg;

    /**
     * 二级类别编号
     */
    private Integer typeTwoId;

    /**
     * 查询条件，商品价格下限
     */
    private Double goodsPriceMin;
    
    /**
     * 查询条件，商品价格上限
     */
    private Double goodsPriceMax;
    
    /**
     * 查询条件，一级类别编号
     */
    private Integer typeOneId;
    
    /**
     * 用于统计商品销量，用于保存统计分组的结果
     */
    private Integer goodsSum;
    
   
}