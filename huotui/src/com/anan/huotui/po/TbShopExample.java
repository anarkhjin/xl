package com.anan.huotui.po;

import java.util.ArrayList;
import java.util.List;

public class TbShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbShopExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSaccountIsNull() {
            addCriterion("saccount is null");
            return (Criteria) this;
        }

        public Criteria andSaccountIsNotNull() {
            addCriterion("saccount is not null");
            return (Criteria) this;
        }

        public Criteria andSaccountEqualTo(String value) {
            addCriterion("saccount =", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountNotEqualTo(String value) {
            addCriterion("saccount <>", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountGreaterThan(String value) {
            addCriterion("saccount >", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountGreaterThanOrEqualTo(String value) {
            addCriterion("saccount >=", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountLessThan(String value) {
            addCriterion("saccount <", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountLessThanOrEqualTo(String value) {
            addCriterion("saccount <=", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountLike(String value) {
            addCriterion("saccount like", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountNotLike(String value) {
            addCriterion("saccount not like", value, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountIn(List<String> values) {
            addCriterion("saccount in", values, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountNotIn(List<String> values) {
            addCriterion("saccount not in", values, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountBetween(String value1, String value2) {
            addCriterion("saccount between", value1, value2, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaccountNotBetween(String value1, String value2) {
            addCriterion("saccount not between", value1, value2, "saccount");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSprivinceIsNull() {
            addCriterion("sprivince is null");
            return (Criteria) this;
        }

        public Criteria andSprivinceIsNotNull() {
            addCriterion("sprivince is not null");
            return (Criteria) this;
        }

        public Criteria andSprivinceEqualTo(String value) {
            addCriterion("sprivince =", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceNotEqualTo(String value) {
            addCriterion("sprivince <>", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceGreaterThan(String value) {
            addCriterion("sprivince >", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceGreaterThanOrEqualTo(String value) {
            addCriterion("sprivince >=", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceLessThan(String value) {
            addCriterion("sprivince <", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceLessThanOrEqualTo(String value) {
            addCriterion("sprivince <=", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceLike(String value) {
            addCriterion("sprivince like", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceNotLike(String value) {
            addCriterion("sprivince not like", value, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceIn(List<String> values) {
            addCriterion("sprivince in", values, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceNotIn(List<String> values) {
            addCriterion("sprivince not in", values, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceBetween(String value1, String value2) {
            addCriterion("sprivince between", value1, value2, "sprivince");
            return (Criteria) this;
        }

        public Criteria andSprivinceNotBetween(String value1, String value2) {
            addCriterion("sprivince not between", value1, value2, "sprivince");
            return (Criteria) this;
        }

        public Criteria andScityIsNull() {
            addCriterion("scity is null");
            return (Criteria) this;
        }

        public Criteria andScityIsNotNull() {
            addCriterion("scity is not null");
            return (Criteria) this;
        }

        public Criteria andScityEqualTo(String value) {
            addCriterion("scity =", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotEqualTo(String value) {
            addCriterion("scity <>", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThan(String value) {
            addCriterion("scity >", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThanOrEqualTo(String value) {
            addCriterion("scity >=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThan(String value) {
            addCriterion("scity <", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThanOrEqualTo(String value) {
            addCriterion("scity <=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLike(String value) {
            addCriterion("scity like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotLike(String value) {
            addCriterion("scity not like", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityIn(List<String> values) {
            addCriterion("scity in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotIn(List<String> values) {
            addCriterion("scity not in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityBetween(String value1, String value2) {
            addCriterion("scity between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotBetween(String value1, String value2) {
            addCriterion("scity not between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andSareaIsNull() {
            addCriterion("sarea is null");
            return (Criteria) this;
        }

        public Criteria andSareaIsNotNull() {
            addCriterion("sarea is not null");
            return (Criteria) this;
        }

        public Criteria andSareaEqualTo(String value) {
            addCriterion("sarea =", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotEqualTo(String value) {
            addCriterion("sarea <>", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaGreaterThan(String value) {
            addCriterion("sarea >", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaGreaterThanOrEqualTo(String value) {
            addCriterion("sarea >=", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLessThan(String value) {
            addCriterion("sarea <", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLessThanOrEqualTo(String value) {
            addCriterion("sarea <=", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLike(String value) {
            addCriterion("sarea like", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotLike(String value) {
            addCriterion("sarea not like", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaIn(List<String> values) {
            addCriterion("sarea in", values, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotIn(List<String> values) {
            addCriterion("sarea not in", values, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaBetween(String value1, String value2) {
            addCriterion("sarea between", value1, value2, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotBetween(String value1, String value2) {
            addCriterion("sarea not between", value1, value2, "sarea");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNull() {
            addCriterion("linkname is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("linkname is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("linkname =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("linkname <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("linkname >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("linkname >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("linkname <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("linkname <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("linkname like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("linkname not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("linkname in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("linkname not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("linkname between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("linkname not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinkteleIsNull() {
            addCriterion("linktele is null");
            return (Criteria) this;
        }

        public Criteria andLinkteleIsNotNull() {
            addCriterion("linktele is not null");
            return (Criteria) this;
        }

        public Criteria andLinkteleEqualTo(String value) {
            addCriterion("linktele =", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleNotEqualTo(String value) {
            addCriterion("linktele <>", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleGreaterThan(String value) {
            addCriterion("linktele >", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleGreaterThanOrEqualTo(String value) {
            addCriterion("linktele >=", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleLessThan(String value) {
            addCriterion("linktele <", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleLessThanOrEqualTo(String value) {
            addCriterion("linktele <=", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleLike(String value) {
            addCriterion("linktele like", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleNotLike(String value) {
            addCriterion("linktele not like", value, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleIn(List<String> values) {
            addCriterion("linktele in", values, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleNotIn(List<String> values) {
            addCriterion("linktele not in", values, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleBetween(String value1, String value2) {
            addCriterion("linktele between", value1, value2, "linktele");
            return (Criteria) this;
        }

        public Criteria andLinkteleNotBetween(String value1, String value2) {
            addCriterion("linktele not between", value1, value2, "linktele");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andJingduIsNull() {
            addCriterion("jingdu is null");
            return (Criteria) this;
        }

        public Criteria andJingduIsNotNull() {
            addCriterion("jingdu is not null");
            return (Criteria) this;
        }

        public Criteria andJingduEqualTo(String value) {
            addCriterion("jingdu =", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduNotEqualTo(String value) {
            addCriterion("jingdu <>", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduGreaterThan(String value) {
            addCriterion("jingdu >", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduGreaterThanOrEqualTo(String value) {
            addCriterion("jingdu >=", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduLessThan(String value) {
            addCriterion("jingdu <", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduLessThanOrEqualTo(String value) {
            addCriterion("jingdu <=", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduLike(String value) {
            addCriterion("jingdu like", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduNotLike(String value) {
            addCriterion("jingdu not like", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduIn(List<String> values) {
            addCriterion("jingdu in", values, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduNotIn(List<String> values) {
            addCriterion("jingdu not in", values, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduBetween(String value1, String value2) {
            addCriterion("jingdu between", value1, value2, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduNotBetween(String value1, String value2) {
            addCriterion("jingdu not between", value1, value2, "jingdu");
            return (Criteria) this;
        }

        public Criteria andWeiduIsNull() {
            addCriterion("weidu is null");
            return (Criteria) this;
        }

        public Criteria andWeiduIsNotNull() {
            addCriterion("weidu is not null");
            return (Criteria) this;
        }

        public Criteria andWeiduEqualTo(String value) {
            addCriterion("weidu =", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotEqualTo(String value) {
            addCriterion("weidu <>", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduGreaterThan(String value) {
            addCriterion("weidu >", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduGreaterThanOrEqualTo(String value) {
            addCriterion("weidu >=", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLessThan(String value) {
            addCriterion("weidu <", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLessThanOrEqualTo(String value) {
            addCriterion("weidu <=", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLike(String value) {
            addCriterion("weidu like", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotLike(String value) {
            addCriterion("weidu not like", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduIn(List<String> values) {
            addCriterion("weidu in", values, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotIn(List<String> values) {
            addCriterion("weidu not in", values, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduBetween(String value1, String value2) {
            addCriterion("weidu between", value1, value2, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotBetween(String value1, String value2) {
            addCriterion("weidu not between", value1, value2, "weidu");
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