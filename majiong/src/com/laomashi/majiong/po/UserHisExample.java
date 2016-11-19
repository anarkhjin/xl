package com.laomashi.majiong.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserHisExample() {
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

        public Criteria andHisidIsNull() {
            addCriterion("hisid is null");
            return (Criteria) this;
        }

        public Criteria andHisidIsNotNull() {
            addCriterion("hisid is not null");
            return (Criteria) this;
        }

        public Criteria andHisidEqualTo(Long value) {
            addCriterion("hisid =", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidNotEqualTo(Long value) {
            addCriterion("hisid <>", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidGreaterThan(Long value) {
            addCriterion("hisid >", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidGreaterThanOrEqualTo(Long value) {
            addCriterion("hisid >=", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidLessThan(Long value) {
            addCriterion("hisid <", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidLessThanOrEqualTo(Long value) {
            addCriterion("hisid <=", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidIn(List<Long> values) {
            addCriterion("hisid in", values, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidNotIn(List<Long> values) {
            addCriterion("hisid not in", values, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidBetween(Long value1, Long value2) {
            addCriterion("hisid between", value1, value2, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidNotBetween(Long value1, Long value2) {
            addCriterion("hisid not between", value1, value2, "hisid");
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

        public Criteria andJiesuanIsNull() {
            addCriterion("jiesuan is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanIsNotNull() {
            addCriterion("jiesuan is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanEqualTo(Short value) {
            addCriterion("jiesuan =", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanNotEqualTo(Short value) {
            addCriterion("jiesuan <>", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanGreaterThan(Short value) {
            addCriterion("jiesuan >", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanGreaterThanOrEqualTo(Short value) {
            addCriterion("jiesuan >=", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanLessThan(Short value) {
            addCriterion("jiesuan <", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanLessThanOrEqualTo(Short value) {
            addCriterion("jiesuan <=", value, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanIn(List<Short> values) {
            addCriterion("jiesuan in", values, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanNotIn(List<Short> values) {
            addCriterion("jiesuan not in", values, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanBetween(Short value1, Short value2) {
            addCriterion("jiesuan between", value1, value2, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanNotBetween(Short value1, Short value2) {
            addCriterion("jiesuan not between", value1, value2, "jiesuan");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(String value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(String value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(String value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(String value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(String value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(String value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLike(String value) {
            addCriterion("day like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotLike(String value) {
            addCriterion("day not like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<String> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<String> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(String value1, String value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(String value1, String value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andZhanxianIsNull() {
            addCriterion("zhanxian is null");
            return (Criteria) this;
        }

        public Criteria andZhanxianIsNotNull() {
            addCriterion("zhanxian is not null");
            return (Criteria) this;
        }

        public Criteria andZhanxianEqualTo(Integer value) {
            addCriterion("zhanxian =", value, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianNotEqualTo(Integer value) {
            addCriterion("zhanxian <>", value, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianGreaterThan(Integer value) {
            addCriterion("zhanxian >", value, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhanxian >=", value, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianLessThan(Integer value) {
            addCriterion("zhanxian <", value, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianLessThanOrEqualTo(Integer value) {
            addCriterion("zhanxian <=", value, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianIn(List<Integer> values) {
            addCriterion("zhanxian in", values, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianNotIn(List<Integer> values) {
            addCriterion("zhanxian not in", values, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianBetween(Integer value1, Integer value2) {
            addCriterion("zhanxian between", value1, value2, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andZhanxianNotBetween(Integer value1, Integer value2) {
            addCriterion("zhanxian not between", value1, value2, "zhanxian");
            return (Criteria) this;
        }

        public Criteria andDianjiIsNull() {
            addCriterion("dianji is null");
            return (Criteria) this;
        }

        public Criteria andDianjiIsNotNull() {
            addCriterion("dianji is not null");
            return (Criteria) this;
        }

        public Criteria andDianjiEqualTo(Integer value) {
            addCriterion("dianji =", value, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiNotEqualTo(Integer value) {
            addCriterion("dianji <>", value, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiGreaterThan(Integer value) {
            addCriterion("dianji >", value, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianji >=", value, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiLessThan(Integer value) {
            addCriterion("dianji <", value, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiLessThanOrEqualTo(Integer value) {
            addCriterion("dianji <=", value, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiIn(List<Integer> values) {
            addCriterion("dianji in", values, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiNotIn(List<Integer> values) {
            addCriterion("dianji not in", values, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiBetween(Integer value1, Integer value2) {
            addCriterion("dianji between", value1, value2, "dianji");
            return (Criteria) this;
        }

        public Criteria andDianjiNotBetween(Integer value1, Integer value2) {
            addCriterion("dianji not between", value1, value2, "dianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiIsNull() {
            addCriterion("weidianji is null");
            return (Criteria) this;
        }

        public Criteria andWeidianjiIsNotNull() {
            addCriterion("weidianji is not null");
            return (Criteria) this;
        }

        public Criteria andWeidianjiEqualTo(Integer value) {
            addCriterion("weidianji =", value, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiNotEqualTo(Integer value) {
            addCriterion("weidianji <>", value, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiGreaterThan(Integer value) {
            addCriterion("weidianji >", value, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("weidianji >=", value, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiLessThan(Integer value) {
            addCriterion("weidianji <", value, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiLessThanOrEqualTo(Integer value) {
            addCriterion("weidianji <=", value, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiIn(List<Integer> values) {
            addCriterion("weidianji in", values, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiNotIn(List<Integer> values) {
            addCriterion("weidianji not in", values, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiBetween(Integer value1, Integer value2) {
            addCriterion("weidianji between", value1, value2, "weidianji");
            return (Criteria) this;
        }

        public Criteria andWeidianjiNotBetween(Integer value1, Integer value2) {
            addCriterion("weidianji not between", value1, value2, "weidianji");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterionForJDBCDate("creattime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creattime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creattime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creattime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterionForJDBCDate("creattime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creattime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterionForJDBCDate("creattime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creattime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creattime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creattime not between", value1, value2, "creattime");
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