package com.ovwe.ticket.model.ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public TicketExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTrainIsNull() {
            addCriterion("train is null");
            return (Criteria) this;
        }

        public Criteria andTrainIsNotNull() {
            addCriterion("train is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEqualTo(String value) {
            addCriterion("train =", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotEqualTo(String value) {
            addCriterion("train <>", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainGreaterThan(String value) {
            addCriterion("train >", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainGreaterThanOrEqualTo(String value) {
            addCriterion("train >=", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainLessThan(String value) {
            addCriterion("train <", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainLessThanOrEqualTo(String value) {
            addCriterion("train <=", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainLike(String value) {
            addCriterion("train like", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotLike(String value) {
            addCriterion("train not like", value, "train");
            return (Criteria) this;
        }

        public Criteria andTrainIn(List<String> values) {
            addCriterion("train in", values, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotIn(List<String> values) {
            addCriterion("train not in", values, "train");
            return (Criteria) this;
        }

        public Criteria andTrainBetween(String value1, String value2) {
            addCriterion("train between", value1, value2, "train");
            return (Criteria) this;
        }

        public Criteria andTrainNotBetween(String value1, String value2) {
            addCriterion("train not between", value1, value2, "train");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNull() {
            addCriterion("carriage is null");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNotNull() {
            addCriterion("carriage is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageEqualTo(Integer value) {
            addCriterion("carriage =", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotEqualTo(Integer value) {
            addCriterion("carriage <>", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThan(Integer value) {
            addCriterion("carriage >", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThanOrEqualTo(Integer value) {
            addCriterion("carriage >=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThan(Integer value) {
            addCriterion("carriage <", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThanOrEqualTo(Integer value) {
            addCriterion("carriage <=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageIn(List<Integer> values) {
            addCriterion("carriage in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotIn(List<Integer> values) {
            addCriterion("carriage not in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageBetween(Integer value1, Integer value2) {
            addCriterion("carriage between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotBetween(Integer value1, Integer value2) {
            addCriterion("carriage not between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andRowNumberIsNull() {
            addCriterion("row_number is null");
            return (Criteria) this;
        }

        public Criteria andRowNumberIsNotNull() {
            addCriterion("row_number is not null");
            return (Criteria) this;
        }

        public Criteria andRowNumberEqualTo(Integer value) {
            addCriterion("row_number =", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberNotEqualTo(Integer value) {
            addCriterion("row_number <>", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberGreaterThan(Integer value) {
            addCriterion("row_number >", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_number >=", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberLessThan(Integer value) {
            addCriterion("row_number <", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberLessThanOrEqualTo(Integer value) {
            addCriterion("row_number <=", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberIn(List<Integer> values) {
            addCriterion("row_number in", values, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberNotIn(List<Integer> values) {
            addCriterion("row_number not in", values, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberBetween(Integer value1, Integer value2) {
            addCriterion("row_number between", value1, value2, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("row_number not between", value1, value2, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andAlphabetIsNull() {
            addCriterion("alphabet is null");
            return (Criteria) this;
        }

        public Criteria andAlphabetIsNotNull() {
            addCriterion("alphabet is not null");
            return (Criteria) this;
        }

        public Criteria andAlphabetEqualTo(String value) {
            addCriterion("alphabet =", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetNotEqualTo(String value) {
            addCriterion("alphabet <>", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetGreaterThan(String value) {
            addCriterion("alphabet >", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetGreaterThanOrEqualTo(String value) {
            addCriterion("alphabet >=", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetLessThan(String value) {
            addCriterion("alphabet <", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetLessThanOrEqualTo(String value) {
            addCriterion("alphabet <=", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetLike(String value) {
            addCriterion("alphabet like", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetNotLike(String value) {
            addCriterion("alphabet not like", value, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetIn(List<String> values) {
            addCriterion("alphabet in", values, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetNotIn(List<String> values) {
            addCriterion("alphabet not in", values, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetBetween(String value1, String value2) {
            addCriterion("alphabet between", value1, value2, "alphabet");
            return (Criteria) this;
        }

        public Criteria andAlphabetNotBetween(String value1, String value2) {
            addCriterion("alphabet not between", value1, value2, "alphabet");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(String value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(String value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(String value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(String value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(String value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(String value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLike(String value) {
            addCriterion("seat like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotLike(String value) {
            addCriterion("seat not like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<String> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<String> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(String value1, String value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(String value1, String value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ticket.ticket
     *
     * @mbg.generated do_not_delete_during_merge Mon Jan 28 09:23:44 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ticket.ticket
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
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