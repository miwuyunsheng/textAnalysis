package analysis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public DocumentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
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
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNull() {
            addCriterion("docname is null");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNotNull() {
            addCriterion("docname is not null");
            return (Criteria) this;
        }

        public Criteria andDocnameEqualTo(String value) {
            addCriterion("docname =", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotEqualTo(String value) {
            addCriterion("docname <>", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThan(String value) {
            addCriterion("docname >", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThanOrEqualTo(String value) {
            addCriterion("docname >=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThan(String value) {
            addCriterion("docname <", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThanOrEqualTo(String value) {
            addCriterion("docname <=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLike(String value) {
            addCriterion("docname like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotLike(String value) {
            addCriterion("docname not like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameIn(List<String> values) {
            addCriterion("docname in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotIn(List<String> values) {
            addCriterion("docname not in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameBetween(String value1, String value2) {
            addCriterion("docname between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotBetween(String value1, String value2) {
            addCriterion("docname not between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocpathIsNull() {
            addCriterion("docpath is null");
            return (Criteria) this;
        }

        public Criteria andDocpathIsNotNull() {
            addCriterion("docpath is not null");
            return (Criteria) this;
        }

        public Criteria andDocpathEqualTo(String value) {
            addCriterion("docpath =", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotEqualTo(String value) {
            addCriterion("docpath <>", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathGreaterThan(String value) {
            addCriterion("docpath >", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathGreaterThanOrEqualTo(String value) {
            addCriterion("docpath >=", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLessThan(String value) {
            addCriterion("docpath <", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLessThanOrEqualTo(String value) {
            addCriterion("docpath <=", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLike(String value) {
            addCriterion("docpath like", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotLike(String value) {
            addCriterion("docpath not like", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathIn(List<String> values) {
            addCriterion("docpath in", values, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotIn(List<String> values) {
            addCriterion("docpath not in", values, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathBetween(String value1, String value2) {
            addCriterion("docpath between", value1, value2, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotBetween(String value1, String value2) {
            addCriterion("docpath not between", value1, value2, "docpath");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDocsetidIsNull() {
            addCriterion("docsetid is null");
            return (Criteria) this;
        }

        public Criteria andDocsetidIsNotNull() {
            addCriterion("docsetid is not null");
            return (Criteria) this;
        }

        public Criteria andDocsetidEqualTo(String value) {
            addCriterion("docsetid =", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidNotEqualTo(String value) {
            addCriterion("docsetid <>", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidGreaterThan(String value) {
            addCriterion("docsetid >", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidGreaterThanOrEqualTo(String value) {
            addCriterion("docsetid >=", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidLessThan(String value) {
            addCriterion("docsetid <", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidLessThanOrEqualTo(String value) {
            addCriterion("docsetid <=", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidLike(String value) {
            addCriterion("docsetid like", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidNotLike(String value) {
            addCriterion("docsetid not like", value, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidIn(List<String> values) {
            addCriterion("docsetid in", values, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidNotIn(List<String> values) {
            addCriterion("docsetid not in", values, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidBetween(String value1, String value2) {
            addCriterion("docsetid between", value1, value2, "docsetid");
            return (Criteria) this;
        }

        public Criteria andDocsetidNotBetween(String value1, String value2) {
            addCriterion("docsetid not between", value1, value2, "docsetid");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdIsNull() {
            addCriterion("indicator_sys_id is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdIsNotNull() {
            addCriterion("indicator_sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdEqualTo(String value) {
            addCriterion("indicator_sys_id =", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdNotEqualTo(String value) {
            addCriterion("indicator_sys_id <>", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdGreaterThan(String value) {
            addCriterion("indicator_sys_id >", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("indicator_sys_id >=", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdLessThan(String value) {
            addCriterion("indicator_sys_id <", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdLessThanOrEqualTo(String value) {
            addCriterion("indicator_sys_id <=", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdLike(String value) {
            addCriterion("indicator_sys_id like", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdNotLike(String value) {
            addCriterion("indicator_sys_id not like", value, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdIn(List<String> values) {
            addCriterion("indicator_sys_id in", values, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdNotIn(List<String> values) {
            addCriterion("indicator_sys_id not in", values, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdBetween(String value1, String value2) {
            addCriterion("indicator_sys_id between", value1, value2, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andIndicatorSysIdNotBetween(String value1, String value2) {
            addCriterion("indicator_sys_id not between", value1, value2, "indicatorSysId");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table document
     *
     * @mbggenerated do_not_delete_during_merge Sat Apr 15 10:18:32 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table document
     *
     * @mbggenerated Sat Apr 15 10:18:32 CST 2017
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