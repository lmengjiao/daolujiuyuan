package com.xiexin.bean;

import java.util.ArrayList;
import java.util.List;

public class SyslogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SyslogExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("`MODULE` is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("`MODULE` is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("`MODULE` =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("`MODULE` <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("`MODULE` >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("`MODULE` >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("`MODULE` <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("`MODULE` <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("`MODULE` like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("`MODULE` not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("`MODULE` in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("`MODULE` not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("`MODULE` between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("`MODULE` not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("`METHOD` is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("`METHOD` is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("`METHOD` =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("`METHOD` <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("`METHOD` >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("`METHOD` >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("`METHOD` <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("`METHOD` <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("`METHOD` like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("`METHOD` not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("`METHOD` in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("`METHOD` not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("`METHOD` between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("`METHOD` not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andResponseDateIsNull() {
            addCriterion("RESPONSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andResponseDateIsNotNull() {
            addCriterion("RESPONSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andResponseDateEqualTo(String value) {
            addCriterion("RESPONSE_DATE =", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateNotEqualTo(String value) {
            addCriterion("RESPONSE_DATE <>", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateGreaterThan(String value) {
            addCriterion("RESPONSE_DATE >", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSE_DATE >=", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateLessThan(String value) {
            addCriterion("RESPONSE_DATE <", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateLessThanOrEqualTo(String value) {
            addCriterion("RESPONSE_DATE <=", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateLike(String value) {
            addCriterion("RESPONSE_DATE like", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateNotLike(String value) {
            addCriterion("RESPONSE_DATE not like", value, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateIn(List<String> values) {
            addCriterion("RESPONSE_DATE in", values, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateNotIn(List<String> values) {
            addCriterion("RESPONSE_DATE not in", values, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateBetween(String value1, String value2) {
            addCriterion("RESPONSE_DATE between", value1, value2, "responseDate");
            return (Criteria) this;
        }

        public Criteria andResponseDateNotBetween(String value1, String value2) {
            addCriterion("RESPONSE_DATE not between", value1, value2, "responseDate");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andDatesIsNull() {
            addCriterion("DATES is null");
            return (Criteria) this;
        }

        public Criteria andDatesIsNotNull() {
            addCriterion("DATES is not null");
            return (Criteria) this;
        }

        public Criteria andDatesEqualTo(String value) {
            addCriterion("DATES =", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesNotEqualTo(String value) {
            addCriterion("DATES <>", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesGreaterThan(String value) {
            addCriterion("DATES >", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesGreaterThanOrEqualTo(String value) {
            addCriterion("DATES >=", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesLessThan(String value) {
            addCriterion("DATES <", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesLessThanOrEqualTo(String value) {
            addCriterion("DATES <=", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesLike(String value) {
            addCriterion("DATES like", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesNotLike(String value) {
            addCriterion("DATES not like", value, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesIn(List<String> values) {
            addCriterion("DATES in", values, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesNotIn(List<String> values) {
            addCriterion("DATES not in", values, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesBetween(String value1, String value2) {
            addCriterion("DATES between", value1, value2, "dates");
            return (Criteria) this;
        }

        public Criteria andDatesNotBetween(String value1, String value2) {
            addCriterion("DATES not between", value1, value2, "dates");
            return (Criteria) this;
        }

        public Criteria andCommitIsNull() {
            addCriterion("`COMMIT` is null");
            return (Criteria) this;
        }

        public Criteria andCommitIsNotNull() {
            addCriterion("`COMMIT` is not null");
            return (Criteria) this;
        }

        public Criteria andCommitEqualTo(String value) {
            addCriterion("`COMMIT` =", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitNotEqualTo(String value) {
            addCriterion("`COMMIT` <>", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitGreaterThan(String value) {
            addCriterion("`COMMIT` >", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitGreaterThanOrEqualTo(String value) {
            addCriterion("`COMMIT` >=", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitLessThan(String value) {
            addCriterion("`COMMIT` <", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitLessThanOrEqualTo(String value) {
            addCriterion("`COMMIT` <=", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitLike(String value) {
            addCriterion("`COMMIT` like", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitNotLike(String value) {
            addCriterion("`COMMIT` not like", value, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitIn(List<String> values) {
            addCriterion("`COMMIT` in", values, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitNotIn(List<String> values) {
            addCriterion("`COMMIT` not in", values, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitBetween(String value1, String value2) {
            addCriterion("`COMMIT` between", value1, value2, "commit");
            return (Criteria) this;
        }

        public Criteria andCommitNotBetween(String value1, String value2) {
            addCriterion("`COMMIT` not between", value1, value2, "commit");
            return (Criteria) this;
        }
    }

    /**
     */
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