package grimm.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysReferenceTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysReferenceTableExample() {
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

        public Criteria andReferenceTypeNameIsNull() {
            addCriterion("reference_type_name is null");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameIsNotNull() {
            addCriterion("reference_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameEqualTo(String value) {
            addCriterion("reference_type_name =", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameNotEqualTo(String value) {
            addCriterion("reference_type_name <>", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameGreaterThan(String value) {
            addCriterion("reference_type_name >", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("reference_type_name >=", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameLessThan(String value) {
            addCriterion("reference_type_name <", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("reference_type_name <=", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameLike(String value) {
            addCriterion("reference_type_name like", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameNotLike(String value) {
            addCriterion("reference_type_name not like", value, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameIn(List<String> values) {
            addCriterion("reference_type_name in", values, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameNotIn(List<String> values) {
            addCriterion("reference_type_name not in", values, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameBetween(String value1, String value2) {
            addCriterion("reference_type_name between", value1, value2, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeNameNotBetween(String value1, String value2) {
            addCriterion("reference_type_name not between", value1, value2, "referenceTypeName");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdIsNull() {
            addCriterion("reference_type_id is null");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdIsNotNull() {
            addCriterion("reference_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdEqualTo(Byte value) {
            addCriterion("reference_type_id =", value, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdNotEqualTo(Byte value) {
            addCriterion("reference_type_id <>", value, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdGreaterThan(Byte value) {
            addCriterion("reference_type_id >", value, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("reference_type_id >=", value, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdLessThan(Byte value) {
            addCriterion("reference_type_id <", value, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("reference_type_id <=", value, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdIn(List<Byte> values) {
            addCriterion("reference_type_id in", values, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdNotIn(List<Byte> values) {
            addCriterion("reference_type_id not in", values, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("reference_type_id between", value1, value2, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("reference_type_id not between", value1, value2, "referenceTypeId");
            return (Criteria) this;
        }

        public Criteria andReferenceNameIsNull() {
            addCriterion("reference_name is null");
            return (Criteria) this;
        }

        public Criteria andReferenceNameIsNotNull() {
            addCriterion("reference_name is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceNameEqualTo(String value) {
            addCriterion("reference_name =", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotEqualTo(String value) {
            addCriterion("reference_name <>", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameGreaterThan(String value) {
            addCriterion("reference_name >", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("reference_name >=", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameLessThan(String value) {
            addCriterion("reference_name <", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameLessThanOrEqualTo(String value) {
            addCriterion("reference_name <=", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameLike(String value) {
            addCriterion("reference_name like", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotLike(String value) {
            addCriterion("reference_name not like", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameIn(List<String> values) {
            addCriterion("reference_name in", values, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotIn(List<String> values) {
            addCriterion("reference_name not in", values, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameBetween(String value1, String value2) {
            addCriterion("reference_name between", value1, value2, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotBetween(String value1, String value2) {
            addCriterion("reference_name not between", value1, value2, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeIsNull() {
            addCriterion("reference_code is null");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeIsNotNull() {
            addCriterion("reference_code is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeEqualTo(String value) {
            addCriterion("reference_code =", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeNotEqualTo(String value) {
            addCriterion("reference_code <>", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeGreaterThan(String value) {
            addCriterion("reference_code >", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reference_code >=", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeLessThan(String value) {
            addCriterion("reference_code <", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeLessThanOrEqualTo(String value) {
            addCriterion("reference_code <=", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeLike(String value) {
            addCriterion("reference_code like", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeNotLike(String value) {
            addCriterion("reference_code not like", value, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeIn(List<String> values) {
            addCriterion("reference_code in", values, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeNotIn(List<String> values) {
            addCriterion("reference_code not in", values, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeBetween(String value1, String value2) {
            addCriterion("reference_code between", value1, value2, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceCodeNotBetween(String value1, String value2) {
            addCriterion("reference_code not between", value1, value2, "referenceCode");
            return (Criteria) this;
        }

        public Criteria andReferenceValueIsNull() {
            addCriterion("reference_value is null");
            return (Criteria) this;
        }

        public Criteria andReferenceValueIsNotNull() {
            addCriterion("reference_value is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceValueEqualTo(String value) {
            addCriterion("reference_value =", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueNotEqualTo(String value) {
            addCriterion("reference_value <>", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueGreaterThan(String value) {
            addCriterion("reference_value >", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueGreaterThanOrEqualTo(String value) {
            addCriterion("reference_value >=", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueLessThan(String value) {
            addCriterion("reference_value <", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueLessThanOrEqualTo(String value) {
            addCriterion("reference_value <=", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueLike(String value) {
            addCriterion("reference_value like", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueNotLike(String value) {
            addCriterion("reference_value not like", value, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueIn(List<String> values) {
            addCriterion("reference_value in", values, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueNotIn(List<String> values) {
            addCriterion("reference_value not in", values, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueBetween(String value1, String value2) {
            addCriterion("reference_value between", value1, value2, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andReferenceValueNotBetween(String value1, String value2) {
            addCriterion("reference_value not between", value1, value2, "referenceValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNull() {
            addCriterion("order_seq is null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNotNull() {
            addCriterion("order_seq is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqEqualTo(Integer value) {
            addCriterion("order_seq =", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotEqualTo(Integer value) {
            addCriterion("order_seq <>", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThan(Integer value) {
            addCriterion("order_seq >", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_seq >=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThan(Integer value) {
            addCriterion("order_seq <", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThanOrEqualTo(Integer value) {
            addCriterion("order_seq <=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIn(List<Integer> values) {
            addCriterion("order_seq in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotIn(List<Integer> values) {
            addCriterion("order_seq not in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqBetween(Integer value1, Integer value2) {
            addCriterion("order_seq between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("order_seq not between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridIsNull() {
            addCriterion("last_commit_userid is null");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridIsNotNull() {
            addCriterion("last_commit_userid is not null");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridEqualTo(Integer value) {
            addCriterion("last_commit_userid =", value, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridNotEqualTo(Integer value) {
            addCriterion("last_commit_userid <>", value, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridGreaterThan(Integer value) {
            addCriterion("last_commit_userid >", value, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_commit_userid >=", value, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridLessThan(Integer value) {
            addCriterion("last_commit_userid <", value, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridLessThanOrEqualTo(Integer value) {
            addCriterion("last_commit_userid <=", value, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridIn(List<Integer> values) {
            addCriterion("last_commit_userid in", values, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridNotIn(List<Integer> values) {
            addCriterion("last_commit_userid not in", values, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridBetween(Integer value1, Integer value2) {
            addCriterion("last_commit_userid between", value1, value2, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("last_commit_userid not between", value1, value2, "lastCommitUserid");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeIsNull() {
            addCriterion("last_commit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeIsNotNull() {
            addCriterion("last_commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeEqualTo(Date value) {
            addCriterion("last_commit_time =", value, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeNotEqualTo(Date value) {
            addCriterion("last_commit_time <>", value, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeGreaterThan(Date value) {
            addCriterion("last_commit_time >", value, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_commit_time >=", value, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeLessThan(Date value) {
            addCriterion("last_commit_time <", value, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_commit_time <=", value, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeIn(List<Date> values) {
            addCriterion("last_commit_time in", values, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeNotIn(List<Date> values) {
            addCriterion("last_commit_time not in", values, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeBetween(Date value1, Date value2) {
            addCriterion("last_commit_time between", value1, value2, "lastCommitTime");
            return (Criteria) this;
        }

        public Criteria andLastCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_commit_time not between", value1, value2, "lastCommitTime");
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