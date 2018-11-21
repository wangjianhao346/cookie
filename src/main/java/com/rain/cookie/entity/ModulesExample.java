package com.rain.cookie.entity;

import java.util.ArrayList;
import java.util.List;

public class ModulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModulesExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("MODULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("MODULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("MODULE_NAME =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("MODULE_NAME <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("MODULE_NAME >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("MODULE_NAME <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("MODULE_NAME like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("MODULE_NAME not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("MODULE_NAME in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("MODULE_NAME not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("MODULE_NAME between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("MODULE_NAME not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("IS_DELETE like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("IS_DELETE not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andArticleAmountIsNull() {
            addCriterion("ARTICLE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andArticleAmountIsNotNull() {
            addCriterion("ARTICLE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAmountEqualTo(Integer value) {
            addCriterion("ARTICLE_AMOUNT =", value, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountNotEqualTo(Integer value) {
            addCriterion("ARTICLE_AMOUNT <>", value, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountGreaterThan(Integer value) {
            addCriterion("ARTICLE_AMOUNT >", value, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARTICLE_AMOUNT >=", value, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountLessThan(Integer value) {
            addCriterion("ARTICLE_AMOUNT <", value, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountLessThanOrEqualTo(Integer value) {
            addCriterion("ARTICLE_AMOUNT <=", value, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountIn(List<Integer> values) {
            addCriterion("ARTICLE_AMOUNT in", values, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountNotIn(List<Integer> values) {
            addCriterion("ARTICLE_AMOUNT not in", values, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountBetween(Integer value1, Integer value2) {
            addCriterion("ARTICLE_AMOUNT between", value1, value2, "articleAmount");
            return (Criteria) this;
        }

        public Criteria andArticleAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("ARTICLE_AMOUNT not between", value1, value2, "articleAmount");
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