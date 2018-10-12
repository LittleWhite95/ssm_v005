package com.demo.ssm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTstatusIsNull() {
            addCriterion("tstatus is null");
            return (Criteria) this;
        }

        public Criteria andTstatusIsNotNull() {
            addCriterion("tstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTstatusEqualTo(String value) {
            addCriterion("tstatus =", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotEqualTo(String value) {
            addCriterion("tstatus <>", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusGreaterThan(String value) {
            addCriterion("tstatus >", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tstatus >=", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLessThan(String value) {
            addCriterion("tstatus <", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLessThanOrEqualTo(String value) {
            addCriterion("tstatus <=", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLike(String value) {
            addCriterion("tstatus like", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotLike(String value) {
            addCriterion("tstatus not like", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusIn(List<String> values) {
            addCriterion("tstatus in", values, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotIn(List<String> values) {
            addCriterion("tstatus not in", values, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusBetween(String value1, String value2) {
            addCriterion("tstatus between", value1, value2, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotBetween(String value1, String value2) {
            addCriterion("tstatus not between", value1, value2, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTlogoIsNull() {
            addCriterion("tlogo is null");
            return (Criteria) this;
        }

        public Criteria andTlogoIsNotNull() {
            addCriterion("tlogo is not null");
            return (Criteria) this;
        }

        public Criteria andTlogoEqualTo(String value) {
            addCriterion("tlogo =", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotEqualTo(String value) {
            addCriterion("tlogo <>", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoGreaterThan(String value) {
            addCriterion("tlogo >", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoGreaterThanOrEqualTo(String value) {
            addCriterion("tlogo >=", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoLessThan(String value) {
            addCriterion("tlogo <", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoLessThanOrEqualTo(String value) {
            addCriterion("tlogo <=", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoLike(String value) {
            addCriterion("tlogo like", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotLike(String value) {
            addCriterion("tlogo not like", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoIn(List<String> values) {
            addCriterion("tlogo in", values, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotIn(List<String> values) {
            addCriterion("tlogo not in", values, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoBetween(String value1, String value2) {
            addCriterion("tlogo between", value1, value2, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotBetween(String value1, String value2) {
            addCriterion("tlogo not between", value1, value2, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTimgIsNull() {
            addCriterion("timg is null");
            return (Criteria) this;
        }

        public Criteria andTimgIsNotNull() {
            addCriterion("timg is not null");
            return (Criteria) this;
        }

        public Criteria andTimgEqualTo(String value) {
            addCriterion("timg =", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotEqualTo(String value) {
            addCriterion("timg <>", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgGreaterThan(String value) {
            addCriterion("timg >", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgGreaterThanOrEqualTo(String value) {
            addCriterion("timg >=", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLessThan(String value) {
            addCriterion("timg <", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLessThanOrEqualTo(String value) {
            addCriterion("timg <=", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLike(String value) {
            addCriterion("timg like", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotLike(String value) {
            addCriterion("timg not like", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgIn(List<String> values) {
            addCriterion("timg in", values, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotIn(List<String> values) {
            addCriterion("timg not in", values, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgBetween(String value1, String value2) {
            addCriterion("timg between", value1, value2, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotBetween(String value1, String value2) {
            addCriterion("timg not between", value1, value2, "timg");
            return (Criteria) this;
        }

        public Criteria andTsloganIsNull() {
            addCriterion("tslogan is null");
            return (Criteria) this;
        }

        public Criteria andTsloganIsNotNull() {
            addCriterion("tslogan is not null");
            return (Criteria) this;
        }

        public Criteria andTsloganEqualTo(String value) {
            addCriterion("tslogan =", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganNotEqualTo(String value) {
            addCriterion("tslogan <>", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganGreaterThan(String value) {
            addCriterion("tslogan >", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganGreaterThanOrEqualTo(String value) {
            addCriterion("tslogan >=", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganLessThan(String value) {
            addCriterion("tslogan <", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganLessThanOrEqualTo(String value) {
            addCriterion("tslogan <=", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganLike(String value) {
            addCriterion("tslogan like", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganNotLike(String value) {
            addCriterion("tslogan not like", value, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganIn(List<String> values) {
            addCriterion("tslogan in", values, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganNotIn(List<String> values) {
            addCriterion("tslogan not in", values, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganBetween(String value1, String value2) {
            addCriterion("tslogan between", value1, value2, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTsloganNotBetween(String value1, String value2) {
            addCriterion("tslogan not between", value1, value2, "tslogan");
            return (Criteria) this;
        }

        public Criteria andTdescIsNull() {
            addCriterion("tdesc is null");
            return (Criteria) this;
        }

        public Criteria andTdescIsNotNull() {
            addCriterion("tdesc is not null");
            return (Criteria) this;
        }

        public Criteria andTdescEqualTo(String value) {
            addCriterion("tdesc =", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescNotEqualTo(String value) {
            addCriterion("tdesc <>", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescGreaterThan(String value) {
            addCriterion("tdesc >", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescGreaterThanOrEqualTo(String value) {
            addCriterion("tdesc >=", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescLessThan(String value) {
            addCriterion("tdesc <", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescLessThanOrEqualTo(String value) {
            addCriterion("tdesc <=", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescLike(String value) {
            addCriterion("tdesc like", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescNotLike(String value) {
            addCriterion("tdesc not like", value, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescIn(List<String> values) {
            addCriterion("tdesc in", values, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescNotIn(List<String> values) {
            addCriterion("tdesc not in", values, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescBetween(String value1, String value2) {
            addCriterion("tdesc between", value1, value2, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTdescNotBetween(String value1, String value2) {
            addCriterion("tdesc not between", value1, value2, "tdesc");
            return (Criteria) this;
        }

        public Criteria andTpmIsNull() {
            addCriterion("tpm is null");
            return (Criteria) this;
        }

        public Criteria andTpmIsNotNull() {
            addCriterion("tpm is not null");
            return (Criteria) this;
        }

        public Criteria andTpmEqualTo(String value) {
            addCriterion("tpm =", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmNotEqualTo(String value) {
            addCriterion("tpm <>", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmGreaterThan(String value) {
            addCriterion("tpm >", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmGreaterThanOrEqualTo(String value) {
            addCriterion("tpm >=", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmLessThan(String value) {
            addCriterion("tpm <", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmLessThanOrEqualTo(String value) {
            addCriterion("tpm <=", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmLike(String value) {
            addCriterion("tpm like", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmNotLike(String value) {
            addCriterion("tpm not like", value, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmIn(List<String> values) {
            addCriterion("tpm in", values, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmNotIn(List<String> values) {
            addCriterion("tpm not in", values, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmBetween(String value1, String value2) {
            addCriterion("tpm between", value1, value2, "tpm");
            return (Criteria) this;
        }

        public Criteria andTpmNotBetween(String value1, String value2) {
            addCriterion("tpm not between", value1, value2, "tpm");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNull() {
            addCriterion("ttime is null");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNotNull() {
            addCriterion("ttime is not null");
            return (Criteria) this;
        }

        public Criteria andTtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ttime =", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ttime <>", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ttime >", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ttime >=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThan(Date value) {
            addCriterionForJDBCDate("ttime <", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ttime <=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ttime in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ttime not in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ttime between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ttime not between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andTmoneyIsNull() {
            addCriterion("tmoney is null");
            return (Criteria) this;
        }

        public Criteria andTmoneyIsNotNull() {
            addCriterion("tmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTmoneyEqualTo(Double value) {
            addCriterion("tmoney =", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyNotEqualTo(Double value) {
            addCriterion("tmoney <>", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyGreaterThan(Double value) {
            addCriterion("tmoney >", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("tmoney >=", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyLessThan(Double value) {
            addCriterion("tmoney <", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyLessThanOrEqualTo(Double value) {
            addCriterion("tmoney <=", value, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyIn(List<Double> values) {
            addCriterion("tmoney in", values, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyNotIn(List<Double> values) {
            addCriterion("tmoney not in", values, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyBetween(Double value1, Double value2) {
            addCriterion("tmoney between", value1, value2, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTmoneyNotBetween(Double value1, Double value2) {
            addCriterion("tmoney not between", value1, value2, "tmoney");
            return (Criteria) this;
        }

        public Criteria andTcontractIsNull() {
            addCriterion("tcontract is null");
            return (Criteria) this;
        }

        public Criteria andTcontractIsNotNull() {
            addCriterion("tcontract is not null");
            return (Criteria) this;
        }

        public Criteria andTcontractEqualTo(String value) {
            addCriterion("tcontract =", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractNotEqualTo(String value) {
            addCriterion("tcontract <>", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractGreaterThan(String value) {
            addCriterion("tcontract >", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractGreaterThanOrEqualTo(String value) {
            addCriterion("tcontract >=", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractLessThan(String value) {
            addCriterion("tcontract <", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractLessThanOrEqualTo(String value) {
            addCriterion("tcontract <=", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractLike(String value) {
            addCriterion("tcontract like", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractNotLike(String value) {
            addCriterion("tcontract not like", value, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractIn(List<String> values) {
            addCriterion("tcontract in", values, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractNotIn(List<String> values) {
            addCriterion("tcontract not in", values, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractBetween(String value1, String value2) {
            addCriterion("tcontract between", value1, value2, "tcontract");
            return (Criteria) this;
        }

        public Criteria andTcontractNotBetween(String value1, String value2) {
            addCriterion("tcontract not between", value1, value2, "tcontract");
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