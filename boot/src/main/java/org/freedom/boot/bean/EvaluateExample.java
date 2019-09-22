package org.freedom.boot.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEvaluateIdIsNull() {
            addCriterion("evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNotNull() {
            addCriterion("evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdEqualTo(Integer value) {
            addCriterion("evaluate_id =", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotEqualTo(Integer value) {
            addCriterion("evaluate_id <>", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThan(Integer value) {
            addCriterion("evaluate_id >", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id >=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThan(Integer value) {
            addCriterion("evaluate_id <", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id <=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIn(List<Integer> values) {
            addCriterion("evaluate_id in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotIn(List<Integer> values) {
            addCriterion("evaluate_id not in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id not between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNull() {
            addCriterion("order_item_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("order_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(Integer value) {
            addCriterion("order_item_id =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(Integer value) {
            addCriterion("order_item_id <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(Integer value) {
            addCriterion("order_item_id >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_item_id >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(Integer value) {
            addCriterion("order_item_id <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_item_id <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<Integer> values) {
            addCriterion("order_item_id in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<Integer> values) {
            addCriterion("order_item_id not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id not between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNull() {
            addCriterion("evaluate_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNotNull() {
            addCriterion("evaluate_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeEqualTo(Date value) {
            addCriterion("evaluate_time =", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotEqualTo(Date value) {
            addCriterion("evaluate_time <>", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThan(Date value) {
            addCriterion("evaluate_time >", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_time >=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThan(Date value) {
            addCriterion("evaluate_time <", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_time <=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIn(List<Date> values) {
            addCriterion("evaluate_time in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotIn(List<Date> values) {
            addCriterion("evaluate_time not in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeBetween(Date value1, Date value2) {
            addCriterion("evaluate_time between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_time not between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeIsNull() {
            addCriterion("logistics_grade is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeIsNotNull() {
            addCriterion("logistics_grade is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeEqualTo(Integer value) {
            addCriterion("logistics_grade =", value, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeNotEqualTo(Integer value) {
            addCriterion("logistics_grade <>", value, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeGreaterThan(Integer value) {
            addCriterion("logistics_grade >", value, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_grade >=", value, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeLessThan(Integer value) {
            addCriterion("logistics_grade <", value, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_grade <=", value, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeIn(List<Integer> values) {
            addCriterion("logistics_grade in", values, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeNotIn(List<Integer> values) {
            addCriterion("logistics_grade not in", values, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeBetween(Integer value1, Integer value2) {
            addCriterion("logistics_grade between", value1, value2, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andLogisticsGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_grade not between", value1, value2, "logisticsGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeIsNull() {
            addCriterion("service_grade is null");
            return (Criteria) this;
        }

        public Criteria andServiceGradeIsNotNull() {
            addCriterion("service_grade is not null");
            return (Criteria) this;
        }

        public Criteria andServiceGradeEqualTo(Integer value) {
            addCriterion("service_grade =", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeNotEqualTo(Integer value) {
            addCriterion("service_grade <>", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeGreaterThan(Integer value) {
            addCriterion("service_grade >", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_grade >=", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeLessThan(Integer value) {
            addCriterion("service_grade <", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeLessThanOrEqualTo(Integer value) {
            addCriterion("service_grade <=", value, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeIn(List<Integer> values) {
            addCriterion("service_grade in", values, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeNotIn(List<Integer> values) {
            addCriterion("service_grade not in", values, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeBetween(Integer value1, Integer value2) {
            addCriterion("service_grade between", value1, value2, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andServiceGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_grade not between", value1, value2, "serviceGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIsNull() {
            addCriterion("goods_grade is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIsNotNull() {
            addCriterion("goods_grade is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeEqualTo(Integer value) {
            addCriterion("goods_grade =", value, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNotEqualTo(Integer value) {
            addCriterion("goods_grade <>", value, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeGreaterThan(Integer value) {
            addCriterion("goods_grade >", value, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_grade >=", value, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeLessThan(Integer value) {
            addCriterion("goods_grade <", value, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_grade <=", value, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIn(List<Integer> values) {
            addCriterion("goods_grade in", values, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNotIn(List<Integer> values) {
            addCriterion("goods_grade not in", values, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeBetween(Integer value1, Integer value2) {
            addCriterion("goods_grade between", value1, value2, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_grade not between", value1, value2, "goodsGrade");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdIsNull() {
            addCriterion("to_evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdIsNotNull() {
            addCriterion("to_evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdEqualTo(Integer value) {
            addCriterion("to_evaluate_id =", value, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdNotEqualTo(Integer value) {
            addCriterion("to_evaluate_id <>", value, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdGreaterThan(Integer value) {
            addCriterion("to_evaluate_id >", value, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_evaluate_id >=", value, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdLessThan(Integer value) {
            addCriterion("to_evaluate_id <", value, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_evaluate_id <=", value, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdIn(List<Integer> values) {
            addCriterion("to_evaluate_id in", values, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdNotIn(List<Integer> values) {
            addCriterion("to_evaluate_id not in", values, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdBetween(Integer value1, Integer value2) {
            addCriterion("to_evaluate_id between", value1, value2, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andToEvaluateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_evaluate_id not between", value1, value2, "toEvaluateId");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousIsNull() {
            addCriterion("if_anonymous is null");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousIsNotNull() {
            addCriterion("if_anonymous is not null");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousEqualTo(Integer value) {
            addCriterion("if_anonymous =", value, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousNotEqualTo(Integer value) {
            addCriterion("if_anonymous <>", value, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousGreaterThan(Integer value) {
            addCriterion("if_anonymous >", value, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_anonymous >=", value, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousLessThan(Integer value) {
            addCriterion("if_anonymous <", value, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousLessThanOrEqualTo(Integer value) {
            addCriterion("if_anonymous <=", value, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousIn(List<Integer> values) {
            addCriterion("if_anonymous in", values, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousNotIn(List<Integer> values) {
            addCriterion("if_anonymous not in", values, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousBetween(Integer value1, Integer value2) {
            addCriterion("if_anonymous between", value1, value2, "ifAnonymous");
            return (Criteria) this;
        }

        public Criteria andIfAnonymousNotBetween(Integer value1, Integer value2) {
            addCriterion("if_anonymous not between", value1, value2, "ifAnonymous");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}