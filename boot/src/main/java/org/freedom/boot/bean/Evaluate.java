package org.freedom.boot.bean;

import java.util.Date;

public class Evaluate {
    private Integer evaluateId;

    private Integer orderItemId;

    private Integer userId;

    private String content;

    private Date evaluateTime;

    private Integer logisticsGrade;

    private Integer serviceGrade;

    private Integer goodsGrade;

    private Integer toEvaluateId;

    private Integer ifAnonymous;

    private String img;

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Integer getLogisticsGrade() {
        return logisticsGrade;
    }

    public void setLogisticsGrade(Integer logisticsGrade) {
        this.logisticsGrade = logisticsGrade;
    }

    public Integer getServiceGrade() {
        return serviceGrade;
    }

    public void setServiceGrade(Integer serviceGrade) {
        this.serviceGrade = serviceGrade;
    }

    public Integer getGoodsGrade() {
        return goodsGrade;
    }

    public void setGoodsGrade(Integer goodsGrade) {
        this.goodsGrade = goodsGrade;
    }

    public Integer getToEvaluateId() {
        return toEvaluateId;
    }

    public void setToEvaluateId(Integer toEvaluateId) {
        this.toEvaluateId = toEvaluateId;
    }

    public Integer getIfAnonymous() {
        return ifAnonymous;
    }

    public void setIfAnonymous(Integer ifAnonymous) {
        this.ifAnonymous = ifAnonymous;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}