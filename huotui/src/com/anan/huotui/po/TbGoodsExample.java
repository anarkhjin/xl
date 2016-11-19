package com.anan.huotui.po;

import java.util.ArrayList;
import java.util.List;

public class TbGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Long value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Long value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Long value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Long value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Long value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Long value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Long> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Long> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Long value1, Long value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Long value1, Long value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Long value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Long value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Long value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Long value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Long value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Long value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Long> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Long> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Long value1, Long value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Long value1, Long value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTruepriceIsNull() {
            addCriterion("trueprice is null");
            return (Criteria) this;
        }

        public Criteria andTruepriceIsNotNull() {
            addCriterion("trueprice is not null");
            return (Criteria) this;
        }

        public Criteria andTruepriceEqualTo(Integer value) {
            addCriterion("trueprice =", value, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceNotEqualTo(Integer value) {
            addCriterion("trueprice <>", value, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceGreaterThan(Integer value) {
            addCriterion("trueprice >", value, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("trueprice >=", value, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceLessThan(Integer value) {
            addCriterion("trueprice <", value, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceLessThanOrEqualTo(Integer value) {
            addCriterion("trueprice <=", value, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceIn(List<Integer> values) {
            addCriterion("trueprice in", values, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceNotIn(List<Integer> values) {
            addCriterion("trueprice not in", values, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceBetween(Integer value1, Integer value2) {
            addCriterion("trueprice between", value1, value2, "trueprice");
            return (Criteria) this;
        }

        public Criteria andTruepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("trueprice not between", value1, value2, "trueprice");
            return (Criteria) this;
        }

        public Criteria andStandarIsNull() {
            addCriterion("standar is null");
            return (Criteria) this;
        }

        public Criteria andStandarIsNotNull() {
            addCriterion("standar is not null");
            return (Criteria) this;
        }

        public Criteria andStandarEqualTo(Integer value) {
            addCriterion("standar =", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarNotEqualTo(Integer value) {
            addCriterion("standar <>", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarGreaterThan(Integer value) {
            addCriterion("standar >", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarGreaterThanOrEqualTo(Integer value) {
            addCriterion("standar >=", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarLessThan(Integer value) {
            addCriterion("standar <", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarLessThanOrEqualTo(Integer value) {
            addCriterion("standar <=", value, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarIn(List<Integer> values) {
            addCriterion("standar in", values, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarNotIn(List<Integer> values) {
            addCriterion("standar not in", values, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarBetween(Integer value1, Integer value2) {
            addCriterion("standar between", value1, value2, "standar");
            return (Criteria) this;
        }

        public Criteria andStandarNotBetween(Integer value1, Integer value2) {
            addCriterion("standar not between", value1, value2, "standar");
            return (Criteria) this;
        }

        public Criteria andTruestandarIsNull() {
            addCriterion("truestandar is null");
            return (Criteria) this;
        }

        public Criteria andTruestandarIsNotNull() {
            addCriterion("truestandar is not null");
            return (Criteria) this;
        }

        public Criteria andTruestandarEqualTo(Integer value) {
            addCriterion("truestandar =", value, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarNotEqualTo(Integer value) {
            addCriterion("truestandar <>", value, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarGreaterThan(Integer value) {
            addCriterion("truestandar >", value, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarGreaterThanOrEqualTo(Integer value) {
            addCriterion("truestandar >=", value, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarLessThan(Integer value) {
            addCriterion("truestandar <", value, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarLessThanOrEqualTo(Integer value) {
            addCriterion("truestandar <=", value, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarIn(List<Integer> values) {
            addCriterion("truestandar in", values, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarNotIn(List<Integer> values) {
            addCriterion("truestandar not in", values, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarBetween(Integer value1, Integer value2) {
            addCriterion("truestandar between", value1, value2, "truestandar");
            return (Criteria) this;
        }

        public Criteria andTruestandarNotBetween(Integer value1, Integer value2) {
            addCriterion("truestandar not between", value1, value2, "truestandar");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
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

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Short value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Short value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Short value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Short value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Short value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Short value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Short> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Short> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Short value1, Short value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Short value1, Short value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andYunfeiTextIsNull() {
            addCriterion("yunfei_text is null");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextIsNotNull() {
            addCriterion("yunfei_text is not null");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextEqualTo(String value) {
            addCriterion("yunfei_text =", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextNotEqualTo(String value) {
            addCriterion("yunfei_text <>", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextGreaterThan(String value) {
            addCriterion("yunfei_text >", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextGreaterThanOrEqualTo(String value) {
            addCriterion("yunfei_text >=", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextLessThan(String value) {
            addCriterion("yunfei_text <", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextLessThanOrEqualTo(String value) {
            addCriterion("yunfei_text <=", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextLike(String value) {
            addCriterion("yunfei_text like", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextNotLike(String value) {
            addCriterion("yunfei_text not like", value, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextIn(List<String> values) {
            addCriterion("yunfei_text in", values, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextNotIn(List<String> values) {
            addCriterion("yunfei_text not in", values, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextBetween(String value1, String value2) {
            addCriterion("yunfei_text between", value1, value2, "yunfeiText");
            return (Criteria) this;
        }

        public Criteria andYunfeiTextNotBetween(String value1, String value2) {
            addCriterion("yunfei_text not between", value1, value2, "yunfeiText");
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