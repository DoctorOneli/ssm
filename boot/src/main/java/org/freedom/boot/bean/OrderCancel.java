package org.freedom.boot.bean;

public class OrderCancel {
    private Integer orderCancelId;

    private Integer orderId;

    private Integer cancelReasonId;

    private String detail;

    public Integer getOrderCancelId() {
        return orderCancelId;
    }

    public void setOrderCancelId(Integer orderCancelId) {
        this.orderCancelId = orderCancelId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCancelReasonId() {
        return cancelReasonId;
    }

    public void setCancelReasonId(Integer cancelReasonId) {
        this.cancelReasonId = cancelReasonId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}