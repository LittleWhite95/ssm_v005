package com.demo.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMimgIsNull() {
            addCriterion("mimg is null");
            return (Criteria) this;
        }

        public Criteria andMimgIsNotNull() {
            addCriterion("mimg is not null");
            return (Criteria) this;
        }

        public Criteria andMimgEqualTo(String value) {
            addCriterion("mimg =", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotEqualTo(String value) {
            addCriterion("mimg <>", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgGreaterThan(String value) {
            addCriterion("mimg >", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgGreaterThanOrEqualTo(String value) {
            addCriterion("mimg >=", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgLessThan(String value) {
            addCriterion("mimg <", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgLessThanOrEqualTo(String value) {
            addCriterion("mimg <=", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgLike(String value) {
            addCriterion("mimg like", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotLike(String value) {
            addCriterion("mimg not like", value, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgIn(List<String> values) {
            addCriterion("mimg in", values, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotIn(List<String> values) {
            addCriterion("mimg not in", values, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgBetween(String value1, String value2) {
            addCriterion("mimg between", value1, value2, "mimg");
            return (Criteria) this;
        }

        public Criteria andMimgNotBetween(String value1, String value2) {
            addCriterion("mimg not between", value1, value2, "mimg");
            return (Criteria) this;
        }

        public Criteria andMexpIsNull() {
            addCriterion("mexp is null");
            return (Criteria) this;
        }

        public Criteria andMexpIsNotNull() {
            addCriterion("mexp is not null");
            return (Criteria) this;
        }

        public Criteria andMexpEqualTo(String value) {
            addCriterion("mexp =", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpNotEqualTo(String value) {
            addCriterion("mexp <>", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpGreaterThan(String value) {
            addCriterion("mexp >", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpGreaterThanOrEqualTo(String value) {
            addCriterion("mexp >=", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpLessThan(String value) {
            addCriterion("mexp <", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpLessThanOrEqualTo(String value) {
            addCriterion("mexp <=", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpLike(String value) {
            addCriterion("mexp like", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpNotLike(String value) {
            addCriterion("mexp not like", value, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpIn(List<String> values) {
            addCriterion("mexp in", values, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpNotIn(List<String> values) {
            addCriterion("mexp not in", values, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpBetween(String value1, String value2) {
            addCriterion("mexp between", value1, value2, "mexp");
            return (Criteria) this;
        }

        public Criteria andMexpNotBetween(String value1, String value2) {
            addCriterion("mexp not between", value1, value2, "mexp");
            return (Criteria) this;
        }

        public Criteria andMjobIsNull() {
            addCriterion("mjob is null");
            return (Criteria) this;
        }

        public Criteria andMjobIsNotNull() {
            addCriterion("mjob is not null");
            return (Criteria) this;
        }

        public Criteria andMjobEqualTo(String value) {
            addCriterion("mjob =", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobNotEqualTo(String value) {
            addCriterion("mjob <>", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobGreaterThan(String value) {
            addCriterion("mjob >", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobGreaterThanOrEqualTo(String value) {
            addCriterion("mjob >=", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobLessThan(String value) {
            addCriterion("mjob <", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobLessThanOrEqualTo(String value) {
            addCriterion("mjob <=", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobLike(String value) {
            addCriterion("mjob like", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobNotLike(String value) {
            addCriterion("mjob not like", value, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobIn(List<String> values) {
            addCriterion("mjob in", values, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobNotIn(List<String> values) {
            addCriterion("mjob not in", values, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobBetween(String value1, String value2) {
            addCriterion("mjob between", value1, value2, "mjob");
            return (Criteria) this;
        }

        public Criteria andMjobNotBetween(String value1, String value2) {
            addCriterion("mjob not between", value1, value2, "mjob");
            return (Criteria) this;
        }

        public Criteria andMskillIsNull() {
            addCriterion("mskill is null");
            return (Criteria) this;
        }

        public Criteria andMskillIsNotNull() {
            addCriterion("mskill is not null");
            return (Criteria) this;
        }

        public Criteria andMskillEqualTo(String value) {
            addCriterion("mskill =", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillNotEqualTo(String value) {
            addCriterion("mskill <>", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillGreaterThan(String value) {
            addCriterion("mskill >", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillGreaterThanOrEqualTo(String value) {
            addCriterion("mskill >=", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillLessThan(String value) {
            addCriterion("mskill <", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillLessThanOrEqualTo(String value) {
            addCriterion("mskill <=", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillLike(String value) {
            addCriterion("mskill like", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillNotLike(String value) {
            addCriterion("mskill not like", value, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillIn(List<String> values) {
            addCriterion("mskill in", values, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillNotIn(List<String> values) {
            addCriterion("mskill not in", values, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillBetween(String value1, String value2) {
            addCriterion("mskill between", value1, value2, "mskill");
            return (Criteria) this;
        }

        public Criteria andMskillNotBetween(String value1, String value2) {
            addCriterion("mskill not between", value1, value2, "mskill");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNull() {
            addCriterion("mphone is null");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNotNull() {
            addCriterion("mphone is not null");
            return (Criteria) this;
        }

        public Criteria andMphoneEqualTo(String value) {
            addCriterion("mphone =", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotEqualTo(String value) {
            addCriterion("mphone <>", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThan(String value) {
            addCriterion("mphone >", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mphone >=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThan(String value) {
            addCriterion("mphone <", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThanOrEqualTo(String value) {
            addCriterion("mphone <=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLike(String value) {
            addCriterion("mphone like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotLike(String value) {
            addCriterion("mphone not like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIn(List<String> values) {
            addCriterion("mphone in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotIn(List<String> values) {
            addCriterion("mphone not in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneBetween(String value1, String value2) {
            addCriterion("mphone between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotBetween(String value1, String value2) {
            addCriterion("mphone not between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMqqIsNull() {
            addCriterion("mqq is null");
            return (Criteria) this;
        }

        public Criteria andMqqIsNotNull() {
            addCriterion("mqq is not null");
            return (Criteria) this;
        }

        public Criteria andMqqEqualTo(String value) {
            addCriterion("mqq =", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqNotEqualTo(String value) {
            addCriterion("mqq <>", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqGreaterThan(String value) {
            addCriterion("mqq >", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqGreaterThanOrEqualTo(String value) {
            addCriterion("mqq >=", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqLessThan(String value) {
            addCriterion("mqq <", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqLessThanOrEqualTo(String value) {
            addCriterion("mqq <=", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqLike(String value) {
            addCriterion("mqq like", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqNotLike(String value) {
            addCriterion("mqq not like", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqIn(List<String> values) {
            addCriterion("mqq in", values, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqNotIn(List<String> values) {
            addCriterion("mqq not in", values, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqBetween(String value1, String value2) {
            addCriterion("mqq between", value1, value2, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqNotBetween(String value1, String value2) {
            addCriterion("mqq not between", value1, value2, "mqq");
            return (Criteria) this;
        }

        public Criteria andMstatusIsNull() {
            addCriterion("mstatus is null");
            return (Criteria) this;
        }

        public Criteria andMstatusIsNotNull() {
            addCriterion("mstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMstatusEqualTo(String value) {
            addCriterion("mstatus =", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusNotEqualTo(String value) {
            addCriterion("mstatus <>", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusGreaterThan(String value) {
            addCriterion("mstatus >", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusGreaterThanOrEqualTo(String value) {
            addCriterion("mstatus >=", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusLessThan(String value) {
            addCriterion("mstatus <", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusLessThanOrEqualTo(String value) {
            addCriterion("mstatus <=", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusLike(String value) {
            addCriterion("mstatus like", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusNotLike(String value) {
            addCriterion("mstatus not like", value, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusIn(List<String> values) {
            addCriterion("mstatus in", values, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusNotIn(List<String> values) {
            addCriterion("mstatus not in", values, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusBetween(String value1, String value2) {
            addCriterion("mstatus between", value1, value2, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMstatusNotBetween(String value1, String value2) {
            addCriterion("mstatus not between", value1, value2, "mstatus");
            return (Criteria) this;
        }

        public Criteria andMiteamidIsNull() {
            addCriterion("miteamid is null");
            return (Criteria) this;
        }

        public Criteria andMiteamidIsNotNull() {
            addCriterion("miteamid is not null");
            return (Criteria) this;
        }

        public Criteria andMiteamidEqualTo(Integer value) {
            addCriterion("miteamid =", value, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidNotEqualTo(Integer value) {
            addCriterion("miteamid <>", value, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidGreaterThan(Integer value) {
            addCriterion("miteamid >", value, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("miteamid >=", value, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidLessThan(Integer value) {
            addCriterion("miteamid <", value, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidLessThanOrEqualTo(Integer value) {
            addCriterion("miteamid <=", value, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidIn(List<Integer> values) {
            addCriterion("miteamid in", values, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidNotIn(List<Integer> values) {
            addCriterion("miteamid not in", values, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidBetween(Integer value1, Integer value2) {
            addCriterion("miteamid between", value1, value2, "miteamid");
            return (Criteria) this;
        }

        public Criteria andMiteamidNotBetween(Integer value1, Integer value2) {
            addCriterion("miteamid not between", value1, value2, "miteamid");
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