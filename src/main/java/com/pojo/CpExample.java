package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class CpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpExample() {
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

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
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

        public Criteria andPpIsNull() {
            addCriterion("pp is null");
            return (Criteria) this;
        }

        public Criteria andPpIsNotNull() {
            addCriterion("pp is not null");
            return (Criteria) this;
        }

        public Criteria andPpEqualTo(String value) {
            addCriterion("pp =", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotEqualTo(String value) {
            addCriterion("pp <>", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpGreaterThan(String value) {
            addCriterion("pp >", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpGreaterThanOrEqualTo(String value) {
            addCriterion("pp >=", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpLessThan(String value) {
            addCriterion("pp <", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpLessThanOrEqualTo(String value) {
            addCriterion("pp <=", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpLike(String value) {
            addCriterion("pp like", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotLike(String value) {
            addCriterion("pp not like", value, "pp");
            return (Criteria) this;
        }

        public Criteria andPpIn(List<String> values) {
            addCriterion("pp in", values, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotIn(List<String> values) {
            addCriterion("pp not in", values, "pp");
            return (Criteria) this;
        }

        public Criteria andPpBetween(String value1, String value2) {
            addCriterion("pp between", value1, value2, "pp");
            return (Criteria) this;
        }

        public Criteria andPpNotBetween(String value1, String value2) {
            addCriterion("pp not between", value1, value2, "pp");
            return (Criteria) this;
        }

        public Criteria andCdIsNull() {
            addCriterion("cd is null");
            return (Criteria) this;
        }

        public Criteria andCdIsNotNull() {
            addCriterion("cd is not null");
            return (Criteria) this;
        }

        public Criteria andCdEqualTo(String value) {
            addCriterion("cd =", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotEqualTo(String value) {
            addCriterion("cd <>", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThan(String value) {
            addCriterion("cd >", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThanOrEqualTo(String value) {
            addCriterion("cd >=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThan(String value) {
            addCriterion("cd <", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThanOrEqualTo(String value) {
            addCriterion("cd <=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLike(String value) {
            addCriterion("cd like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotLike(String value) {
            addCriterion("cd not like", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdIn(List<String> values) {
            addCriterion("cd in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotIn(List<String> values) {
            addCriterion("cd not in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdBetween(String value1, String value2) {
            addCriterion("cd between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotBetween(String value1, String value2) {
            addCriterion("cd not between", value1, value2, "cd");
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

        public Criteria andJgEqualTo(Float value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(Float value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(Float value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(Float value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(Float value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(Float value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<Float> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<Float> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(Float value1, Float value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(Float value1, Float value2) {
            addCriterion("jg not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andCfIsNull() {
            addCriterion("cf is null");
            return (Criteria) this;
        }

        public Criteria andCfIsNotNull() {
            addCriterion("cf is not null");
            return (Criteria) this;
        }

        public Criteria andCfEqualTo(String value) {
            addCriterion("cf =", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotEqualTo(String value) {
            addCriterion("cf <>", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThan(String value) {
            addCriterion("cf >", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfGreaterThanOrEqualTo(String value) {
            addCriterion("cf >=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThan(String value) {
            addCriterion("cf <", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLessThanOrEqualTo(String value) {
            addCriterion("cf <=", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfLike(String value) {
            addCriterion("cf like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotLike(String value) {
            addCriterion("cf not like", value, "cf");
            return (Criteria) this;
        }

        public Criteria andCfIn(List<String> values) {
            addCriterion("cf in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotIn(List<String> values) {
            addCriterion("cf not in", values, "cf");
            return (Criteria) this;
        }

        public Criteria andCfBetween(String value1, String value2) {
            addCriterion("cf between", value1, value2, "cf");
            return (Criteria) this;
        }

        public Criteria andCfNotBetween(String value1, String value2) {
            addCriterion("cf not between", value1, value2, "cf");
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

        public Criteria andTjIsNull() {
            addCriterion("tj is null");
            return (Criteria) this;
        }

        public Criteria andTjIsNotNull() {
            addCriterion("tj is not null");
            return (Criteria) this;
        }

        public Criteria andTjEqualTo(String value) {
            addCriterion("tj =", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjNotEqualTo(String value) {
            addCriterion("tj <>", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjGreaterThan(String value) {
            addCriterion("tj >", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjGreaterThanOrEqualTo(String value) {
            addCriterion("tj >=", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjLessThan(String value) {
            addCriterion("tj <", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjLessThanOrEqualTo(String value) {
            addCriterion("tj <=", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjLike(String value) {
            addCriterion("tj like", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjNotLike(String value) {
            addCriterion("tj not like", value, "tj");
            return (Criteria) this;
        }

        public Criteria andTjIn(List<String> values) {
            addCriterion("tj in", values, "tj");
            return (Criteria) this;
        }

        public Criteria andTjNotIn(List<String> values) {
            addCriterion("tj not in", values, "tj");
            return (Criteria) this;
        }

        public Criteria andTjBetween(String value1, String value2) {
            addCriterion("tj between", value1, value2, "tj");
            return (Criteria) this;
        }

        public Criteria andTjNotBetween(String value1, String value2) {
            addCriterion("tj not between", value1, value2, "tj");
            return (Criteria) this;
        }

        public Criteria andDjIsNull() {
            addCriterion("dj is null");
            return (Criteria) this;
        }

        public Criteria andDjIsNotNull() {
            addCriterion("dj is not null");
            return (Criteria) this;
        }

        public Criteria andDjEqualTo(Integer value) {
            addCriterion("dj =", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotEqualTo(Integer value) {
            addCriterion("dj <>", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThan(Integer value) {
            addCriterion("dj >", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThanOrEqualTo(Integer value) {
            addCriterion("dj >=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThan(Integer value) {
            addCriterion("dj <", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThanOrEqualTo(Integer value) {
            addCriterion("dj <=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjIn(List<Integer> values) {
            addCriterion("dj in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotIn(List<Integer> values) {
            addCriterion("dj not in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjBetween(Integer value1, Integer value2) {
            addCriterion("dj between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotBetween(Integer value1, Integer value2) {
            addCriterion("dj not between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andXlIsNull() {
            addCriterion("xl is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("xl is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(Integer value) {
            addCriterion("xl =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(Integer value) {
            addCriterion("xl <>", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(Integer value) {
            addCriterion("xl >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(Integer value) {
            addCriterion("xl >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(Integer value) {
            addCriterion("xl <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(Integer value) {
            addCriterion("xl <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIn(List<Integer> values) {
            addCriterion("xl in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotIn(List<Integer> values) {
            addCriterion("xl not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlBetween(Integer value1, Integer value2) {
            addCriterion("xl between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotBetween(Integer value1, Integer value2) {
            addCriterion("xl not between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andKcIsNull() {
            addCriterion("kc is null");
            return (Criteria) this;
        }

        public Criteria andKcIsNotNull() {
            addCriterion("kc is not null");
            return (Criteria) this;
        }

        public Criteria andKcEqualTo(Integer value) {
            addCriterion("kc =", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcNotEqualTo(Integer value) {
            addCriterion("kc <>", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcGreaterThan(Integer value) {
            addCriterion("kc >", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcGreaterThanOrEqualTo(Integer value) {
            addCriterion("kc >=", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcLessThan(Integer value) {
            addCriterion("kc <", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcLessThanOrEqualTo(Integer value) {
            addCriterion("kc <=", value, "kc");
            return (Criteria) this;
        }

        public Criteria andKcIn(List<Integer> values) {
            addCriterion("kc in", values, "kc");
            return (Criteria) this;
        }

        public Criteria andKcNotIn(List<Integer> values) {
            addCriterion("kc not in", values, "kc");
            return (Criteria) this;
        }

        public Criteria andKcBetween(Integer value1, Integer value2) {
            addCriterion("kc between", value1, value2, "kc");
            return (Criteria) this;
        }

        public Criteria andKcNotBetween(Integer value1, Integer value2) {
            addCriterion("kc not between", value1, value2, "kc");
            return (Criteria) this;
        }

        public Criteria andSxjIsNull() {
            addCriterion("sxj is null");
            return (Criteria) this;
        }

        public Criteria andSxjIsNotNull() {
            addCriterion("sxj is not null");
            return (Criteria) this;
        }

        public Criteria andSxjEqualTo(String value) {
            addCriterion("sxj =", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjNotEqualTo(String value) {
            addCriterion("sxj <>", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjGreaterThan(String value) {
            addCriterion("sxj >", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjGreaterThanOrEqualTo(String value) {
            addCriterion("sxj >=", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjLessThan(String value) {
            addCriterion("sxj <", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjLessThanOrEqualTo(String value) {
            addCriterion("sxj <=", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjLike(String value) {
            addCriterion("sxj like", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjNotLike(String value) {
            addCriterion("sxj not like", value, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjIn(List<String> values) {
            addCriterion("sxj in", values, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjNotIn(List<String> values) {
            addCriterion("sxj not in", values, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjBetween(String value1, String value2) {
            addCriterion("sxj between", value1, value2, "sxj");
            return (Criteria) this;
        }

        public Criteria andSxjNotBetween(String value1, String value2) {
            addCriterion("sxj not between", value1, value2, "sxj");
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