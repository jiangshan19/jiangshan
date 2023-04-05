package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DdExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDdbhIsNull() {
            addCriterion("ddbh is null");
            return (Criteria) this;
        }

        public Criteria andDdbhIsNotNull() {
            addCriterion("ddbh is not null");
            return (Criteria) this;
        }

        public Criteria andDdbhEqualTo(String value) {
            addCriterion("ddbh =", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotEqualTo(String value) {
            addCriterion("ddbh <>", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhGreaterThan(String value) {
            addCriterion("ddbh >", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhGreaterThanOrEqualTo(String value) {
            addCriterion("ddbh >=", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhLessThan(String value) {
            addCriterion("ddbh <", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhLessThanOrEqualTo(String value) {
            addCriterion("ddbh <=", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhLike(String value) {
            addCriterion("ddbh like", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotLike(String value) {
            addCriterion("ddbh not like", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhIn(List<String> values) {
            addCriterion("ddbh in", values, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotIn(List<String> values) {
            addCriterion("ddbh not in", values, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhBetween(String value1, String value2) {
            addCriterion("ddbh between", value1, value2, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotBetween(String value1, String value2) {
            addCriterion("ddbh not between", value1, value2, "ddbh");
            return (Criteria) this;
        }

        public Criteria andZjIsNull() {
            addCriterion("zj is null");
            return (Criteria) this;
        }

        public Criteria andZjIsNotNull() {
            addCriterion("zj is not null");
            return (Criteria) this;
        }

        public Criteria andZjEqualTo(Float value) {
            addCriterion("zj =", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotEqualTo(Float value) {
            addCriterion("zj <>", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThan(Float value) {
            addCriterion("zj >", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThanOrEqualTo(Float value) {
            addCriterion("zj >=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThan(Float value) {
            addCriterion("zj <", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThanOrEqualTo(Float value) {
            addCriterion("zj <=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjIn(List<Float> values) {
            addCriterion("zj in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotIn(List<Float> values) {
            addCriterion("zj not in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjBetween(Float value1, Float value2) {
            addCriterion("zj between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotBetween(Float value1, Float value2) {
            addCriterion("zj not between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("dh is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("dh is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("dh =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("dh <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("dh >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("dh >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("dh <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("dh <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("dh like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("dh not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("dh in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("dh not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("dh between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("dh not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("dz is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("dz is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(String value) {
            addCriterion("dz =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(String value) {
            addCriterion("dz <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(String value) {
            addCriterion("dz >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(String value) {
            addCriterion("dz >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(String value) {
            addCriterion("dz <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(String value) {
            addCriterion("dz <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLike(String value) {
            addCriterion("dz like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotLike(String value) {
            addCriterion("dz not like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<String> values) {
            addCriterion("dz in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<String> values) {
            addCriterion("dz not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(String value1, String value2) {
            addCriterion("dz between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(String value1, String value2) {
            addCriterion("dz not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(String value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(String value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(String value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(String value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(String value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(String value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLike(String value) {
            addCriterion("member like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotLike(String value) {
            addCriterion("member not like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<String> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<String> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(String value1, String value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(String value1, String value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("sj is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("sj is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(Date value) {
            addCriterion("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(Date value) {
            addCriterion("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(Date value) {
            addCriterion("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(Date value) {
            addCriterion("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(Date value) {
            addCriterion("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(Date value) {
            addCriterion("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<Date> values) {
            addCriterion("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<Date> values) {
            addCriterion("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(Date value1, Date value2) {
            addCriterion("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(Date value1, Date value2) {
            addCriterion("sj not between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andQxIsNull() {
            addCriterion("qx is null");
            return (Criteria) this;
        }

        public Criteria andQxIsNotNull() {
            addCriterion("qx is not null");
            return (Criteria) this;
        }

        public Criteria andQxEqualTo(String value) {
            addCriterion("qx =", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotEqualTo(String value) {
            addCriterion("qx <>", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxGreaterThan(String value) {
            addCriterion("qx >", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxGreaterThanOrEqualTo(String value) {
            addCriterion("qx >=", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxLessThan(String value) {
            addCriterion("qx <", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxLessThanOrEqualTo(String value) {
            addCriterion("qx <=", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxLike(String value) {
            addCriterion("qx like", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotLike(String value) {
            addCriterion("qx not like", value, "qx");
            return (Criteria) this;
        }

        public Criteria andQxIn(List<String> values) {
            addCriterion("qx in", values, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotIn(List<String> values) {
            addCriterion("qx not in", values, "qx");
            return (Criteria) this;
        }

        public Criteria andQxBetween(String value1, String value2) {
            addCriterion("qx between", value1, value2, "qx");
            return (Criteria) this;
        }

        public Criteria andQxNotBetween(String value1, String value2) {
            addCriterion("qx not between", value1, value2, "qx");
            return (Criteria) this;
        }

        public Criteria andFhIsNull() {
            addCriterion("fh is null");
            return (Criteria) this;
        }

        public Criteria andFhIsNotNull() {
            addCriterion("fh is not null");
            return (Criteria) this;
        }

        public Criteria andFhEqualTo(String value) {
            addCriterion("fh =", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotEqualTo(String value) {
            addCriterion("fh <>", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThan(String value) {
            addCriterion("fh >", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhGreaterThanOrEqualTo(String value) {
            addCriterion("fh >=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThan(String value) {
            addCriterion("fh <", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLessThanOrEqualTo(String value) {
            addCriterion("fh <=", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhLike(String value) {
            addCriterion("fh like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotLike(String value) {
            addCriterion("fh not like", value, "fh");
            return (Criteria) this;
        }

        public Criteria andFhIn(List<String> values) {
            addCriterion("fh in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotIn(List<String> values) {
            addCriterion("fh not in", values, "fh");
            return (Criteria) this;
        }

        public Criteria andFhBetween(String value1, String value2) {
            addCriterion("fh between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andFhNotBetween(String value1, String value2) {
            addCriterion("fh not between", value1, value2, "fh");
            return (Criteria) this;
        }

        public Criteria andShIsNull() {
            addCriterion("sh is null");
            return (Criteria) this;
        }

        public Criteria andShIsNotNull() {
            addCriterion("sh is not null");
            return (Criteria) this;
        }

        public Criteria andShEqualTo(String value) {
            addCriterion("sh =", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotEqualTo(String value) {
            addCriterion("sh <>", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShGreaterThan(String value) {
            addCriterion("sh >", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShGreaterThanOrEqualTo(String value) {
            addCriterion("sh >=", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShLessThan(String value) {
            addCriterion("sh <", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShLessThanOrEqualTo(String value) {
            addCriterion("sh <=", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShLike(String value) {
            addCriterion("sh like", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotLike(String value) {
            addCriterion("sh not like", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShIn(List<String> values) {
            addCriterion("sh in", values, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotIn(List<String> values) {
            addCriterion("sh not in", values, "sh");
            return (Criteria) this;
        }

        public Criteria andShBetween(String value1, String value2) {
            addCriterion("sh between", value1, value2, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotBetween(String value1, String value2) {
            addCriterion("sh not between", value1, value2, "sh");
            return (Criteria) this;
        }

        public Criteria andGysIsNull() {
            addCriterion("gys is null");
            return (Criteria) this;
        }

        public Criteria andGysIsNotNull() {
            addCriterion("gys is not null");
            return (Criteria) this;
        }

        public Criteria andGysEqualTo(String value) {
            addCriterion("gys =", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysNotEqualTo(String value) {
            addCriterion("gys <>", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysGreaterThan(String value) {
            addCriterion("gys >", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysGreaterThanOrEqualTo(String value) {
            addCriterion("gys >=", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysLessThan(String value) {
            addCriterion("gys <", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysLessThanOrEqualTo(String value) {
            addCriterion("gys <=", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysLike(String value) {
            addCriterion("gys like", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysNotLike(String value) {
            addCriterion("gys not like", value, "gys");
            return (Criteria) this;
        }

        public Criteria andGysIn(List<String> values) {
            addCriterion("gys in", values, "gys");
            return (Criteria) this;
        }

        public Criteria andGysNotIn(List<String> values) {
            addCriterion("gys not in", values, "gys");
            return (Criteria) this;
        }

        public Criteria andGysBetween(String value1, String value2) {
            addCriterion("gys between", value1, value2, "gys");
            return (Criteria) this;
        }

        public Criteria andGysNotBetween(String value1, String value2) {
            addCriterion("gys not between", value1, value2, "gys");
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