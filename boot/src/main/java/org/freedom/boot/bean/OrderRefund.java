package org.freedom.boot.bean;

public class OrderRefund {
    private String orderRefundId;

    private String orderItemId;

    private Integer ifRefund;

    public String getOrderRefundId() {
        return orderRefundId;
    }

    public void setOrderRefundId(String orderRefundId) {
        this.orderRefundId = orderRefundId == null ? null : orderRefundId.trim();
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId == null ? null : orderItemId.trim();
    }

    public Integer getIfRefund() {
        return ifRefund;
    }

    public void setIfRefund(Integer ifRefund) {
        this.ifRefund = ifRefund;
    }
}