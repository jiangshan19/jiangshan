package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class GwcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GwcExample() {
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

        public Criteria andCpidIsNull() {
            addCriterion("cpid is null");
            return (Criteria) this;
        }

        public Criteria andCpidIsNotNull() {
            addCriterion("cpid is not null");
            return (Criteria) this;
        }

        public Criteria andCpidEqualTo(String value) {
            addCriterion("cpid =", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotEqualTo(String value) {
            addCriterion("cpid <>", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThan(String value) {
            addCriterion("cpid >", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThanOrEqualTo(String value) {
            addCriterion("cpid >=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThan(String value) {
            addCriterion("cpid <", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThanOrEqualTo(String value) {
            addCriterion("cpid <=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLike(String value) {
            addCriterion("cpid like", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotLike(String value) {
            addCriterion("cpid not like", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidIn(List<String> values) {
            addCriterion("cpid in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotIn(List<String> values) {
            addCriterion("cpid not in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidBetween(String value1, String value2) {
            addCriterion("cpid between", value1, value2, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotBetween(String value1, String value2) {
            addCriterion("cpid not between", value1, value2, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpmcIsNull() {
            addCriterion("cpmc is null");
            return (Criteria) this;
        }

        public Criteria andCpmcIsNotNull() {
            addCriterion("cpmc is not null");
            return (Criteria) this;
        }

        public Criteria andCpmcEqualTo(String value) {
            addCriterion("cpmc =", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotEqualTo(String value) {
            addCriterion("cpmc <>", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcGreaterThan(String value) {
            addCriterion("cpmc >", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcGreaterThanOrEqualTo(String value) {
            addCriterion("cpmc >=", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcLessThan(String value) {
            addCriterion("cpmc <", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcLessThanOrEqualTo(String value) {
            addCriterion("cpmc <=", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcLike(String value) {
            addCriterion("cpmc like", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotLike(String value) {
            addCriterion("cpmc not like", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcIn(List<String> values) {
            addCriterion("cpmc in", values, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotIn(List<String> values) {
            addCriterion("cpmc not in", values, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcBetween(String value1, String value2) {
            addCriterion("cpmc between", value1, value2, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotBetween(String value1, String value2) {
            addCriterion("cpmc not between", value1, value2, "cpmc");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("sl is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("sl is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(Integer value) {
            addCriterion("sl =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(Integer value) {
            addCriterion("sl <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(Integer value) {
            addCriterion("sl >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(Integer value) {
            addCriterion("sl >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(Integer value) {
            addCriterion("sl <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(Integer value) {
            addCriterion("sl <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<Integer> values) {
            addCriterion("sl in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<Integer> values) {
            addCriterion("sl not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(Integer value1, Integer value2) {
            addCriterion("sl between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(Integer value1, Integer value2) {
            addCriterion("sl not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("jg is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("jg is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("jg like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("jg not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("jg not between", value1, value2, "jg");
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

        public Criteria andFlIsNull() {
            addCriterion("fl is null");
            return (Criteria) this;
        }

        public Criteria andFlIsNotNull() {
            addCriterion("fl is not null");
            return (Criteria) this;
        }

        public Criteria andFlEqualTo(String value) {
            addCriterion("fl =", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotEqualTo(String value) {
            addCriterion("fl <>", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThan(String value) {
            addCriterion("fl >", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThanOrEqualTo(String value) {
            addCriterion("fl >=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThan(String value) {
            addCriterion("fl <", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThanOrEqualTo(String value) {
            addCriterion("fl <=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLike(String value) {
            addCriterion("fl like", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotLike(String value) {
            addCriterion("fl not like", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlIn(List<String> values) {
            addCriterion("fl in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotIn(List<String> values) {
            addCriterion("fl not in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlBetween(String value1, String value2) {
            addCriterion("fl between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotBetween(String value1, String value2) {
            addCriterion("fl not between", value1, value2, "fl");
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

        public Criteria andSjEqualTo(String value) {
            addCriterion("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(String value) {
            addCriterion("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(String value) {
            addCriterion("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(String value) {
            addCriterion("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(String value) {
            addCriterion("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(String value) {
            addCriterion("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLike(String value) {
            addCriterion("sj like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotLike(String value) {
            addCriterion("sj not like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<String> values) {
            addCriterion("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<String> values) {
            addCriterion("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(String value1, String value2) {
            addCriterion("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(String value1, String value2) {
            addCriterion("sj not between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andPfIsNull() {
            addCriterion("pf is null");
            return (Criteria) this;
        }

        public Criteria andPfIsNotNull() {
            addCriterion("pf is not null");
            return (Criteria) this;
        }

        public Criteria andPfEqualTo(String value) {
            addCriterion("pf =", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotEqualTo(String value) {
            addCriterion("pf <>", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThan(String value) {
            addCriterion("pf >", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThanOrEqualTo(String value) {
            addCriterion("pf >=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThan(String value) {
            addCriterion("pf <", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThanOrEqualTo(String value) {
            addCriterion("pf <=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLike(String value) {
            addCriterion("pf like", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotLike(String value) {
            addCriterion("pf not like", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfIn(List<String> values) {
            addCriterion("pf in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotIn(List<String> values) {
            addCriterion("pf not in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfBetween(String value1, String value2) {
            addCriterion("pf between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotBetween(String value1, String value2) {
            addCriterion("pf not between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andPjIsNull() {
            addCriterion("pj is null");
            return (Criteria) this;
        }

        public Criteria andPjIsNotNull() {
            addCriterion("pj is not null");
            return (Criteria) this;
        }

        public Criteria andPjEqualTo(String value) {
            addCriterion("pj =", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjNotEqualTo(String value) {
            addCriterion("pj <>", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjGreaterThan(String value) {
            addCriterion("pj >", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjGreaterThanOrEqualTo(String value) {
            addCriterion("pj >=", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjLessThan(String value) {
            addCriterion("pj <", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjLessThanOrEqualTo(String value) {
            addCriterion("pj <=", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjLike(String value) {
            addCriterion("pj like", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjNotLike(String value) {
            addCriterion("pj not like", value, "pj");
            return (Criteria) this;
        }

        public Criteria andPjIn(List<String> values) {
            addCriterion("pj in", values, "pj");
            return (Criteria) this;
        }

        public Criteria andPjNotIn(List<String> values) {
            addCriterion("pj not in", values, "pj");
            return (Criteria) this;
        }

        public Criteria andPjBetween(String value1, String value2) {
            addCriterion("pj between", value1, value2, "pj");
            return (Criteria) this;
        }

        public Criteria andPjNotBetween(String value1, String value2) {
            addCriterion("pj not between", value1, value2, "pj");
            return (Criteria) this;
        }

        public Criteria andMpfIsNull() {
            addCriterion("mpf is null");
            return (Criteria) this;
        }

        public Criteria andMpfIsNotNull() {
            addCriterion("mpf is not null");
            return (Criteria) this;
        }

        public Criteria andMpfEqualTo(String value) {
            addCriterion("mpf =", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfNotEqualTo(String value) {
            addCriterion("mpf <>", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfGreaterThan(String value) {
            addCriterion("mpf >", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfGreaterThanOrEqualTo(String value) {
            addCriterion("mpf >=", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfLessThan(String value) {
            addCriterion("mpf <", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfLessThanOrEqualTo(String value) {
            addCriterion("mpf <=", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfLike(String value) {
            addCriterion("mpf like", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfNotLike(String value) {
            addCriterion("mpf not like", value, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfIn(List<String> values) {
            addCriterion("mpf in", values, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfNotIn(List<String> values) {
            addCriterion("mpf not in", values, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfBetween(String value1, String value2) {
            addCriterion("mpf between", value1, value2, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpfNotBetween(String value1, String value2) {
            addCriterion("mpf not between", value1, value2, "mpf");
            return (Criteria) this;
        }

        public Criteria andMpjIsNull() {
            addCriterion("mpj is null");
            return (Criteria) this;
        }

        public Criteria andMpjIsNotNull() {
            addCriterion("mpj is not null");
            return (Criteria) this;
        }

        public Criteria andMpjEqualTo(String value) {
            addCriterion("mpj =", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjNotEqualTo(String value) {
            addCriterion("mpj <>", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjGreaterThan(String value) {
            addCriterion("mpj >", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjGreaterThanOrEqualTo(String value) {
            addCriterion("mpj >=", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjLessThan(String value) {
            addCriterion("mpj <", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjLessThanOrEqualTo(String value) {
            addCriterion("mpj <=", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjLike(String value) {
            addCriterion("mpj like", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjNotLike(String value) {
            addCriterion("mpj not like", value, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjIn(List<String> values) {
            addCriterion("mpj in", values, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjNotIn(List<String> values) {
            addCriterion("mpj not in", values, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjBetween(String value1, String value2) {
            addCriterion("mpj between", value1, value2, "mpj");
            return (Criteria) this;
        }

        public Criteria andMpjNotBetween(String value1, String value2) {
            addCriterion("mpj not between", value1, value2, "mpj");
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