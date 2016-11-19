package com.anan.huotui.po;

import java.util.ArrayList;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Long value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Long value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Long value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Long value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Long value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Long value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Long> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Long> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Long value1, Long value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Long value1, Long value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andYunfeiIsNull() {
            addCriterion("yunfei is null");
            return (Criteria) this;
        }

        public Criteria andYunfeiIsNotNull() {
            addCriterion("yunfei is not null");
            return (Criteria) this;
        }

        public Criteria andYunfeiEqualTo(Integer value) {
            addCriterion("yunfei =", value, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiNotEqualTo(Integer value) {
            addCriterion("yunfei <>", value, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiGreaterThan(Integer value) {
            addCriterion("yunfei >", value, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("yunfei >=", value, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiLessThan(Integer value) {
            addCriterion("yunfei <", value, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiLessThanOrEqualTo(Integer value) {
            addCriterion("yunfei <=", value, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiIn(List<Integer> values) {
            addCriterion("yunfei in", values, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiNotIn(List<Integer> values) {
            addCriterion("yunfei not in", values, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiBetween(Integer value1, Integer value2) {
            addCriterion("yunfei between", value1, value2, "yunfei");
            return (Criteria) this;
        }

        public Criteria andYunfeiNotBetween(Integer value1, Integer value2) {
            addCriterion("yunfei not between", value1, value2, "yunfei");
            return (Criteria) this;
        }

        public Criteria andPriceindeedIsNull() {
            addCriterion("priceindeed is null");
            return (Criteria) this;
        }

        public Criteria andPriceindeedIsNotNull() {
            addCriterion("priceindeed is not null");
            return (Criteria) this;
        }

        public Criteria andPriceindeedEqualTo(Integer value) {
            addCriterion("priceindeed =", value, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedNotEqualTo(Integer value) {
            addCriterion("priceindeed <>", value, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedGreaterThan(Integer value) {
            addCriterion("priceindeed >", value, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceindeed >=", value, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedLessThan(Integer value) {
            addCriterion("priceindeed <", value, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedLessThanOrEqualTo(Integer value) {
            addCriterion("priceindeed <=", value, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedIn(List<Integer> values) {
            addCriterion("priceindeed in", values, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedNotIn(List<Integer> values) {
            addCriterion("priceindeed not in", values, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedBetween(Integer value1, Integer value2) {
            addCriterion("priceindeed between", value1, value2, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceindeedNotBetween(Integer value1, Integer value2) {
            addCriterion("priceindeed not between", value1, value2, "priceindeed");
            return (Criteria) this;
        }

        public Criteria andPriceallIsNull() {
            addCriterion("priceall is null");
            return (Criteria) this;
        }

        public Criteria andPriceallIsNotNull() {
            addCriterion("priceall is not null");
            return (Criteria) this;
        }

        public Criteria andPriceallEqualTo(Integer value) {
            addCriterion("priceall =", value, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallNotEqualTo(Integer value) {
            addCriterion("priceall <>", value, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallGreaterThan(Integer value) {
            addCriterion("priceall >", value, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceall >=", value, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallLessThan(Integer value) {
            addCriterion("priceall <", value, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallLessThanOrEqualTo(Integer value) {
            addCriterion("priceall <=", value, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallIn(List<Integer> values) {
            addCriterion("priceall in", values, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallNotIn(List<Integer> values) {
            addCriterion("priceall not in", values, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallBetween(Integer value1, Integer value2) {
            addCriterion("priceall between", value1, value2, "priceall");
            return (Criteria) this;
        }

        public Criteria andPriceallNotBetween(Integer value1, Integer value2) {
            addCriterion("priceall not between", value1, value2, "priceall");
            return (Criteria) this;
        }

        public Criteria andPrivinceIsNull() {
            addCriterion("privince is null");
            return (Criteria) this;
        }

        public Criteria andPrivinceIsNotNull() {
            addCriterion("privince is not null");
            return (Criteria) this;
        }

        public Criteria andPrivinceEqualTo(String value) {
            addCriterion("privince =", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotEqualTo(String value) {
            addCriterion("privince <>", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceGreaterThan(String value) {
            addCriterion("privince >", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceGreaterThanOrEqualTo(String value) {
            addCriterion("privince >=", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceLessThan(String value) {
            addCriterion("privince <", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceLessThanOrEqualTo(String value) {
            addCriterion("privince <=", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceLike(String value) {
            addCriterion("privince like", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotLike(String value) {
            addCriterion("privince not like", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceIn(List<String> values) {
            addCriterion("privince in", values, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotIn(List<String> values) {
            addCriterion("privince not in", values, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceBetween(String value1, String value2) {
            addCriterion("privince between", value1, value2, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotBetween(String value1, String value2) {
            addCriterion("privince not between", value1, value2, "privince");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinktelIsNull() {
            addCriterion("linktel is null");
            return (Criteria) this;
        }

        public Criteria andLinktelIsNotNull() {
            addCriterion("linktel is not null");
            return (Criteria) this;
        }

        public Criteria andLinktelEqualTo(String value) {
            addCriterion("linktel =", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotEqualTo(String value) {
            addCriterion("linktel <>", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelGreaterThan(String value) {
            addCriterion("linktel >", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelGreaterThanOrEqualTo(String value) {
            addCriterion("linktel >=", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLessThan(String value) {
            addCriterion("linktel <", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLessThanOrEqualTo(String value) {
            addCriterion("linktel <=", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelLike(String value) {
            addCriterion("linktel like", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotLike(String value) {
            addCriterion("linktel not like", value, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelIn(List<String> values) {
            addCriterion("linktel in", values, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotIn(List<String> values) {
            addCriterion("linktel not in", values, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelBetween(String value1, String value2) {
            addCriterion("linktel between", value1, value2, "linktel");
            return (Criteria) this;
        }

        public Criteria andLinktelNotBetween(String value1, String value2) {
            addCriterion("linktel not between", value1, value2, "linktel");
            return (Criteria) this;
        }

        public Criteria andYouhuiIsNull() {
            addCriterion("youhui is null");
            return (Criteria) this;
        }

        public Criteria andYouhuiIsNotNull() {
            addCriterion("youhui is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuiEqualTo(Integer value) {
            addCriterion("youhui =", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotEqualTo(Integer value) {
            addCriterion("youhui <>", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiGreaterThan(Integer value) {
            addCriterion("youhui >", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiGreaterThanOrEqualTo(Integer value) {
            addCriterion("youhui >=", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLessThan(Integer value) {
            addCriterion("youhui <", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLessThanOrEqualTo(Integer value) {
            addCriterion("youhui <=", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiIn(List<Integer> values) {
            addCriterion("youhui in", values, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotIn(List<Integer> values) {
            addCriterion("youhui not in", values, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiBetween(Integer value1, Integer value2) {
            addCriterion("youhui between", value1, value2, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotBetween(Integer value1, Integer value2) {
            addCriterion("youhui not between", value1, value2, "youhui");
            return (Criteria) this;
        }

        public Criteria andHuoyunIsNull() {
            addCriterion("huoyun is null");
            return (Criteria) this;
        }

        public Criteria andHuoyunIsNotNull() {
            addCriterion("huoyun is not null");
            return (Criteria) this;
        }

        public Criteria andHuoyunEqualTo(Boolean value) {
            addCriterion("huoyun =", value, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunNotEqualTo(Boolean value) {
            addCriterion("huoyun <>", value, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunGreaterThan(Boolean value) {
            addCriterion("huoyun >", value, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunGreaterThanOrEqualTo(Boolean value) {
            addCriterion("huoyun >=", value, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunLessThan(Boolean value) {
            addCriterion("huoyun <", value, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunLessThanOrEqualTo(Boolean value) {
            addCriterion("huoyun <=", value, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunIn(List<Boolean> values) {
            addCriterion("huoyun in", values, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunNotIn(List<Boolean> values) {
            addCriterion("huoyun not in", values, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunBetween(Boolean value1, Boolean value2) {
            addCriterion("huoyun between", value1, value2, "huoyun");
            return (Criteria) this;
        }

        public Criteria andHuoyunNotBetween(Boolean value1, Boolean value2) {
            addCriterion("huoyun not between", value1, value2, "huoyun");
            return (Criteria) this;
        }

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Long value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Long value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Long value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Long value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Long value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Long value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Long> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Long> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Long value1, Long value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Long value1, Long value2) {
            addCriterion("qid not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andGoodslistIsNull() {
            addCriterion("goodslist is null");
            return (Criteria) this;
        }

        public Criteria andGoodslistIsNotNull() {
            addCriterion("goodslist is not null");
            return (Criteria) this;
        }

        public Criteria andGoodslistEqualTo(String value) {
            addCriterion("goodslist =", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistNotEqualTo(String value) {
            addCriterion("goodslist <>", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistGreaterThan(String value) {
            addCriterion("goodslist >", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistGreaterThanOrEqualTo(String value) {
            addCriterion("goodslist >=", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistLessThan(String value) {
            addCriterion("goodslist <", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistLessThanOrEqualTo(String value) {
            addCriterion("goodslist <=", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistLike(String value) {
            addCriterion("goodslist like", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistNotLike(String value) {
            addCriterion("goodslist not like", value, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistIn(List<String> values) {
            addCriterion("goodslist in", values, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistNotIn(List<String> values) {
            addCriterion("goodslist not in", values, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistBetween(String value1, String value2) {
            addCriterion("goodslist between", value1, value2, "goodslist");
            return (Criteria) this;
        }

        public Criteria andGoodslistNotBetween(String value1, String value2) {
            addCriterion("goodslist not between", value1, value2, "goodslist");
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